/*
Given a sorted array arr[] of distinct integers. Sort the array into a wave-like array(In Place).
(array is sorted or not sorted - code will work)

Example 1:
Input:
n = 5
arr[] = {1,2,3,4,5}
Output: 2 1 4 3 5
Explanation: Array elements after sorting it in wave form are 2 1 4 3 5.

Example 2:
Input:
n = 6
arr[] = {2,4,7,8,9,10}
Output: 4 2 8 7 10 9
Explanation: Array elements after sorting it in wave form are 4 2 8 7 10 9.
*/
import java.util.Arrays;

public class SortInWaveForm {
    static void swap(int[] arr, int a, int b) {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }

    static void sortInWave(int[] arr) {
        // Traverse the even elements in array
        for (int i = 0; i < arr.length - 1; i+=2) {
            // If the even elements after 0th index is less than the previous element
            if (i > 0 && arr[i] < arr[i - 1]) {
                swap(arr, i, i + 1);
            }
            // If the even elements is less than the next element
            if (i < arr.length - 1 && arr[i] < arr[i + 1]) {
                swap(arr, i, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 7, 8, 9, 10 };

        sortInWave(arr);
        System.out.println(Arrays.toString(arr));
    }
}