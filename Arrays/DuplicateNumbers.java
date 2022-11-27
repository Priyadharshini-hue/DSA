
/*
Find the duplicate numbers in an array (in place)
 */
import java.util.Scanner;

class DuplicateNumbers {

    // O(n) & O(1)
    static int removeduplicate(int[] arr, int length) {
        int index = 1;

        for (int i = 1; i < length; i++) {
            if (arr[index - 1] != arr[i]) {
                arr[index] = arr[i];
                index++;
            }
        }
        return index;
    }

    public static int removeElement(int[] arr, int val) {
        // edge case
        if (val > arr[arr.length - 1] || val < arr[0]) {
            return arr.length;
        }

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[index] != val) {
                arr[index] = arr[i];
                index++;
            }
        }
        return index;
    }

    static int removeduplicate2(int[] arr, int length) {
        // edge case
        if (length < 3) {
            return length;
        }

        int index = 2;
        for (int i = 2; i < length; i++) {
            if (arr[index - 2] != arr[i]) {
                arr[index] = arr[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        // remove duplicates
        System.out.println(removeduplicate(arr, arr.length));

        // remove the given element
        System.out.println(removeElement(arr, 3));

        // allow two duplicates and remove the rest
        System.out.println(removeduplicate2(arr, arr.length));
    }
}
