/*
an unsorted array A of size N that contains only non-negative integers.
Find a continuous sub-array which adds to a given sum.
In case of multiple subarrays, return the subarray which comes first on moving from left to right.
Input:
N = 5, S = 12
A[] = {1,2,3,7,5}
Output: 2 4
Explanation: The sum of elements from 2nd position to 4th position is 12.
*/
import java.util.ArrayList;

class SubArrayWithGivenSum {

	// sliding window technique - prints all the consecutive sub arrays of given sum
	// -- +ve elements only
	static ArrayList<Integer> findSubArray(int[] arr, int length, int sum) {

		// Initialize array to store the start and end index
		ArrayList<Integer> array = new ArrayList<>();

		int start = 0, end = 0, currentSum = arr[0];

		for (int i = 1; i < length; i++) {
			// Add the array elements and re-initialize the end as current index
			currentSum += arr[i];
			end = i;

			// If the currentSum is greater than the given sum
			// subract the elemnts from starting
			while (currentSum > sum && start < end) {
				currentSum -= arr[start];
				start++;
			}

			// Sum check
			if (currentSum == sum) {
				array.add(start + 1);
				array.add(end + 1);
				return array;
				// System.out.println(start + " " + end); // Print all sub arrays with given sum
			}
		}
		array.add(-1);
		return array;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 7, 5, 5 };
		int sum = 10;

		System.out.println(findSubArray(arr, arr.length, sum));
	}
}