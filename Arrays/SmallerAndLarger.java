/*
Smaller and Larger

Given a sorted array Arr of size N and a value X, find the number of array elements less than or equal to X and elements more than or equal to X. 

Example 1:

Input:
N = 7, X = 0
Arr[] = {1, 2, 8, 10, 11, 12, 19}
Output: 0 7
Explanation: There are no elements less or
equal to 0 and 7 elements greater or equal
to 0.
Example 2:

Input:
N = 7, X = 5
Arr[] = {1, 2, 8, 10, 11, 12, 19}
Output: 2 5
Explanation: There are 2 elements less or
equal to 5 and 5 elements greater or equal
to 5.
Your Task:
You don't need to read input or print anything.
Your task is to complete the function getMoreAndLess() which takes the array of integers arr, n and x as parameters 
and returns an array of size 2. pair denoting the answer. The first value is number of elements less than or equal to x 
and the second value is number of elements more than or equal to x.
*/
class SmallerAndLarger{
	
	static int[] getMoreAndLess(int[] arr, int length, int x){
		
		//intialize count1, count2 in array
		int count1 = 0, count2 = 0;
		
		// traverse array 
		for(int number : arr){
			// if the current element is less than or equal to x, then increment count1
			if(number <= x) count1++; 
			// if the current element is greater than or equal to x, then increment count2
			if(number >= x) count2++; 
		}
		
		return new int[] {count1, count2};
	}

	public static void main(String[] args){

		int[] arr = {1, 2, 8, 10, 11, 12, 19};
		int k = 5;
		
		for(int n : getMoreAndLess(arr, arr.length, k)){
			System.out.print(n + " ");
		}
	}
}