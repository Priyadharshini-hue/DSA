/*
First element to occur k times
Given an array of N integers. Find the first element that occurs at least K number of times.

Example 1:

Input :
N = 7, K = 2
A[] = {1, 7, 4, 3, 4, 8, 7}
Output :
4
Explanation:
Both 7 and 4 occur 2 times. 
But 4 is first that occurs 2 times
As at index = 4, 4 has occurred 
atleast 2 times whereas at index = 6,
7 has occurred atleast 2 times.
 

Your Task:  
You don't need to read input or print anything. 
Your task is to complete the function firstElementKTime() which takes the array A[], its size N, and
an integer K as inputs and returns the required answer. If the answer is not present in the array, return -1.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)
*/
import java.util.*;

class FirstElementOccursKTimes{
	
	static int firstElementKTime(int[] arr, int length, int k){
		
		// create hashmap to count the number of occurrences of each element
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < length; i++){
			// check the map for the key, if not set the value for the first time else increment by 1
			map.put(arr[i], map.getOrDefault(arr[i],0)+1);
			// check the first element that occurs at least K number of times
			if(map.get(arr[i]) == k){
				return arr[i];
			}
		}
		return -1;
	}

	public static void main(String[] args){
		
		int arr[] = {1, 7, 4, 3, 4, 8, 7, 4};
		
		int k = 2;
		
		System.out.print(firstElementKTime(arr, arr.length, k));
	}
}