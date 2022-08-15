/*
At least two greater elements

Given an array of N distinct elements, the task is to find all elements in array except two greatest elements in sorted order.

Example 1:

Input : 
a[] = {2, 8, 7, 1, 5}
Output :
1 2 5 
Explanation :
The output three elements have two or
more greater elements.   
Example 2:

Input :
a[] = {7, -2, 3, 4, 9, -1}
Output :
-2 -1 3 4
*/

import java.util.*;

class ArraywithoutFirstTwoGreaterElements{
	
	static long[] findElements(int[] arr, int length){
		
		// intialize a new array
		long[] arr1 = new long[length-2];
		
		// sort array
		Arrays.sort(arr);
		
		// intialize to new array using loop
		for(int i = 0; i < length-2; i++){
			arr1[i] = arr[i];
		}
		
		return arr1;
	}
	
	public static void main(String[] args){
	
		int[] arr = {7, -2, 3, 4, 9, -1};
		
		
		for(int i = 0; i < arr.length-2; i++){
			System.out.print(arr[i] + " ");
		}
	}
}