/*
Clock-wise direction(right side).
Input:
N = 5, k=2
A[] = {1, 2, 3, 4, 5}
Output:
5 1 2 3 4
*/
import java.util.Scanner;

class RotateRight {

	static void rotate(int[] arr, int n, int k) {
		k = k % n;
		reverse(0, n - 1, arr);
		reverse(0, k - 1, arr);
		reverse(k, n - 1, arr);
	}

	static void reverse(int start, int end, int[] arr) {
		int t = 0;
		while (start < end) {
			t = arr[start];
			arr[start] = arr[end];
			arr[end] = t;
			start++;
			end--;
		}
	}

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}

		rotate(arr, n, k);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}