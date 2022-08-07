/*
Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the minimum sum and return its sum.
*/

class SubArraryMinSum{
	
	static void findArray(int[] arr, int length){
		
		int sum = arr[0], minSum = arr[0];
		
		for(int i = 1; i < length; i++){
			sum = sum + arr[i];
			
			if(sum > arr[i]){
				sum = arr[i];
			}
			
			if(minSum > sum){
				minSum = sum;
			}
		}
		
		System.out.println(minSum);
	}
	
	public static void main(String[] args){
		int[] arr = {1,-2,3,-12,5,3,-13,-89};
		
		findArray(arr, arr.length);
	}
}