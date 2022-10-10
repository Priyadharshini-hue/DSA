/**
 * KthSortedElement
 * Given two sorted arrays A and B, and another value k
 * print the kth element of the resultant sorted array.
 * A: [1, 2, 3, 4, 5, 6]
 * B: [3, 4, 4, 5, 6, 6]
 * Result: [1, 2, 3, 3, 4, 4, 4, 5, 5, 6, 6, 6]
 * 3rd element in the array is 3.
 * 6th element in the array is 4.
 */
public class KthSortedElement {

    static int searchForKthElement(int[] arr1, int[] arr2, int arr1Start, int arr2Start, int arr1End, int arr2End,
            int k) {

        // If the given k is greater than the arrays sizes or less than 1
        if ((arr1End + arr2End) < k || k < 1) {
            return -1;
        }

        // If the first array size is greater than second array size, exchange the
        // arrays
        if (arr1End > arr2End) {
            return searchForKthElement(arr2, arr1, arr2Start, arr1Start, arr2End, arr1End, k);
        }

        // If the first array size is zero, return the kth element
        if (arr1End == 0) {
            return arr2[arr2Start + k - 1];
        }

        // If the k reaches 1, check for the minimum in the two arrays
        if (k == 1) {
            return Math.min(arr1[arr1Start], arr2[arr2Start]);
        }

        // k/2 -> to compare the elements in two arrays
        int i = Math.min(arr1End, k / 2);
        int j = Math.min(arr2End, k / 2);

        // Ignore the smaller array elements
        if (arr1[arr1Start + i - 1] > arr2[arr2Start + j - 1]) {
            return searchForKthElement(arr1, arr2, arr1Start, arr2Start + j, arr1End, arr2End - j, k - j);
        } else {
            return searchForKthElement(arr1, arr2, arr1Start + i, arr2Start, arr1End - i, arr2End, k - i);
        }

    }

    public static void main(String[] args) {
        int arr1[] = { 2, 3, 6, 7, 9 };
        int arr2[] = { 1, 4, 8, 10 };
        int k = 1;

        System.out.println(searchForKthElement(arr1, arr2, 0, 0, arr1.length, arr2.length, k));
    }
}