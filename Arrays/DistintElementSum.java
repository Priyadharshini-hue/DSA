/*
Find sum of non-repeating (distinct) elements in an array

Input  : arr[] = {12, 10, 9, 45, 2, 10, 10, 45,10};
Output : 78
Here we take 12, 10, 9, 45, 2 for sum
because it's distinct elements 

Input : arr[] = {1, 10, 9, 4, 2, 10, 10, 45 , 4};
Output : 71

*/

import java.util.*;

class DistintElementSum{
	
	static int findSum(int[] arr, int length){
		
		Arrays.sort(arr);
		
		int sum = 0;
	
		for(int i = 0; i < length-1; i++){
			if(arr[i] != arr[i + 1]){
				sum += arr[i];
			}
		}
		
		return sum+arr[length-1];
	}

	public static void main(String[] args){
		int[] arr = {1, 10, 9, 4, 2, 10, 10, 45 , 4};
		
		System.out.println(findSum(arr, arr.length));
	}
}