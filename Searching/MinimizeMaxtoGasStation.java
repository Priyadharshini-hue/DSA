public class MinimizeMaxtoGasStation {
    public static double findSmallestMaxDist(int stations[], int K) {
        int count;
        int N = stations.length;
        double left = 1;
        double right = stations[N - 1] - stations[0];
        while (right - left > 1e-6) { // left - right < 1e-6 TLE
            double mid = (left + right) / 2;
            count = 0;
            for (int i = 0; i < N - 1; i++) {
                count += (int) ((stations[i + 1] - stations[i]) / mid);
            }
            if (count > K) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 6, 12, 19, 33, 44, 67, 72, 89, 95 };
        int k = 2;
        System.out.printf("%.2f", (findSmallestMaxDist(arr, k)));
    }
}
