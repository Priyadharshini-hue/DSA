/*
Insertion sort
O(n2) & O(1)
in-place, stable adaptive
*/
import java.util.*;

class InsertionSort{
	public static void main(String[] args){
		int[] arr = {4, 2, 5, 3, 7, 1};
		
		for(int i = 1; i < arr.length; i++){
			int key = arr[i];
			int j = i -1;
			
			while(j>=0 && key < arr[j]){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		System.out.println(Arrays.toString(arr));
	}
}