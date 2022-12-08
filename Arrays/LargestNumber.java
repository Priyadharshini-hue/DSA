import java.util.Scanner;

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
		int left = 0, right = length - 1;
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
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
		System.out.println(maxNum(arr, arr.length));
	}
}