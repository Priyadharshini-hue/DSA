import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

    static void sort(int[] arr) {
        int key;
        for (int i = 1; i < arr.length; i++) {
            key = arr[i];
            int j = i - 1;

            while (0 <= j && key < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int length = s.nextInt();
            int[] arr = new int[length];

            for (int i = 0; i < length; i++) {
                arr[i] = s.nextInt();
            }

            sort(arr);

            System.out.println(Arrays.toString(arr));
        }
    }
}