/*
Number of occurrence

Given a sorted array Arr of size N and a number X, you need to find the number of occurrences of X in Arr.

Example 1:

Input:
N = 7, X = 2
Arr[] = {1, 1, 2, 2, 2, 2, 3}
Output: 4
Explanation: 2 occurs 4 times in the
given array.
Example 2:

Input:
N = 7, X = 4
Arr[] = {1, 1, 2, 2, 2, 2, 3}
Output: 0
Explanation: 4 is not present in the
given array.
Your Task:
You don't need to read input or print anything. 
Your task is to complete the function count() which takes the array of integers arr, n and x as parameters and returns an integer denoting the answer.
*/
class NumberOfOccurrences{
	
	static int count(int[] arr, int length, int x){
		
		// initialize start, end, position, count
		int start = 0, end = length - 1, position = 0, count = 0;
		
		// while loop to find the minimum index value of position of the x
		while(start <= end){
			
			int mid = (start + end)/2;
			
			// if x is less than the mid element, set end as mid's previous element
			if(x < arr[mid]){
				end = mid - 1;
			}
			// if x is less than the mid element, set start as mid's nestelement
			else if(x > arr[mid]){
				start = mid + 1;
			} 
			//if x is equal to mid element, store the mid value in position and set end to mid's previous element 
			// to check if there is any element equal to x before it
			else{
				position = mid;
				end = mid - 1;
			}
		}
		
		// use while to count the occurrences of x
		while(position < length && arr[position] == x ){
			count++;
			position++;
		}
		return count;
	}

	public static void main(String[] args){
		int[] arr = {1, 1, 2, 2, 2, 2, 3};
		
		System.out.println(count(arr, arr.length - 1, 2));
	}
}