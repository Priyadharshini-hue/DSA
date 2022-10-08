/*
Order not known search/ Order-agnostic Binary Search
Given a sorted array of numbers, find if a given number ‘key’ is present in the array. 
Though we know that the array is sorted, we don’t know if it’s sorted in ascending or descending order. .   
*/
class OrderNotKnownSearch {
    static int search(int[] arr, int elementToFind) {

        int start = 0, end = arr.length - 1;

        // Check if the array is in ascending order
        if (arr[0] < arr[arr.length - 1]) {

            while (start <= end) {
                int mid = start + (end - start) / 2;

                // Check if the elementToFind is present at mid
                if (arr[mid] == elementToFind) {
                    return mid;
                }
                // If the elementToFind is greater than left half, then ignore it.
                else if (arr[mid] < elementToFind) {
                    start = mid + 1;
                }
                // If the elementToFind is lesser than right half, then ignore it.
                else {
                    start = mid - 1;
                }
            }
        }
        // If the array is in descending order
        else {
            while (start <= end) {

                int mid = start + (end - start) / 2;

                // Check if the elementToFind is present at mid
                if (arr[mid] == elementToFind) {
                    return mid;
                }
                // If the elementToFind is greater than left half, then ignore the right half.
                else if (arr[mid] < elementToFind) {
                    end = mid - 1;
                }
                // If the elementToFind is lesser than right half, then ignore the left half.
                else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 3, 2, 1, 0 };

        int elementToFind = 3;

        System.out.print(search(arr, elementToFind));
    }
}