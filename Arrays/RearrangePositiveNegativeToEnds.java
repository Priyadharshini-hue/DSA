/*
Move all negative elements to end

Given an unsorted array arr[] of size N having both negative and positive integers. 
The task is place all negative element at the end of array without changing the order of positive element and negative element.

Example 1:
Input :  N = 8
arr[] = {​​1, -1, 3, 2, -7, -5, 11, 6 }​​
Output :
1  3  2  11  6  -1  -7  -5

Example 2:
Input :  N=8
arr[] = {​​-5, 7, -3, -4, 9, 10, -1, 11}​​
Output :
7  9  10  11  -5  -3  -4  -1
*/
import java.util.*;

class RearrangePositiveNegativeToEnds{
	
	static void rotate(int[] arr1, int start, int end){
		while(start < end){
			int t = arr1[start];
			arr1[start] = arr1[end];
			arr1[end] = t;
			start++;
			end--;
		}
	}
	
	static void rearrange(int[] arr, int length){
		
		int negativeNumberIndex = -1;
		
		for(int i = 0; i < length; i++){
			if(arr[i] < 0){
				negativeNumberIndex++;	
				int t = arr[i];
				arr[i] = arr[negativeNumberIndex];
				arr[negativeNumberIndex] = t;
			}
			if(i - negativeNumberIndex >= 2){
				rotate(arr, negativeNumberIndex+1, i);
			}
			
		}
	}
	
	public static void main(String[] args){
		int[] arr = { 0,-1,5, 5, -3, 4, -8, 0, -7, 3, -9, -3, 9, -2, 1 };	

		rearrange(arr, arr.length);
		
		System.out.println(Arrays.toString(arr));
	}
}