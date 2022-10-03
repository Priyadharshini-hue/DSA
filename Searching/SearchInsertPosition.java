/*
Search insert position of K in a sorted array
Given a sorted array Arr[](0-index based) consisting of N distinct integers and an integer k,
the task is to find the index of k, if its present in the array Arr[]. 
Otherwise, find the index where k must be inserted to keep the array sorted.

Example 1:
Input:
N = 4
Arr = {1, 3, 5, 6}
k = 5
Output: 2
Explaination: Since 5 is found at index 2 as Arr[2] = 5, the output is 2.

Example 2:
Input:
N = 4
Arr = {1, 3, 5, 6}
k = 2
Output: 1
Explaination: Since 2 is not present in the array but can be inserted at index 1 to make the array sorted.
 */
class SearchInsertPosition {

    static int search(int[] arr, int element) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if the element is present at mid
            if (arr[mid] == element) {
                return mid;
            }
            // If the element is greater than left half, then ignore left half
            else if (arr[mid] < element) {
                start = mid + 1;
            }
            // If the element is lesser than right half, then ignore right half
            else {
                end = mid - 1;
            }
        }

        // The index to be inserted is start
        return start;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 6 };
        int element = 0;
        System.out.print(search(arr, element));
    }
}