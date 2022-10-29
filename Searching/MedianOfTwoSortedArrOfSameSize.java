public class MedianOfTwoSortedArrOfSameSize {
    static int median(int[] arr, int start, int end) {
        int length = end - start + 1, mid = start + ((end - start) / 2);
        //even
        if (length % 2 == 0) {
            return (arr[mid] + arr[mid + 1]) / 2;
        } else {
            //odd
            return arr[mid];
        }
    }

    static double findMedian(int[] arr1, int[] arr2, int start1, int end1, int start2, int end2) {

        // base case
        if (end1 - start1 == 1) {
            return (double) (((Math.max(arr1[start1], arr2[start2])) + (Math.min(arr1[end1], arr2[end2]))) / 2);
        }

        int m1 = median(arr1, start1, end1);
        int m2 = median(arr2, start2, end2);

        if (m1 == m2) {
            return m1;
        } else if (m1 < m2) {
            return findMedian(arr1, arr2, start1 + ((end1 + start1+1) / 2), end1, start2, start2 + ((end2 + start2+1) / 2));
        } else {
        return    findMedian(arr1, arr2, start1, start1 + ((end1 + start1+1) / 2), start2 + ((end2 + start2+1) / 2), end2);
        }

    }

    public static void main(String[] args) {
        int arr1[] = {2, 3, 6, 7};
        int arr2[] = {1, 4, 8, 10};

        System.out.println(findMedian(arr1, arr2, 0, arr1.length-1, 0, arr2.length-1));
    }
}
