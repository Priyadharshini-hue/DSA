/*
Search Rotated Sorted Array
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

        int start = 0, end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // Check if the target is present at mid
            if (arr[mid] == target) {
                return mid;
            }

            // Check if the left half is sorted
            if (arr[start] <= arr[mid]) {
                // Check if the target is between the start(includes) and mid element
                if ((arr[start] <= target) && (target < arr[mid])) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            // If the right half is sorted
            else {
                // Check if the target is between the mid and end(includes) element.
                if ((arr[mid] < target) && (target <= arr[end])) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
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