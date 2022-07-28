/*
Minimum distance between two numbers
Given an array Arr[] of size N and an integer K, you have to add the first two minimum elements of the array 
until all the elements are greater than or equal to K and find the number of such operations required.

You are given an array A, of N elements. Find minimum index based distance between two elements of the array, x and y.

Example 1:

Input:
N = 4
A[] = {1,2,3,2}
x = 1, y = 2
Output: 1
Explanation: x = 1 and y = 2. There are
two distances between x and y, which are
1 and 3 out of which the least is 1.
Example 2:

Input:
N = 7
A[] = {86,39,90,67,84,66,62}
x = 42, y = 12
Output: -1
Explanation: x = 42 and y = 12. We return
-1 as x and y don't exist in the array.
Your Task:
Complete the function minDist() which takes the array, n, x and y as input parameters and returns the minimum distance between x and y in the array. If no such distance is possible then return -1.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
*/
import java.util.*;

class MinimumDistanceTwoElements{
	//O(n)
	static int minDist(int[] arr, int length, int x, int y){
		
		int start = -1, end = -1, distance = length;
		
		for(int i = 0; i < length; i++){
			if(arr[i] == x){
				start = i;
			}
			if(arr[i] == y){
				end = i;
			}
			if(start != -1 && end != -1){
				distance = Math.min(distance, Math.abs(start - end));
			}
		}
		
		if(start == -1 || end == -1){
			distance = -1;
		}
		return distance;
	}

	public static void main(String[] args){
	int[] arr = {1,2,1,3,2,4,2};
	int x = 1, y = 2;
	System.out.println(minDist(arr, arr.length, x, y));
	}
}