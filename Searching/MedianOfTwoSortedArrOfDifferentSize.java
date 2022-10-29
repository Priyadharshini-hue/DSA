public class MedianOfTwoSortedArrOfDifferentSize {
    static double findMedian(int[] arr1, int[] arr2, int m, int n) {

        if (n < m) {
            return findMedian(arr2, arr1, n, m);
        }
        int start = 0, end = m, midPosition = (m + n + 1) / 2;
        while (start <= end) {
            int cut1 = (start + end) / 2;
            int cut2 = midPosition - cut1;

            int l1 = cut1 > 0 ? arr1[cut1 - 1] : Integer.MIN_VALUE;
            int l2 = cut2 > 0 ? arr2[cut2 - 1] : Integer.MIN_VALUE;
            int r1 = cut1 < m ? arr1[cut1] : Integer.MAX_VALUE;
            int r2 = cut2 < n ? arr2[cut2] : Integer.MAX_VALUE;

            if (l1 <= r2 && l2 <= r1) {
                if ((m + n) % 2 == 0) {
                    return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
                } else {
                    return Math.max(l1, l2);
                }
            } else if (l1 > r2) {
                end = cut1 - 1;
            } else {
                start = cut1 + 1;
            }

        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr1 = {-5, 3, 6, 12, 15};
        int[] arr2 = {-12, -10, -6, -3, 4, 10};

        System.out.println(findMedian(arr1, arr2, arr1.length, arr2.length));
    }
}
