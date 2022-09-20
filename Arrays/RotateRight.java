/*
Given an array, rotate the array by one position in clock-wise direction(right side).
 
Example 1:
Input:
N = 5
A[] = {1, 2, 3, 4, 5}
Output:
5 1 2 3 4
*/
import java.util.*;

class RotateRight { // RotateRight or clockwise
	// Rotate method
	static void rotate(int[] arr, int n, int r) {

		reverse(0, n - r, arr); // Reverse first half
		reverse(n - r + 1, n - 1, arr); // Reverse second half
		reverse(0, n - 1, arr); // Reverse the whole array

	}

	// Reverse method
	static void reverse(int start, int end, int[] arr) {

		// Initialize t value
		int t;

		// Reversing the first and last values in array
		while (start < end) {
			t = arr[start];
			arr[start] = arr[end];
			arr[end] = t;
			start++;
			end--;
		}
	}

	public static void main(String args[]) {
		int arr[] = { 9, 8, 7, 6, 4, 2, 1, 3 };
		int r = 2;

		rotate(arr, arr.length - 1, r);

		System.out.println(Arrays.toString(arr));
	}
}