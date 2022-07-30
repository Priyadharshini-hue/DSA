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
	// O(log n) & O(log n) -- Recursive method
	/*static int search(int k, int[] arr, int l, int r){
		if(l<=r){
			int mid = (l+r)/2;
		
			if(arr[mid] == k){
				return mid;
			}else if(arr[mid] < k){
				return search(k, arr, mid+1, r);
			}else{
				return search(k, arr, l, mid);
			}
		}
		return -1;
	}*/
	// O(log n) & O(1)
	static int search(int k, int[] arr){
		int l = 0, r = arr.length-1;
		
		while(l <= r){
			int mid = (l+r)/2;
			
			if(arr[mid] == k){
				return mid;
			}else if(arr[mid] > k){
				r = mid-1;
			}else{
				l = mid+1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args){
		int k = 33;
		int arr[] = {1, 22, 33, 44, 55, 66};
		
		//System.out.println(search(k, arr, 0, arr.length-1));
		System.out.println(search(k, arr));
	}
}