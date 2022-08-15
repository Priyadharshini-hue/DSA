/*
Perfect Arrays

Given an array of size N and you have to tell whether the array is perfect or not. 
An array is said to be perfect if it's reverse array matches the original array. 
If the array is perfect then print "PERFECT" else print "NOT PERFECT".

Example 1:

Input : Arr[] = {1, 2, 3, 2, 1}
Output : PERFECT
Explanation:
Here we can see we have [1, 2, 3, 2, 1] 
if we reverse it we can find [1, 2, 3, 2, 1]
which is the same as before.
So, the answer is PERFECT.

Example 2:

Input : Arr[] = {1, 2, 3, 4, 5}
Output : NOT PERFECT

User Task:
The task is to complete the function IsPerfect(), which takes an array (a), size of the array (n), and 
return the boolean value true if it Perfect else false. The drivercode automatically adds a new line.
*/

class PerfectArrays{
	
	static boolean isPerfect(int[] arr, int length){
		
		int start = 0, end = length-1;
		
		while(start < end){
			if(arr[start] != arr[end]){
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

	public static void main(String args[]){
		
		int[] arr = {1, 2, 3, 2, 1};
	
		if(isPerfect(arr, arr.length)){
			System.out.println("PERFECT");
		}else{
			System.out.println("NOT PERFECT");
		}
	}
}