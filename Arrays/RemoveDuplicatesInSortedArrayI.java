import java.util.Scanner;

public class RemoveDuplicatesInSortedArrayI {
    // O(n)
    static void removeDuplicate(int[] arr) {
        // sorted and non-sorted
        int index = 2;
        for (int i = 2; i < arr.length; i++) {
            if (arr[index - 2] != arr[i]) {
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