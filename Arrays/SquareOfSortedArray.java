import java.util.Scanner;

//array sorted already
public class SquareOfSortedArray {
    // O(n) & O(n)
    static void squareOfSortedArray(int[] arr) {
        int[] sortedSquaredArray = new int[arr.length];
        int leftPtr = 0, rightPtr = arr.length - 1, index = rightPtr;
        while (leftPtr <= rightPtr) {
            if (Math.abs(arr[leftPtr]) < Math.abs(arr[rightPtr])) {
                sortedSquaredArray[index--] = arr[rightPtr] * arr[rightPtr];
                rightPtr--;
            } else {
                sortedSquaredArray[index--] = arr[leftPtr] * arr[leftPtr];
                leftPtr++;
            }
        }
        for (int element : sortedSquaredArray) {
            System.out.print(element + " ");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        squareOfSortedArray(arr);
    }
}