/*
COUNT NUMBER OF OCURRENCES(or frequency) IN A SORTED ARRAY:

Given a sorted array arr[] and a number x, write a function that counts the occurrences of x in arr[]. 

Examples:
Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 2
Output: 4 // x (or 2) occurs 4 times in arr[]

Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 3
Output: 1  
*/
class FrequencyOfElement {

  static int getFrequencyOfElement(int[] arr, int target) {

    // Initialize startIndex and endIndex
    int startIndex = -1, endIndex = -1;

    // To Find the start index of target
    int start = 0, end = arr.length - 1;

    while (start <= end) {
      int mid = start + (end - start) / 2;

      // Check if the target is present at mid
      // then store the index in startIndex and ignore the right half
      if (arr[mid] == target) {
        startIndex = mid;
        end = mid - 1;
      }
      // If the target is greater than left half, then ignore left half
      else if (arr[mid] < target) {
        start = mid + 1;
      }
      // If the target is lesser than right half, then ignore right half
      else {
        end = mid - 1;
      }
    }
    // Check if the the element is present in array
    if (startIndex == -1) {
      return 0;
    }

    // To Find the end index of target
    start = 0;
    end = arr.length - 1;

    while (start <= end) {
      int mid = start + (end - start) / 2;

      // Check if the target is present at mid
      // then store the index in endIndex and ignore the left half
      if (arr[mid] == target) {
        endIndex = mid;
        start = mid + 1;
      }
      // If the target is greater than left half, then ignore left half
      else if (arr[mid] < target) {
        start = mid + 1;
      }
      // If the target is lesser than right half, then ignore right half
      else {
        end = mid - 1;
      }
    }
    return endIndex - startIndex + 1;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 1, 2, 2, 2, 2, 3 };
    int target = 4;
    System.out.print(getFrequencyOfElement(arr, target));
  }
}