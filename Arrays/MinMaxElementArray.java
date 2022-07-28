/* 
Find minimum and maximum element in an array
Example 1:

Input:
N = 6
A[] = {3, 2, 1, 56, 10000, 167}
Output:
min = 1, max =  10000
 

Example 2:

Input:
N = 5
A[]  = {1, 345, 234, 21, 56789}
Output:
min = 1, max = 56789
 

Your Task:  
You don't need to read input or print anything. 
Your task is to complete the function getMinMax() which takes the array A[] and its size N as inputs 
and returns the minimum and maximum element of the array.
*/
import java.util.*;

class MinMaxElementArray{
	static void find(long[] arr, long length){
		long min = arr[0], max = arr[0];
		
		for(int i = 1; i < length; i++){
			if(max < arr[i]){
				max = arr[i];
			}else if(min > arr[i]){
				min = arr[i];
			}
		}
		System.out.println("max : " + max);
		System.out.println("min : " + min);
	}

	public static void main(String[] args){
		long[] arr = {3, 2, 1, 56, 10000, 167};
		find(arr, arr.length);
	}
}