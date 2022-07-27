/*Cyclically rotate an array by one

Given an array, rotate the array by one position in clock-wise direction(right side).
 
Example 1:

Input:
N = 5
A[] = {1, 2, 3, 4, 5}
Output:
5 1 2 3 4
 
Example 2:

Input:
N = 8
A[] = {9, 8, 7, 6, 4, 2, 1, 3}
Output:
3 9 8 7 6 4 2 1
 
Your Task:  
You don't need to read input or print anything. Your task is to complete the function rotate() which takes the array A[] 
and its size N as inputs and modify the array in place.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
*/
import java.util.*;

class RotateClockWise{

	// O(n) & O(n)
	/*static void rotate(int[] arr, int n, int r){
		int[] temp = new int[n];
		int t = 0;
		
		for(int i = n-r; i < n; i++){
			temp[t] = arr[i];
			t++;
		}
		
		for(int j = 0; j < n-r; j++){
			temp[t] = arr[j];
			t++;
		}
		
		for(int k = 0; k < n; k++){
			arr[k] = temp[k];
		}
		
		System.out.println(Arrays.toString(arr)); // 9, 8, 7, 6, 4, 2, 1, 3 => 3, 9, 8, 7, 6, 4, 2, 1
	}*/
	
	// O(n) & O(1)
	static void rotate(int[] arr, int n, int r){
		
		reverse(0, n-r-1, arr);
		reverse(n-r, n-1, arr);
		reverse(0, n-1, arr);
		
	}
	
	static void reverse(int start, int end, int[] arr){
		int t;
		while(start < end){
			t = arr[start];
			arr[start] = arr[end];
			arr[end] = t;
			start++;
			end--;
		}
	}
	
	public static void main(String args[]){
		int arr[] = {9, 8, 7, 6, 4, 2, 1, 3}; 
		int r = 2;
		
		rotate(arr, arr.length, r);
		
		System.out.println(Arrays.toString(arr)); 
	}
}