/*
Search an element in a reverse sorted array
Given an array arr[] sorted in decreasing order, and an integer X, 
the task is to check if X is present in the given array or not. 
If X is present in the array, print its index ( 0-based indexing). 
Otherwise, print -1.

Ex:
Input: arr[] = {5, 4, 3, 2, 1}, X = 4
Output: 1
Explanation: Element X (= 4) is present at index 1.
Therefore, the required output is 1.
*/
class SearchReverseSorted {
    static int search(int[] arr, int elementToFind) {
        int start = 0, end = arr.length;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if the elementToFind is present at mid
            if (arr[mid] == elementToFind) {
                return mid;
            }
            // Check if the elementToFind is less than the left half, then ignore the left
            // half
            else if (arr[mid] < elementToFind) {
                end = mid - 1;
            }
            // If the elementToFind is greater than the right half, then ignore the right
            // half
            else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };

        int elementToFind = 4;

        System.out.println(search(arr, elementToFind));
    }
}