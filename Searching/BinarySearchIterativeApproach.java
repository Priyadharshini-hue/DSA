/*
Binary search - Iterative method - O(log n) & O(1)
*/
class BinarySearchIterativeApproach {

    static int search(int[] arr, int elementToFind) {
        int start = 0;
        int end = arr.length - 1;

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
        int[] arr = { 2, 3, 4, 5, 6, 7, 8, 9 };
        int elementToFind = 5;
        System.out.println(search(arr, elementToFind));
    }
}
