/*
Binary Array Sorting

Given a binary array A[] of size N. The task is to arrange the array in increasing order.
Note: The binary array contains only 0  and 1.

Example 1:

Input: 
5
1 0 1 1 0

Output: 
0 0 1 1 1

Explanation: 
After arranging the elements in 
increasing order, elements will be as 
0 0 1 1 1.

Example 2:

Input:
10
1 0 1 1 1 1 1 0 0 0

Output: 
0 0 0 0 1 1 1 1 1 1

Explanation: 
After arranging the elements in 
increasing order, elements will be 
0 0 0 0 1 1 1 1 1 1.

Your Task: This is a function problem. 
You only need to complete the function binSort() that takes the array A[] and it's size N as parameters and sorts the array. 
The printing is done automatically by the driver code.
*/
import java.util.*;

class BinaryArraySorting{
	
	static void binSort(int[] arr, int length){
		// initialize start, end
		int start = 0, end = length;
		
		while(start <= end){
			if(arr[start] == 1 && arr[end] == 0){
				arr[start] = 0;
				arr[end] = 1;
				start++;
				end--;
			}else if(arr[end] == 1){
				end--;
			}else{
				start++;
			}
		}
		
	}

	public static void main(String[] args){
		int[] arr = {1,0,1,1,1,0,0,1,1,0,1};
		
		binSort(arr, arr.length - 1);
		
		System.out.print(Arrays.toString(arr));
	}
}