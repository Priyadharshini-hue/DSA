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

  static int search(int[] arr, int k) {
    int start = 0, end = arr.length - 1, mid;

    while (start <= end) {
      mid = start + ((end - start) / 2);
      if (arr[mid] == k) {
        return mid;
      } else if (arr[mid] > k) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] arr = { 11, 22, 33, 33, 33, 33, 33, 33, 33, 44, 55, 66, 77 };
    int k = 33;

    int index = search(arr, k), count = 1;

    if (index == -1) {
      System.out.println("Not present");
    }

    int left = index - 1;
    while (left >= 0 && arr[left] == k) {
      count++;
      left--;
    }

    int right = index + 1;
    while (right <= arr.length - 1 && arr[right] == k) {
      count++;
      right++;
    }

    System.out.println(count); // 7
  }
}