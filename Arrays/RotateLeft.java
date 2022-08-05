//Rotate array to left by n

import java.util.*;

class RotateLeft{
	
	static void reverse(int[] arr, int left, int right){
		while(left <= right){
			int t = arr[left];
			arr[left] = arr[right];
			arr[right] = t;
			left++;
			right--;
		}
	}
	
	static void rotate(int[] arr, int l, int shift){
		reverse(arr, 0, l-shift-1);
		reverse(arr, l-shift, l-1);
		reverse(arr, 0, l-1);
	}

	public static void main(String[] args){
		int[] arr = {1, 2, 3, 4, 5, 6}; // 0 1 2 3 4 5 ,6
		int rotate = 3;
		
		rotate(arr, arr.length, rotate);
		
		System.out.println(Arrays.toString(arr));
	}
}