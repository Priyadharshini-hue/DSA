/*
Print the left element

Given a array of length N, at each step it is reduced by 1 element. 
In the first step the maximum element would be removed, while in the second step minimum element of the remaining array would be removed, 
in the third step again the maximum and so on. Continue this till the array contains only 1 element. 
And find the final element remaining in the array.

Example 1:

Input:
N = 7
A[] = {7, 8, 3, 4, 2, 9, 5}
Ouput:
5
Explanation:
In first step '9' would be removed, in 2nd step
'2' will be removed, in third step '8' will be
removed and so on. So the last remaining
element would be '5'.  
 

Example 2:

Input:
N = 8
A[] = {8, 1, 2, 9, 4, 3, 7, 5}
Ouput:
4
 

Your Task:  
You don't need to read input or print anything. 
Your task is to complete the function leftElement() which takes the array A[] and 
its size N as inputs and returns the final remaining element in the array.
*/
import java.util.*;

class RemainingElement{
	
	static int leftElement(int[] arr, int length){
		// sort array
		Arrays.sort(arr); 
		
		// if length is even
		if(length % 2 == 0){
			return arr[(length/2)-1];
		}
		// if length is odd
		return arr[length/2];
	}

	public static void main(String args[]){
		int[] arr = {8, 1, 2, 9, 4, 3, 7, 5};
		
		System.out.println(leftElement(arr, arr.length));
	}
}