
/*
Given a sorted array arr containing n elements with possibly duplicate elements, 
the task is to find indexes of first and last occurrences of an element x in the given array.

Example 1:
Input:
n=9, x=5
arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 }
Output:  2 5

Example 2:
Input:
n=9, x=7
arr[] = { 1, 3, 5, 5, 5, 5, 7, 123, 125 }
Output:  6 6  
 */
import java.util.ArrayList;

class FirstAndLastOccurrenceOfK {

    static ArrayList<Long> search(long[] arr, int elementToFind) {

        // Initialize indexList, startIndex and endIndex
        ArrayList<Long> indexList = new ArrayList<>();
        long startIndex = -1, endIndex = -1;

        // To Find the start index of elementToFind
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if the elementToFind is present at mid
            // then store the index in startIndex and ignore the right half
            if (arr[mid] == elementToFind) {
                startIndex = mid;
                end = mid - 1;
            }
            // If the elementToFind is greater than left half, then ignore left half
            else if (arr[mid] < elementToFind) {
                start = mid + 1;
            }
            // If the elementToFind is lesser than right half, then ignore right half
            else {
                end = mid - 1;
            }
        }
        indexList.add(startIndex);

        // To Find the end index of elementToFind
        start = 0;
        end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if the elementToFind is present at mid
            // then store the index in endIndex and ignore the left half
            if (arr[mid] == elementToFind) {
                endIndex = mid;
                start = mid + 1;
            }
            // If the elementToFind is greater than left half, then ignore left half
            else if (arr[mid] < elementToFind) {
                start = mid + 1;
            }
            // If the elementToFind is lesser than right half, then ignore right half
            else {
                end = mid - 1;
            }
        }
        indexList.add(endIndex);

        return indexList;
    }

    public static void main(String[] args) {
        long[] arr = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };

        int elementToFind = 5;

        System.out.println(search(arr, elementToFind));
    }
}