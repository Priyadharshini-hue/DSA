/*
Pythagorean Triplet

Given an array arr of N integers, write a function that returns true if there is a triplet (a, b, c) that satisfies a2 + b2 = c2, otherwise false.

Example 1:

Input:
N = 5
Arr[] = {3, 2, 4, 6, 5}
Output: Yes
Explanation: a=3, b=4, and c=5 forms a
pythagorean triplet.
Example 2:

Input:
N = 3
Arr[] = {3, 8, 5}
Output: No
Explanation: No such triplet possible.
Your Task:
Complete the function checkTriplet() which takes an array arr, single integer n, 
as input parameters and returns boolean denoting answer to the problem. 
You don't to print answer or take inputs. 

Note: The driver will print "Yes" or "No" instead of boolean.

Expected Time Complexity: O(max(Arr[i])2)
Expected Auxiliary Space: O(max(Arr[i]))
*/
import java.util.*;

class PythagoreanTriplet{
	
	static boolean checkTriplet(int[] arr, int length){
		
		// square array elements
		for(int i = 0; i < length; i++){
			arr[i] = arr[i] * arr[i];
		}
		
		// sort array
		Arrays.sort(arr);
		
		// fix one element and find other two elements
		for( int i = length-1 ; i >= 2; i-- ){
			
			// to find the other two elements, start two index variables from two corners of the array and move them towards each other
			int l = 0;
			int r = i - 1;
			
			while( l < r ){
				// a triplet found
				if( arr[l] + arr[r] == arr[i]){
					return true;
				}
				// if arr[l] + arr[r] is less, move l
				if( arr[l] + arr[r] < arr[i]){
					l++;
				}
				// if arr[l] + arr[r] greater, move r
				else{
					r--;
				}
			}
		}
		// not a triplet found		
		return false;
	}

	public static void main(String[] args){
		int arr[] = {3, 2, 4, 6, 5 , 5	};
		
		System.out.print(checkTriplet(arr, arr.length));		
		
		//System.out.println(Arrays.toString(arr));
	}
}