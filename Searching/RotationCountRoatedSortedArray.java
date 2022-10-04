/*
Rotation Count in Rotated Sorted array
Given an ascending sorted rotated array Arr of distinct integers of size N. 
The array is right rotated K times. Find the value of K.
Input:
N = 5
Arr[] = {5, 1, 2, 3, 4}
Output: 1
Explanation: The given array is 5 1 2 3 4. 
The original sorted array is 1 2 3 4 5. 
We can see that the array was rotated 1 times to the right.
*/
public class RotationCountRoatedSortedArray {

    static int findRotationCount(int[] arr) {

        int start = 0, end = arr.length - 1;

        // Check if the array is rotated or not
        // If not, return 0
        if (arr[start] < arr[arr.length - 1]) {
            return 0;
        }

        while (start < end) {
            int mid = start + (end - start) / 2;

            // Check if the mid is greater than its next element,
            // then return mid+1
            if (arr[mid] > arr[mid + 1]) {
                return mid + 1;
            }

            // Check if the mid is greater than its previous element,
            // then return mid
            if (arr[mid + 1] < arr[mid]) {
                return mid;
            }

            // Check if the left half is sorted, then ignore the left half
            if (arr[start] < arr[mid]) {
                start = mid + 1;
            }
            // If the left half is not sorted, then ignore the right half
            else {
                end = mid - 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };

        System.out.println(findRotationCount(arr));
    }
}