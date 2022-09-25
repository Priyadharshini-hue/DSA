/*
Merge Sort

O(n logn) & O(n)

out-place, stable, non-adaptive
*/

import java.util.*;

class MergeSort {

	// Divivde the array into two subarrays, sort them and merge them
	static void mergeSort(int start, int end, int[] arr) {

		if (start < end) {
			// mid is the point where the array is divided into two subarrays
			int mid = (start + end) / 2;

			mergeSort(start, mid, arr);
			mergeSort(mid + 1, end, arr);

			// Merge the sorted array
			sort(start, mid, end, arr);
		}
	}

	static void sort(int start, int mid, int end, int[] arr) {

		// Initialize leftArray --> [start....mid] , rightArray --> [mid+1.....end]
		int[] leftArray = new int[mid - start + 1];
		int[] rightArray = new int[end - mid];

		for (int i = 0; i < leftArray.length; i++) {
			leftArray[i] = arr[start + i];
		}

		for (int i = 0; i < rightArray.length; i++) {
			rightArray[i] = arr[mid + 1 + i];
		}

		// i, j, k to track the current index of the sub arrays and array
		int i = 0, j = 0, k = start;

		// Loop until the either of the subarrays reach the end
		while (i < leftArray.length && j < rightArray.length) {
			if (leftArray[i] <= rightArray[j]) {
				arr[k] = leftArray[i];
				i++;
			} else {
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}

		// When all the elements are traversed in either of the subarrays
		// Pickup the remaining elements and put in the sorted array
		while (i < leftArray.length) {
			arr[k] = leftArray[i];
			i++;
		}
		while (j < rightArray.length) {
			arr[k] = rightArray[j];
			j++;
		}
	}

	public static void main(String[] args) {

		int[] arr = { 4, 2, 5, 9, 1, 10, 0 };

		mergeSort(0, arr.length - 1, arr);

		System.out.println(Arrays.toString(arr));
	}
}