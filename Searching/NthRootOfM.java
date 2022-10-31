public class NthRootOfM {
    static double mul(int number, int k) {
        double result = 1;
        for (int i = 1; i <= k; i++) {
            result = result * number;
        }
        return result;
    }

    static int findNthRootOfM(int x, int N) {
        int start = 1, end = x, mid;
        double res;

        while (start <= end) {
            mid = start + (end - start) / 2;

            res = mul(mid, N);

            if (x == res) {
                return mid;
            } else if (x < res) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int number = 4096;

        int N = 6;

        System.out.println(findNthRootOfM(number, N));
    }
}