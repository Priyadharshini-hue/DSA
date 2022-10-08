/*
Index of First 1 in a Binary Sorted Infinite Array
Given an infinite sorted array consisting 0s and 1s. 
The problem is to find the index of first ‘1’ in that array. 
As the array is infinite, therefore it is guaranteed that number ‘1’ will be present in the array.

Example:
Input : arr[] = {0, 0, 1, 1, 1, 1} 
Output : 2
*/
class IndexOfFirstOneInfiniteSorted0And1 {
    static int searchIndexOfOne(int[] arr) {
        int start = 0, end = 1, index = -1;

        // To find the upper and lower bound
        while (0 == arr[end]) {
            start = end;
            end = end * 2;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // If 1 is present at mid, store the mid and ignore the right half
            if (arr[mid] == 1) {
                index = mid;
                end = end - 1;
            }
            // If 0 is present at mid, ignore the left half
            else {
                start = mid + 1;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 0, 1, 1, 1, 1, 1, 1, 1, 1 };

        System.out.println(searchIndexOfOne(arr));
    }
}