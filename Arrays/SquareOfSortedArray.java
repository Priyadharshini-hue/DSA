import java.util.Scanner;

public class SquareOfSortedArray {
    // O(n) & O(n)
    static int[] findSortedSquareArray(int[] arr) {
        int[] sortedSquaredArray = new int[arr.length];
        int leftPtr = 0, rightPtr = arr.length - 1, lastIndex = rightPtr;

        while (leftPtr <= rightPtr) {
            if (arr[leftPtr] * arr[leftPtr] > arr[rightPtr] * arr[rightPtr]) {
                sortedSquaredArray[lastIndex] = arr[leftPtr] * arr[leftPtr];
                leftPtr++;
            } else {
                sortedSquaredArray[lastIndex] = arr[rightPtr] * arr[rightPtr];
                rightPtr--;
            }
            lastIndex--;
        }
        return sortedSquaredArray;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int[] sortedSquaredArray = findSortedSquareArray(arr);

        for (int element : sortedSquaredArray) {
            System.out.print(element + " ");
        }
    }
}