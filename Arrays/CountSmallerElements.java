/*
Count of smaller elements

Given an sorted array A of size N. Find number of elements which are less than or equal to given element X.

Example 1:

Input:
N = 6
A[] = {1, 2, 4, 5, 8, 10}
X = 9
Output:
5

Example 2:

Input:
N = 7
A[] = {1, 2, 2, 2, 5, 7, 9}
X = 2
Output:
4
*/

class CountSmallerElements{
	
	static int countOfElements(int[] arr, int length, int x){
		// traverse from 0 to n-1
		for(int i = 0; i < length; i++){
			// if current element is greater than x, return index of current element
			if(arr[i] > x){
				return i;
			}
		}
		// if x is not present in given array, print length
		return length;
	}
	
	public static void main(String[] args){
		int[] arr = {1, 2, 2, 2, 5, 7, 9};
		
		int x = 12;
	
		System.out.println(countOfElements(arr, arr.length, x));
	}
}