import java.util.Arrays;

/*
Given N piles of bananas, the ith pile has piles[i] bananas and H hours time until guards return (N < H). 
Find the minimum (S) bananas to eat per hour such that Koko can eat all the bananas within H hours. 
Each hour, Koko chooses some pile of bananas and eats S bananas from that pile. 
If the pile has less than S bananas, then she consumes all of them, 
and wont eat any more bananas during that hour. 
 */
public class KokoEatingBananas {
    static boolean solve(int[] piles, int mid, int h) {
        int timeHrs = 0, pileHr;

        for (int i = 0; i < piles.length; i++) {
            // divisible
            if (piles[i] % mid == 0) {
                pileHr = piles[i] / mid;
            } else {
                // not divisible
                pileHr = (piles[i] / mid) + 1;
            }
            timeHrs = timeHrs + pileHr;
            if (timeHrs > h) {
                return false;
            }
        }
        return true;
    }

    static int findMinimumBananas(int[] piles, int h) {

        int start = 1, end = Arrays.stream(piles).max().getAsInt(),
                ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (solve(piles, mid, h)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int piles[] = { 30, 11, 23, 4, 20 };
        int h = 5;

        System.out.println(findMinimumBananas(piles, h));
    }
}