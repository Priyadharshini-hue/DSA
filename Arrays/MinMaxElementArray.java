/* 
Find minimum and maximum element in an array

Example 1:
Input:
N = 6
A[] = {3, 2, 1, 56, 10000, 167}
Output:
min = 1, max =  10000
 

Example 2:
Input:
N = 5
A[]  = {1, 345, 234, 21, 56789}
Output:
min = 1, max = 56789
*/
class MinMaxElementArray {
	static class Pair {
		long min;
		long max;
	}

	static Pair getMaxMin(long[] arr, int n) {

		Pair pair = new Pair();

		// Initialize currentIndex to track the index
		int currentIndex = 0;

		// If the length of the array is even
		if (n % 2 == 0) {
			// Compare first elements to find the min and max
			if (arr[0] > arr[1]) {
				pair.min = arr[1];
				pair.max = arr[0];
			} else {
				pair.min = arr[0];
				pair.max = arr[1];
			}
			currentIndex = 2;
		}
		// if the length is odd
		else {
			// Assign the first element as min and max
			pair.min = arr[0];
			pair.max = arr[0];
			currentIndex = 1;
		}

		// Loop till n by incrementing 2
		while (currentIndex < n) {
			// if the currentIndex element is less than the next element
			if (arr[currentIndex] < arr[currentIndex + 1]) {
				// if the currentIndex element is less than the min value
				if (pair.min > arr[currentIndex]) {
					pair.min = arr[currentIndex];
				}
				// if the currentIndex's next element is greater than max value
				if (arr[currentIndex + 1] > pair.max) {
					pair.max = arr[currentIndex + 1];
				}
			} 
			// else 
			else {
				if (pair.min > arr[currentIndex + 1]) {
					pair.min = arr[currentIndex + 1];
				}
				if (arr[currentIndex] > pair.max) {
					pair.max = arr[currentIndex];
				}
			}
			currentIndex += 2;
		}
		return pair;
	}

	public static void main(String[] args) {
		long[] arr = { 3, 2, 56111166, 1, 56, 10000, 167 };
		Pair value = getMaxMin(arr, arr.length);
		System.out.println(value.max);
		System.out.println(value.min);
	}
}