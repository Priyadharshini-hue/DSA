/*
Searching a number
Given an array Arr of N elements and a integer K. Your task is to return the position of first occurence of K in the given array.
Note: Position of first element is considered as 1.

Example 1:

Input:
N = 5, K = 16
Arr[] = {9, 7, 2, 16, 4}
Output: 4
Explanation: K = 16 is found in the
given array at position 4.
Example 2:

Input:
N = 7, K = 98
Arr[] = {1, 22, 57, 47, 34, 18, 66}
Output: -1
Explanation: K = 98 isn't found in
the given array.
Your Task:
Complete the function search() which takes an array arr, two integers n and k, as input parameters and 
returns an integer denoting the answer. Return -1 if the number is not found in array. You don't to print answer or take inputs.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
*/

class SearchNumberFirstOccurence{

	static int search(int[] arr, int length, int k){
		// Traverse the array
		for(int i = 0; i < length; i++){
			// Check if k to each element
			if(k == arr[i]){
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args){
		// unsorted array
		int arr[] = {9, 7, 2, 16, 4};
		int k = 16;
		
		System.out.print(search(arr, arr.length, k));
	}
}