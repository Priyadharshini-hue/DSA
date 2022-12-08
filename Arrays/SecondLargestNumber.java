import java.util.Scanner;

/*
Second Largest and smallest
Input: 
N = 6
Arr[] = {12, 35, 1, 10, 34, 1}
Output: 34
*/

class SecondLargestNumber {
	static void secondMaxNum(int[] arr, int length) {
		int firstMax = Integer.MIN_VALUE, secondMax = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > firstMax) {
				secondMax = firstMax;
				firstMax = arr[i];
			} else if (secondMax < arr[i] && arr[i] < firstMax) {
				secondMax = arr[i];
			}
		}
		System.out.println(secondMax);
	}

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		secondMaxNum(arr, arr.length);
	}
}