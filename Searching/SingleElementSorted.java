/*
Given a sorted array arr[] of size N. Find the element that appears only once in the array. 
All other elements appear exactly twice. 

Input:
N = 11
arr[] = {1, 1, 2, 2, 3, 3, 4, 50, 50, 65, 65}
Output: 4
Explanation: 4 is the only element that appears exactly once
*/
class SingleElementSorted {
    static int searchSingleElement(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // If the start equals end, return the element
            if (start == end) {
                return arr[start];
            }
            // If the mid is even
            else if (mid % 2 == 0) {
                // If even mid equals mid's next element, ignore left half
                if (arr[mid] == arr[mid + 1]) {
                    start = mid + 2;
                }
                // Ignore the right half
                else {
                    end = mid;
                }
            }
            // If the mid is odd
            else {
                // If the odd mid equals mid's next element, ignore
                if (arr[mid] == arr[mid + 1]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 3, 4, 4, 50, 50, 65, 65 };

        System.out.println(searchSingleElement(arr));
    }
}