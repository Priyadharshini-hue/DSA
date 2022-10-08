/*
Find the position of an element in a sorted infinite array
Given that the array is sorted, we can apply binary search to find the element. 
The only problem is that the array is infinite so we don’t know the bounds of the array. 
*/
class SearchInfiniteSortedArray {
    static int search(int[] arr, int elementToFind) {
        int start = 0, end = 1;

        // To set the lower and upper bounds
        while (elementToFind > arr[end]) {
            start = end;
            // To avoid indexOutOfBoundsException
           // if (end * 2 > arr.length - 1) {
                end = end * 2;
            // } else {
                // end = arr.length - 1;
            // }
        }

        while (start <= end) {
            int mid = start + (end - start) / 2; // avoid overflow of 32-big integer.

            // Check if elementToFind is present at mid
            if (arr[mid] == elementToFind) {
                return mid;
            }
            // If elementToFind is greater than left half, then ignore left half
            else if (arr[mid] < elementToFind) {
                start = mid + 1;
            }
            // If elementToFind is less than the right half, then ignore right half
            else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 8, 10, 11, 12, 19, 22, 25, 27, 29, 42 };
        int target = 19;
        System.out.print(search(arr, target));
    }
}