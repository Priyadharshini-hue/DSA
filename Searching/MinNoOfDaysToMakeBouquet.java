/*
You are given an integer array bloomDay, an integer m and an integer k.
You want to make m bouquets. 
To make a bouquet, you need to use k adjacent flowers from the garden.
The garden consists of n flowers, the ith flower will bloom in the bloomDay[i] 
and then can be used in exactly one bouquet.
Return the minimum number of days you need to wait to be able to make m bouquets from the garden. 
If it is impossible to make m bouquets return -1.
*/
import java.util.Arrays;

public class MinNoOfDaysToMakeBouquet {
    static boolean findDays(int[] arr, int m, int k, int mid) {
        int flowers = 0, bouquets = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= mid) {
                flowers++;
                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }
            } else {
                flowers = 0;
            }
            if (bouquets == m) {
                return true;
            }
        }
        return false;
    }

    static int minDays(int[] arr, int m, int k) {

        // base case
        if (arr.length < m * k) {
            return -1;
        }

        int max = Arrays.stream(arr).max().getAsInt(),
                min = Arrays.stream(arr).min().getAsInt();

        int start = min, end = max;
        int res = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (findDays(arr, m, k, mid) == true) {
                res = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 7, 7, 7, 12, 7, 7 };
        int m = 2, k = 3;

        System.out.println(minDays(arr, m, k));
    }
}