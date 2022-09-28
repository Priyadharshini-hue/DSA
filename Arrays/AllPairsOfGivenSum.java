/*
Print all pairs and count of given sum.
Examples :
Input  :  arr[] = {1, 5, 7, -1, 5, -3}, 
          sum = 6
Output : (1, 5) (7, -1) (1, 5)

Input  :  arr[] = {2, 5, 17, -1}, 
          sum = 7
Output :  (2, 5)
*/
import java.util.*;

class AllPairsOfGivenSum {

	static int findPairs(int[] arr, int target) {
		// Initialize map to store the frequency of elements and
		// the count to store the pairs of given sum.
		HashMap<Integer, Integer> map = new HashMap<>();
		int count = 0;

		// Traverse the array
		for (int i = 0; i < arr.length; i++) {

			// Check if the opposite pair of the current element is
			// present in array, then increment based on the frequency
			// of opposite element
			if (map.containsKey(target - arr[i])) {
				count += map.get(target - arr[i]);
				int t = map.get(target - arr[i]);
				while (t > 0) {
					System.out.println(arr[i] + " " + (target - arr[i]));
					t--;
				}
			}

			// Store the frequency of the elements in array
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 7, -1, 5, -3 };
		int target = 6;

		System.out.println(findPairs(arr, target));
		;
	}
}