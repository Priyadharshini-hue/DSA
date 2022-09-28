/*
Suppose an array of length n sorted in ascending order is rotated between 1 and n times. 
For example, the array arr = [0,1,2,4,5,6,7] might become:
[4,5,6,7,0,1,2] if it was rotated 4 times.
[0,1,2,4,5,6,7] if it was rotated 7 times.
*/
class FindMinimumRotatedSortedArray {
    static int find(int[] arr) {

        // If the given array is sorted
        if (arr[0] < arr[arr.length - 1]) {
            return arr[0];
        }
        // If the given array's length is one
        if (arr.length == 1) {
            return arr[0];
        }

        // Binary search
        int start = 0, end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            // Check if the adjacent elements is not in ascending order
            if (arr[mid] > arr[mid + 1]) {
                return arr[mid + 1];
            }
            if (arr[mid] < arr[mid - 1]) {
                return arr[mid];
            }

            // If the right portion is sorted, increment start as mid+1
            if (arr[start] <= arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = { 8, 9, 10, 1, 2, 4 };

        System.out.println(find(arr));
    }
}