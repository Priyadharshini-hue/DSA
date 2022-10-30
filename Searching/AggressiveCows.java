import java.util.Arrays;

public class AggressiveCows {
    static boolean findLargestMinimumDistance(int[] stalls, int cows, int mid) {
        int cowsCount = 1, cowsPosition = stalls[0];

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - cowsPosition >= mid) {
                cowsCount++;
                cowsPosition = stalls[i];
            }
        }
        if (cowsCount >= cows) {
            return true;
        }
        return false;
    }

    static int findAggressiveCows(int[] stalls, int cows) {
        int start = 1, max = Arrays.stream(stalls).max().getAsInt();
        int end = max - stalls[0], result = 0;
        Arrays.sort(stalls);

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (findLargestMinimumDistance(stalls, cows, mid)) {
                start = mid + 1;
                result = mid;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] stalls = { 1, 2, 8, 4, 9 };
        int cows = 3;

        System.out.println(findAggressiveCows(stalls, cows));
    }
}
