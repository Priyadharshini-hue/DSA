import java.util.Scanner;

public class RemoveDuplicatesInSortedArray {
    //O(n)
    static void removeDuplicate(int[] arr) {
        // sorted and non-sorted
        int index = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[index - 1] != arr[i]) {
                arr[index] = arr[i];
                index++;
            }
        }
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        removeDuplicate(arr);
    }
}