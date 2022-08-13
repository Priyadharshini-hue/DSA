/*
Print Elements of Array

Given an array Arr of size N, print all its elements.

Example 1:

Input:
N = 5
Arr[] = {1, 2, 3, 4, 5}
Output: 1 2 3 4 5
Example 2:

Input:
N = 4
Arr[] = {2, 3, 5, 5}
Output: 2 3 5 5
Your Task:
Complete the function printArray() which takes an array arr, single integer n, as input parameters and prints the value of the array space separated.
*/

class PrintElementsArray{
	
	static void printArray(int arr[], int length) {
        //   code here
		for(int i = 0; i < length; i++){
			System.out.print(arr[i] + " ");
		}
	}

	// driver code
	public static void main(String[] args){
		int[] arr = {2, 3, 5, 5};
		
		printArray(arr, arr.length);
	}
}