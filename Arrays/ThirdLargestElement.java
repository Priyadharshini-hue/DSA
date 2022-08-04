/*
Third largest element

Given an array of distinct elements. Find the third largest element in it.

Suppose you have A[] = {1, 2, 3, 4, 5, 6, 7}, its output will be 5 because it is the 3 largest element in the array A.

Example 1:

Input:
N = 5
A[] = {2,4,1,3,5}
Output: 3
Example 2:

Input:
N = 2
A[] = {10,2}
Output: -1
Your Task:
Complete the function thirdLargest() which takes the array a[] and the size of the array, n, as input parameters and 
returns the third largest element in the array. It return -1 if there are less than 3 elements in the given array.
*/
class ThirdLargestElement{
	
	//O(n) -- using single traversal
	static int thirdLargest(int[] arr, int n){
		int first = arr[0], second = -1, third = -1;
		
		if(n < 3){
			return -1;
		}
		
		for(int i = 1; i < n; i++){
			if(first < arr[i]){
				third = second;
				second = first;
				first = arr[i];
			}else if(second < arr[i]){
				third = second;
				second = arr[i];
			}else if(third < arr[i]){ //condition
				third = arr[i];
			}
		}
		return third;
	}
	
	public static void main(String[] args){
		int[] arr = {884,337,689,587,748,308,451,785,682,600,733,537,403,188,162,562,274,513,383,617,662,508,111,57,160};
		
		System.out.println(thirdLargest(arr, arr.length));
	}
}