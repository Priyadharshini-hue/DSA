/*
Find Index

Given an unsorted array Arr[] of N integers and a Key which is present in this array. 
You need to write a program to find the start index( index where the element is first found from left in the array ) and 
end index( index where the element is first found from right in the array ).

Example 1:

Input:
N = 6
arr[] = { 1, 2, 3, 4, 5, 5 }
Key = 5
Output:  4 5
Explanation:
5 appears first time at index 4 and
appears last time at index 5.
(0 based indexing)
 

Example 2:

Input:
N=6
arr[] = { 6, 5, 4, 3, 1, 2 }
Key = 4
Output:  2 2 
*/
import java.util.*;

class FindIndexOfKey{
	
	static int[] findIndex(int[] arr, int length, int key){
		// intialize array 
		int[] index = {-1, -1};
		
		// to find the start index
		for(int i = 0; i < length; i++){
			if(key == arr[i]){
				index[0] = i;
				break;
			}
		}
		
		// to find the last index
		for(int i = length-1; i >=0; i--){
			if(key == arr[i]){
				index[1] = i;
				break;
			}
		}
		return index;
	}

	public static void main(String[] args){
		int[] arr = { 1, 2, 3, 4, 5, 5 };
		int key = 5;
		
		System.out.println(Arrays.toString(findIndex(arr, arr.length, key)));
	}
}