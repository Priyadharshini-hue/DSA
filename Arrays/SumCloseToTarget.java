import java.util.Arrays;
import java.util.Scanner;

public class SumCloseToTarget {
    static void findTriplets(int[] arr, int target) {
        Arrays.sort(arr);
        int smallDifference = Integer.MAX_VALUE, sum = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            int leftPtr = i + 1, rightPtr = arr.length - 1;
            while (leftPtr < rightPtr) {
                sum = arr[i] + arr[leftPtr] + arr[rightPtr];
                int currentDifference = target - sum;
                if (currentDifference == 0) {
                    System.out.println(sum);
                    return;
                }
                if (Math.abs(smallDifference) > Math.abs(currentDifference)) {
                    smallDifference = currentDifference;
                }
                while (leftPtr < rightPtr && arr[leftPtr] == arr[leftPtr + 1]) {
                    leftPtr++;
                }
                while (leftPtr < rightPtr && arr[rightPtr] == arr[rightPtr - 1]) {
                    rightPtr--;
                }
                if (currentDifference > 0) {
                    leftPtr++;
                } else {
                    rightPtr--;
                }
            }
            while (i + 1 < arr.length && arr[i] == arr[i + 1]) {
                i++;
            }
        }
        System.out.println(target - smallDifference);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int target = s.nextInt();
        findTriplets(arr, target);
    }
}