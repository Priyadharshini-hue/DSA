/*
Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.
*/

class SubArraryMaxSum{
	
	static void findArray(int[] arr, int length){
		
		int sum = arr[0], maxSum = arr[0];
		
		for(int i = 1; i < length; i++){
			sum = sum + arr[i];
			
			if(sum < arr[i]){
				sum = arr[i];
			}
			
			if(maxSum < sum){
				maxSum = sum;
			}
		}
		
		System.out.println(maxSum);
	}
	
	public static void main(String[] args){
		int[] arr = {1,-2,3,-12,5,3};
		
		findArray(arr, arr.length);
	}
}