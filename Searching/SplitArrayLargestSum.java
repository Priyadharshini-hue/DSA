/*
Given an integer array nums and an integer k, split nums into k non-empty subarrays such that the largest sum of any subarray is minimized.
Return the minimized largest sum of the split.
A subarray is a contiguous part of the array.
*/
import java.util.Arrays;

public class SplitArrayLargestSum {
    static boolean findSubArray(int[] nums, int k, int mid) {
        int sum = 0, subArraysCount = 1;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if (sum > mid) {
                sum = nums[i];
                subArraysCount++;
            }
            if (subArraysCount > k) {
                return false;
            }
        }
        return true;
    }

    static int spiltArray(int[] nums, int k) {
        int result = 0, start = Arrays.stream(nums).max().getAsInt(),
                end = Arrays.stream(nums).sum();

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (findSubArray(nums, k, mid)) {
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = { -4, -2, 1, -3 };
        int k = 2;

        System.out.println(spiltArray(nums, k));
    }
}