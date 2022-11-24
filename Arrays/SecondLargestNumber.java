/*
Second Largest and smallest
Input: 
N = 6
Arr[] = {12, 35, 1, 10, 34, 1}
Output: 34
*/

class SecondLargestNumber {

	static void print2largestAndSmallest(int[] arr, int length) {

		int firstLargest = arr[0], secondLargest = Integer.MIN_VALUE,
				firstSmallest = arr[0], secondSmallest = Integer.MAX_VALUE;

		for (int i = 1; i < length; i++) {
			if (arr[i] > firstLargest) {
				secondLargest = firstLargest;
				firstLargest = arr[i];
			} else if (secondLargest <= arr[i] && arr[i] != firstLargest) {
				secondLargest = arr[i];
			}
			
			if (arr[i] < firstSmallest) {
				secondSmallest = firstSmallest;
				firstSmallest = arr[i];
			} else if (secondSmallest > arr[i] && arr[i] != firstSmallest) {
				secondSmallest = arr[i];
			}
		}
		System.out.println(secondLargest);
		System.out.println(secondSmallest);
	}

	public static void main(String args[]) {
		int[] arr = { 35, 12, 35, 1, 10, 34, 1 };

		print2largestAndSmallest(arr, arr.length);

	}
}