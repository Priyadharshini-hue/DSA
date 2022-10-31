/*
Given an array arr[] of N weights. Find the least weight capacity of a boat to ship all weights within D days.
The ith weight has a weight of arr[i]. Each day, we load the boat with weights given by arr[i].
We may not load more weight than the maximum weight capacity of the ship.
Note: You have to load weights on the boat in the given order. 
*/
import java.util.Arrays;

public class CapacityToShipPackagesWithinDays {
    static boolean find(int[] weights, int days, int mid) {
        int dayCount = 1, temp = 0;

        for (int i = 0; i < weights.length; i++) {
            temp = temp + weights[i];
            if (temp > mid) {
                dayCount++;
                temp = weights[i];
            }
            if (dayCount > days) {
                return false;
            }
        }
        return true;
    }

    static int shipWithinDays(int[] weights, int days) {
        int start = Arrays.stream(weights).max().getAsInt(),
                end = Arrays.stream(weights).sum(), result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (find(weights, days, mid)) {
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] weights = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int days = 5;

        System.out.println(shipWithinDays(weights, days));
    }
}