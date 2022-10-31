/*
Given an array of integers nums and an integer threshold, 
we will choose a positive integer divisor, divide all the array by it, 
and sum the division's result. 
Find the smallest divisor such that the result mentioned above is less than or equal to threshold.
Each result of the division is rounded to the nearest integer greater than or equal to that element. 
(For example: 7/3 = 3 and 10/2 = 5).
*/
import java.util.Arrays;

public class SmallestDivisorThanThershold {
    static boolean solve(int[] arr, int threshold, int mid) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            // divisible
            if (arr[i] % mid == 0) {
                count = count + (arr[i] / mid);
            } else {
                // not divisible
                count = count + ((arr[i] / mid) + 1);
            }

            if (count > threshold) {
                return false;
            }
        }
        return true;
    }

    static int smallDivisor(int[] nums, int threshold) {
        int start = 1, end = Arrays.stream(nums).max().getAsInt(),
                result = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (solve(nums, threshold, mid)) {
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 44, 22, 33, 11, 1 };
        int threshold = 5;

        System.out.println(smallDivisor(nums, threshold));
    }
}