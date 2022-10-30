// is perfect square-- limit = 1to10000.
public class SquareRoot {
    static int findSquareRoot(int x) {
        if (x == 0) {
            return 0;
        }
        int start = 1, end = x / 2, mid, res = 1;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (x == mid * mid) {
                return mid;
            } else if (x < mid * mid) {
                end = mid - 1;
            } else {
                start = mid + 1;
                res = mid;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int number = 15; // 3

        System.out.println(findSquareRoot(number));
    }
}