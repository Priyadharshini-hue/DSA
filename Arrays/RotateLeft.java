
/*
AntiClock-wise direction(left side).
Input:
N = 7, k=2
A[] = {1, 2, 3, 4, 5,6,7}
Output:
3 4 5 6 7 1 2
*/
import java.util.Scanner;

class RotateLeft {

	static void reverse(int[] arr, int left, int right) {
		while (left < right) {
			int t = arr[left];
			arr[left] = arr[right];
			arr[right] = t;
			left++;
			right--;
		}
	}

	static void rotate(int[] arr, int l, int k) {
		k = k % l;
		reverse(arr, 0, l - 1);
		reverse(arr, 0, l - k - 1);
		reverse(arr, l - k, l - 1);
	}

	public static void main(String[] args) {
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