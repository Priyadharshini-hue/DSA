/*
Largest Element in Array
Input:
n = 5
A[] = {1, 8, 7, 56, 90}
Output:
90
*/

class LargestNumber {
	// O(n)
	static int maxNum(int[] arr, int length) {
		int left = 0, right = length - 1, max = -1;
		while (left < right) {
			if (arr[left] < arr[right]) {
				left++;
			} else {
				right--;
			}
		}
		return (arr[left]);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 0, 3, 2, 4, 5 };

		System.out.println(maxNum(arr, arr.length));
	}
}