/*
Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.

Example 1:
Input: 
N = 5
arr[]= {0 2 1 2 0}
Output:
0 0 1 2 2
Explanation: 0s 1s and 2s are segregated into ascending order.

Example 2:
Input: 
N = 3
arr[] = {0 1 0}
Output:
0 0 1
Explanation:0s 1s and 2s are segregated into ascending order
*/

import java.util.Arrays;

class Sort012 {
    // Dutch National Flag problem or Counting Approach
    static void sort(int[] arr) {
        // Initialize start and pointer as 0 and end as arr.length-1
        int start = 0, pointer = 0, end = arr.length - 1;

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            // If the pointer element is 0
            // then swap with the start element and
            // increment the start and pointer
            if (arr[pointer] == 0) {
                int t = arr[pointer];
                arr[pointer] = arr[start];
                arr[start] = t;
                start = start + 1;
                pointer = pointer + 1;
            }
            // If the pointer element is 1, increment the start
            else if (arr[pointer] == 1) {
                pointer = pointer + 1;
            }
            // If the pointer element is 2
            // then swap with the end element and
            // increment the pointer and decrement the end
            else {
                int t = arr[pointer];
                arr[pointer] = arr[end];
                arr[end] = t;
                end = end - 1;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 1, 2, 2, 1, 0, 1, 0 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}