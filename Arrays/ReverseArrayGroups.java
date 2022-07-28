/*
Reverse array in groups

Given an array arr[] of positive integers of size N. Reverse every sub-array group of size K.

Example 1:

Input:
N = 5, K = 3
arr[] = {1,2,3,4,5}
Output: 3 2 1 5 4
Explanation: First group consists of elements
1, 2, 3. Second group consists of 4,5.

Example 2:

Input:
N = 8, K = 3
arr[] = {5,6,8,9,7,1 ,5}  //678
Output: 8 6 5 1 7 9 3 2 4 5 
 

Your Task:
You don't need to read input or print anything. The task is to complete the function reverseInGroups() which takes 
the array, N and K as input parameters and modifies the array in-place. 

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)
*/
import java.util.*;

class ReverseArrayGroups{
	//Function to reverse every sub-array group of size k.
	static void reverse(ArrayList<Integer> arr, int length, int k){
		for(int i = 0; i < length; i+=k){
			int start = i;
			// if end not multiple of 3 => here 7,8 => end =8 but length is 7 so min is used to get 7
			int end = Math.min(i+k-1, length-1);
			while(start<end){
				int t = arr.get(start);
				arr.set(start, arr.get(end));
				arr.set(end, t);
				start++;
				end--;
			}
		}
	}
	public static void main(String args[]){
		ArrayList<Integer> arr = new ArrayList<>(List.of(1,2,3,4,5,6,7,8));
		int k = 3;
		reverse(arr, arr.size(), k);
		System.out.println(arr);
	}
}