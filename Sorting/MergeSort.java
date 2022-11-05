import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    static void sort(int[] arr, int start, int mid, int end) {
        int[] leftArray = new int[mid - start + 1];
        int[] rightArray = new int[end - mid];

        for (int i = 0; i < leftArray.length; i++) {
            leftArray[i] = arr[start + i];
        }

        for (int i = 0; i < rightArray.length; i++) {
            rightArray[i] = arr[mid + 1 + i];
        }

        int k = start, i = 0, j = 0;

        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] < rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < leftArray.length) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < rightArray.length) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (start) + (end - start) / 2;

            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);

            sort(arr, start, mid, end);
        }
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int length = s.nextInt();
            int[] arr = new int[length];

            for (int i = 0; i < length; i++) {
                arr[i] = s.nextInt();
            }

            mergeSort(arr, 0, arr.length - 1);

            System.out.println(Arrays.toString(arr));
        }
    }
}
