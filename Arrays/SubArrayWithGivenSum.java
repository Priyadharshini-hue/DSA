/*
Given an unsorted array A of size N that contains only non-negative integers, find a continuous sub-array which adds to a given number S.

In case of multiple subarrays, return the subarray which comes first on moving from left to right.

Input:
N = 5, S = 12
A[] = {1,2,3,7,5}
Output: 2 4
Explanation: The sum of elements from 2nd position to 4th position is 12.

*/
import java.util.*;

class SubArrayWithGivenSum{
	
	//sliding window technique - prints all the consecutive sub arrays of given sum -- +ve elements only
	static void findSubArray(int[] arr, int length, int sum){
		
		int currentSum = 0, start = 0, end = 0;
		
		for(int i = 0; i < length; i++){
			currentSum = currentSum + arr[i];
			end = i;
			
			if(currentSum >= sum){
				while(currentSum > sum && start <end){
					currentSum = currentSum - arr[start];
					start++;
				}
				if(currentSum == sum){
					System.out.println(start + " " + end);
					System.out.println(Arrays.toString(Arrays.copyOfRange(arr, start, end+1)));
				}
			}
		}
	}

	public static void main(String[] args){
		int[] arr = {1, 2, 3, 7, 10, 5, 5, 1, 1, 3, 5};
		int sum = 10;
		
		findSubArray(arr, arr.length, sum);
	}
}