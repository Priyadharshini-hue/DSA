/*
First and last occurrences of x
Given a sorted array arr containing n elements with possibly duplicate elements, 
the task is to find indexes of first and last occurrences of an element x in the given array.

Example 1:

Input:
n=9, x=5
arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 }
Output:  2 5
Explanation: First occurrence of 5 is at index 2 and last occurrence of 5 is at index 5. 

Example 2:

Input:
n=9, x=7
arr[] = { 1, 3, 5, 5, 5, 5, 7, 123, 125 }
Output:  6 6 

Your Task:
Since, this is a function problem. You don't need to take any input, 
as it is already accomplished by the driver code. You just need to complete the function find() that takes array arr, 
integer n and integer x as parameters and returns the required answer.
Note: If the number x is not found in the array just return both index as -1.
*/
class FirstLastOccurrence{
	static int findFirst(int[] arr, int k){
		int l = 0, r = arr.length - 1, index = -1;
		
		while(l <= r){
			int mid = (l+r)/2;
			
			if(arr[mid] > k ){ //greater
				r = mid-1;
			}else if(arr[mid] < k){ // lesser
				l = mid+1;
			}else{   //equal
				index = mid;
				r = mid-1;
			}
		}
		return index;
	}
	
	static int findLast(int[] arr, int k){
		int l = 0, r = arr.length-1, index = -1;
		
		while(l<=r){
			int mid = (l+r)/2;
			
			if(arr[mid] > k){
				r = mid-1;
			}else if(arr[mid] < k){
				l =  mid + 1;
			}else{
				index = mid;
				l = mid+1;
			}
		}
		return index;
	}			

	public static void main(String[] args){
		int x = 5;
		int arr[] = { 1, 3, 5, 5, 5, 7, 123, 125 };
		
		System.out.println(findFirst(arr,  x));
		System.out.println(findLast(arr,  x));
	}
}