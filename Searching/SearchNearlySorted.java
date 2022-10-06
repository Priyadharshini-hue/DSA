/*
Given a nearly / mostly sorted array such that each of the n elements may be misplaced by 
no more than one position from the correct sorted order, search a given element in it efficiently. 
If the element is not present in the array.

Input: arr[] =  {10, 3, 40, 20, 50, 80, 70}, key = 40
Output: 2 
Explanation: Output is index of 40 in given array i.e. 2

Input: arr[] =  {10, 3, 40, 20, 50, 80, 70}, key = 90
Output: -1
Explanation: -1 is returned to indicate the element is not present
*/
class SearchNearlySorted {

    static int search(int[] arr, int target) {

        int start = 0, end = arr.length;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // Check if the target is present at mid
            if (arr[mid] == target) {
                return mid;
            }
            // If the target is present at the mid's previous element and mid-1 is not
            // lesser than start
            else if (start <= mid - 1 && arr[mid - 1] == target) {
                return mid - 1;
            }
            // If the target is present at the mid's next element and mid+1 is not greater
            // than end
            else if (mid + 1 <= end && arr[mid + 1] == target) {
                return mid + 1;
            }
            // If the target is greater than the mid three elements, ignore left half
            else if (arr[mid] < target) {
                start = mid + 2;
            }
            // If the target is leser than the mid three elements, ignore right half
            else {
                end = mid - 2;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 3, 5, 4, 7, 6, 8, 9 };
        int target = 8;

        System.out.println(search(arr, target));
    }
}