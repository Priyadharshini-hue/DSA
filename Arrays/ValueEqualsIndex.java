/*
Value equal to index value
Given an array Arr of N positive integers. 
Your task is to find the elements whose value is equal to that of its index value ( Consider 1-based indexing ).

Example 1:

Input: 
N = 5
Arr[] = {15, 2, 45, 12, 7}
Output: 2
Explanation: Only Arr[2] = 2 exists here.
Example 2:

Input: 
N = 1
Arr[] = {1}
Output: 1
Explanation: Here Arr[1] = 1 exists.

Your Task:  
You don't need to read input or print anything. 
Your task is to complete the function valueEqualToIndex() which takes the array of integers arr[] 
and n as parameters and returns an array of indices where the given conditions are satified. 
When there is not such element exists then return an empty array of length 0.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
Note: There can be more than one element in the array which have same value as their index. You need to include every such element's index. Follows 1-based indexing of the array.
*/
import java.util.*;

class ValueEqualsIndex{
	
	static ArrayList<Integer> valueEqualToIndex(int[] arr, int length){
		
		ArrayList<Integer> elementEqualsIndex = new ArrayList<>();
		
		// traversing from 0 to n-1
		for(int i = 0; i < length; i++){
			// if the current element is equal to index
			if(i+1 == arr[i]){
				// if equals, add it to the elementEqualsIndex
				elementEqualsIndex.add(arr[i]);
			}
		}
		return elementEqualsIndex;
	}

	public static void main(String[] args){
		int[] arr = {15, 2, 45, 12, 5, 7};
		
		System.out.println(valueEqualToIndex(arr, arr.length));
	}
}