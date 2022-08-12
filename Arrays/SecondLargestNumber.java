/*
Second Largest
Given an array Arr of size N, print second largest element from an array.

Example 1:

Input: 
N = 6
Arr[] = {12, 35, 1, 10, 34, 1}
Output: 34
Explanation: The largest element of the 
array is 35 and the second largest element
is 34.
Example 2:

Input: 
N = 3
Arr[] = {10, 5, 10}
Output: 5
Explanation: The largest element of 
the array is 10 and the second 
largest element is 5.
Your Task:
You don't need to read input or print anything. 
Your task is to complete the function print2largest() which takes the array of integers arr and n as parameters 
and returns an integer denoting the answer. If 2nd largest element doesn't exist then return -1.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
*/

class SecondLargestNumber{
	
	static int print2largest(int[] arr, int length){
		
		// initialize first and second largest number 
		int firstLargest = arr[0], secondLargest = -1;
		
		// traversing from 1 to n-1
		for(int index = 1; index < length; index++){
			// if current element is greater than firstLargest, then update firstLargest and secondLargest
			if(arr[index] > firstLargest){
				secondLargest = firstLargest;
				firstLargest = arr[index];
			}
			// if the current element is in between firstLargest and secondLargest, then update secondLargest
			else if(secondLargest < arr[index] && arr[index] < firstLargest){
				secondLargest = arr[index];
			}
		}
		// return secondLargest, if secondLargest not equal to -1
		return secondLargest != -1 ? secondLargest : -1;
	}
	
	// driver code
	public static void main(String args[]){
		int[] arr = {12, 35, 1, 10, 34, 1};
		
		System.out.println(print2largest(arr, arr.length));
	}
}