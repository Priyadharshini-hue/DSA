import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    static void sort(int[] arr) {
        int temp;
        for (int j = 0; j < arr.length - 1; j++) {
            boolean flag = true;
            for (int i = 0; i < arr.length - j - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
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