/*
Binary Search
Given a sorted array of size N and an integer K, find the position at which K is present in the array using binary search.

Example 1:

Input:
N = 5
arr[] = {1 2 3 4 5} 
K = 4
Output: 3
Explanation: 4 appears at index 3.

Example 2:

Input:
N = 5
arr[] = {11 22 33 44 55} 
K = 445
Output: -1
Explanation: 445 is not present.

Your Task:  
You dont need to read input or print anything. Complete the function binarysearch() which takes arr[], 
N and K as input parameters and returns the index of K in the array. If K is not present in the array, return -1.
*/
class BinarySearch{
	// O(log n) & O(1)
	static int search(int k, int[] arr, int l, int r){
		
		// while loop to traverse between l and r
		while(l <= r){
			
			// find the mid by (l+r)/2
			int mid = (l+r)/2;
			
			// if mid element is equal to k, return mid index
			if(k == arr[mid]){
				return mid;
			} 
			// if mid element is greater than k, reset r to the mid's previous element index (ignores right side of array)
			else if(k < arr[mid]){
				r = mid-1;
			}
			// if mid element is less than k, reset r to the mid's next element index (ignores left side of array)
			else{
				l = mid+1;
			}
		}
		// if nothing found, return -1
		return -1;
	}
	
	public static void main(String[] args){
		int k = 33;
		int arr[] = {1, 22, 33, 44, 55, 66};
		
		System.out.println(search(k, arr, 0, arr.length-1));
	}
}