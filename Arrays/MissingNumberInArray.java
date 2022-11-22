import java.util.HashSet;
import java.util.Scanner;

/*
Missing number in array  -- if no duplicates, contains 0, no -ve
Input: arr[] = {1, 2, 4, 6, 3, 7, 8}, N = 7
Output: 5
Input: nums = [0,1]
Output: 2
*/

class MissingNumberInArray {

	// if has duplicates
	static int findMissingNumberInArrayWithDuplicates(int[] arr, int n) {
		HashSet<Integer> set = new HashSet<>();
		int max = -1;

		for (int i = 0; i < n; i++) {
			set.add(arr[i]);
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		int i;
		for (i = 1; i <= max; i++) {
			if (!set.contains(i)) {
				return i;
			}
		}
		return max + 1;
	}

	// if no duplicates, contains 0, no -ve
	static int findMissingNumberInArrayWithoutDuplicates(int[] arr, int n) {
		// the sum of integers from 1 to n is n(n+1)/2 and product is n!
		int sum = ((n + 1) * (n + 2)) / 2;

		for (int i = 0; i < n; i++) {
			sum -= arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

		System.out.println(findMissingNumberInArrayWithDuplicates(arr, n));
	}
}