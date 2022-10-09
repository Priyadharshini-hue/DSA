/*
Search in Bitonic Array
Given a bitonic array of numbers and a target value, 
find the index of the target value in the bitonic array in O(log n) time.
Input :  arr[] = {2, 4, 8, 10, 7, 6, 1}, target = 6
Output : 5
Input:  a[] = {2, 4, 6, 8, 10, 5, 3, 1}, target = 30
Output: -1 (target not found)
*/
public class SearchBitonicArray {
    static int findMaxElement(int[] arr) {
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

    static int search(int[] arr, int target) {
        int maxIndex = findMaxElement(arr);
        int targetIndex = -1;

        // If the target is the maximum element
        if (arr[maxIndex] == target) {
            return maxIndex;
        }
        // If the target is grater than the maximum element
        else if (arr[maxIndex] < target) {
            return -1;
        } else {
            // Binary search for ascending order
            targetIndex = ascendingBinarySearch(arr, 0, maxIndex - 1, target);
            if (targetIndex != -1) {
                return targetIndex;
            }
            // Binary search for descending order
            targetIndex = descendingBinarySearch(arr, maxIndex + 1, arr.length - 1, target);
            if (targetIndex != -1) {
                return targetIndex;
            }
        }
        return targetIndex;
    }

    static int ascendingBinarySearch(int arr[], int low, int high, int key) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key)
                return mid;
            if (arr[mid] > key)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    static int descendingBinarySearch(int arr[], int low, int high, int key) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key)
                return mid;
            if (arr[mid] < key)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        int target = 11;

        System.out.println(search(arr, target));
    }
}