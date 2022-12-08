import java.util.Arrays;
import java.util.Scanner;

public class ZeroSum {
    static void findTriplets(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            int leftPtr = i + 1, rightPtr = arr.length - 1;
            while (leftPtr < rightPtr) {
                int sum = arr[i] + arr[leftPtr] + arr[rightPtr];
                if (sum == 0) {
                    System.out.println(arr[i] + " " + arr[leftPtr] + " " + arr[rightPtr]);
                    while (leftPtr < rightPtr && arr[leftPtr] == arr[leftPtr + 1]) {
                        leftPtr++;
                    }
                    while (leftPtr < rightPtr && arr[rightPtr] == arr[rightPtr - 1]) {
                        rightPtr--;
                    }
                } else if (sum < 0) {
                    leftPtr++;
                } else {
                    rightPtr--;
                }
                leftPtr++;
                rightPtr--;
            }
            while (i + 1 < arr.length && arr[i + 1] == arr[i]) {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        findTriplets(arr);
    }
}