import java.util.Scanner;

public class IsSorted {
    static boolean isArraySorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                return false;
            }
        }
        return true;
    }

    static boolean isArraySortedAndRotated(int[] arr) {
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                count++;
            }
        }
        if (arr[0] < arr[arr.length - 1]) {
            count++;
        }
        return count<=1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println(isArraySortedAndRotated(arr));
        System.out.println(isArraySorted(arr));
    }
}