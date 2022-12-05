package Arrays.SlidingWindow;

import java.util.Scanner;

public class LongestSubarraywithOnesafterReplacement {
    static void longestSubarraywithOnesafterReplacement(int[] arr, int k) {
        int windowStart = 0, zeroCount = 0, length = 0;

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            if (arr[windowEnd] == 0) {
                zeroCount++;
            }
            while (((zeroCount)) > k) {
                if (arr[windowStart] == 0) {
                    zeroCount--;
                }
                windowStart++;
            }
            length = Math.max((windowEnd - windowStart + 1), length);
        }
        System.out.println(length);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int k = s.nextInt();
        longestSubarraywithOnesafterReplacement(arr, k);
    }
}