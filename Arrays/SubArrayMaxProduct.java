/*
Given an array Arr[] that contains N integers (may be positive, negative or zero). Find the product of the maximum product subarray.

Example 1:
Input:
N = 5
Arr[] = {​​6, -3, -10, 0, 2}​​
Output: 180
Explanation: Subarray with maximum product is [6, -3, -10] which gives product as 180.

Example 2:
Input:
N = 6
Arr[] = {​​2, 3, 4, 5, -1, 0}​​
Output: 120
Explanation: Subarray with maximum product is [2, 3, 4, 5] which gives product as 120.
*/
class SubArrayMaxProduct{
	
	static void find(int[] arr, int length){
		
		int min = arr[0], max = arr[0], maxProduct = arr[0]; 
		
		for(int i = 1; i < length; i++){
			
			if(arr[i] < 0){
				int t = max;
				max = min;
				min = t;
			}
			
			min = Math.min(min, min * arr[i]);
			max = Math.max(max, max * arr[i]);
			
			maxProduct = Math.max(maxProduct, max);
		}
		System.out.println(maxProduct);
	}

	public static void main(String[] args){
		int[] arr = {6, -3, -10, 0, 2};
		
		find(arr, arr.length);
	}	
}