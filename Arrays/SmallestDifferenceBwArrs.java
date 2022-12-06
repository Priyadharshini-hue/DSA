import java.util.Arrays;
import java.util.Scanner;

public class SmallestDifferenceBwArrs {
    // O(m log m) + O(n log n)
    static void smallestDifferenceBwArrs(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0, j = 0, smallestDifference = Integer.MAX_VALUE,
                left = 0, right = 0;

        while (i < arr1.length && j < arr2.length) {
            if ((Math.abs(arr1[i] - arr2[j])) < smallestDifference) {
                smallestDifference = Math.abs(arr1[i] - arr2[j]);
                left = arr1[i];
                right = arr2[j];
            }
            if (arr1[i] > arr2[j]) {
                j++;
            } else {
                i++;
            }
        }
        System.out.println(smallestDifference + " --> " + left + " " + right);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = s.nextInt();
        }
        smallestDifferenceBwArrs(arr1, arr2);
    }
}