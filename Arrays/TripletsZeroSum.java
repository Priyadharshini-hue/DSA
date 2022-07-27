/*Find triplets with zero sum
Given an array arr[] of n integers. Check whether it contains a triplet that sums up to zero. 

Example 1:

Input: n = 5, arr[] = {0, -1, 2, -3, 1}
Output: 1
Explanation: 0, -1 and 1 forms a triplet
with sum equal to 0.
Example 2:

Input: n = 3, arr[] = {1, 2, 3}
Output: 0
Explanation: No triplet with zero sum exists. 

Your Task:
You don't need to read input or print anything. Your task is to complete the boolean function findTriplets() which takes 
the array arr[] and the size of the array (n) as inputs and print 1 if the function returns true 
else print 0 if the function returns false. 

Expected Time Complexity: O(n2)
Expected Auxiliary Space: O(1)
*/

import java.util.*;

class TripletsZero{
	
	// O(n3) &  O(1)
	/*static boolean findTriplet(int[] arr){
		for(int i = 0; i < n-2; i++){
			for(int j = 0; j < n-1; j++){
				for(int k = 0; k < n; k++){
					if(arr[i] + arr[j] + arr[k] == 0){
						return true;
					}
				}
			}
		}
		return false;
	}*/
	
	// O(n2) & O(1) -- Two pointer technique
	
	static boolean findTriplet(int[] arr, int n){
		
		int left, right, sum;
		
		Arrays.sort(arr); // [-3, -1, 0, 1, 2]
		
		for(int i = 0; i < n-2; i++){
			
			left = i+1;
			right = n-1;
			
			while(left < right){			
				if(  arr[i] + arr[left] + arr[right] == 0){
					return true;
				}else if(  arr[i] + arr[left] + arr[right] < 0){
					left++;
				}else{
					right--;
				}
			}
		}
		return false;
	}
	
	public static void main(String args[]){
		int[] arr = {0, -1, 2, -3, 1};
		
		if(findTriplet(arr, arr.length)){
			System.out.println('1');
		}else{
			System.out.println('0');
		}
	}
}