import java.util.Arrays;
import java.util.Scanner;

public class ApplyOperations {
    static int[] applyOperations(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == arr[i] && arr[i] != 0) {
                arr[i - 1] = arr[i - 1] * 2;
                arr[i] = 0;
            }
        }

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }
        while (index!=arr.length) {
            arr[index]=0;
            index++;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println(Arrays.toString(applyOperations(arr)));
    }
}