import java.util.Arrays;
import java.util.Scanner;

public class MoveZerosToEnd {
    static void moveZerosToEnd(int[] arr) {
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                break;
            } else {
                k++;
            }
        }
        int index = k + 1;
        while (index < arr.length && k < arr.length) {
            if (arr[index] != 0) {
                int temp = arr[k];
                arr[k] = arr[index];
                arr[index] = temp;
                k++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        moveZerosToEnd(arr);
    }
}