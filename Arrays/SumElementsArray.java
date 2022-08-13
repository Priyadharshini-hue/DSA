/*
Sum of Array

Given an integer array Arr[] of size N. The task is to find sum of it.

Example 1:

Input:
N = 4
Arr[] = {1, 2, 3, 4}
Output: 10
Explanation: 1 + 2 + 3 + 4 = 10.
Example 2:

Input:
N = 3
Arr[] = {1, 3, 3}
Output: 7
Explanation: 1 + 3 + 3 = 7.
*/
class SumElementsArray{
	
	static int sum(int[] arr, int length){
		
		//  to avoid stackoverflow error when length is 0
		if(length <= 0){
			return 0;
		}
		
		// calling method recursively
		return sum(arr, length-1) + arr[length-1];
	}

	public static void main(String[] args){
		int[] arr = {1, 4, 2, 6, 9};
		
		System.out.println(sum(arr, arr.length));
	}
}