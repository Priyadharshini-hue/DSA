/*
Binary Search - O(log n) & O(log n)
*/
class BinarySearchRecursiveApproach {

    static int search(int[] arr, int start, int end, int elementToFind) {

        int mid = start + (end - start) / 2;

        // Check if the elementToFind is present at mid
        if (arr[mid] == elementToFind) {
            return mid;
        }
        // If the elementToFind is greater than left half, then ignore the left half
        else if (arr[mid] < elementToFind) {
            search(arr, mid + 1, end, elementToFind);
        }
        // If the elementToFind is less than right half, then ignore the right half
        else {
            search(arr, start, mid - 1, elementToFind);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6, 7, 8, 9 };
        int elementToFind = 5;
        System.out.println(search(arr, 0, arr.length - 1, elementToFind));
    }
}
