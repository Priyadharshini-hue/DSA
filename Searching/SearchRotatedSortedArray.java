/*
Search in Rotated Sorted Array
Given a list of unique integers which are sorted but rotated at some pivot.
Given a target value and have to find its index in the list.
-1 if the target value is not present.
Example:
List: [4, 5, 6, 7, 1, 2, 3]
Target value: 6
Resultant index: 2
 */
class SearchRotatedSortedArray {
    static int search(int[] arr, int target) {
        // Initialize start and end
        int start = 0, end = arr.length - 1;

        // Binary search
        while (start <= end) {

            int mid = start + (end - start) / 2;

            // Check if the target is present in mid element.
            if (arr[mid] == target) {
                return mid;
            }

            // Check if left half is sorted (ascending order)
            if (arr[start] <= arr[mid]) {
                // Check if the target is less than left half, then ignore left half
                if (arr[mid] > target) {
                    start = mid + 1;
                }
                // If the target is within the range
                else {
                    end = mid - 1;
                }
            }
            // If the right half is sorted
            else {
                // Check if the target is greater than right half, then ignore right half
                if (target > arr[mid]) {
                    end = mid - 1;
                }
                // If the target is within the range
                else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 8, 9, 1, 2 };
        int target = 1;
        System.out.println(search(arr, target));
    }
}