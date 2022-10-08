/*
Maximum Element in a Bitonic Array
A bitonic array is an array that is first increasing and then decreasing. 
Given an array of numbers which is first increasing and then decreasing, find the maximum value in the array.
Input: a[] = {2, 4, 6, 8, 10, 3, 1}
Output: 10
Input: a[] = {10, 20, 30, 40, 50}
Output: 50
Input: a[] = {100, 80, 60, 40, 20, 0}
Output: 100
*/
class MaximumElementBitonicArray {
    static int searchMaximumElementBitonicArray(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // If the mid is greater than the adjacent elements, return mid
            // handles base case as well, if the greater number is at start or end
            if (((mid == end) || (arr[mid] > arr[mid + 1])) && ((mid == 0) || (arr[mid] > arr[mid - 1]))) {
                return mid;
            }

            // Decreasing order, ignore right half
            if ((arr[mid - 1] > arr[mid]) && (arr[mid] > arr[mid + 1])) {
                end = mid - 1;
            }
            // Increasing order, ignore left half
            else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 100, 80, 60, 40, 20, 0 };

        System.out.println(searchMaximumElementBitonicArray(arr));
    }
}
