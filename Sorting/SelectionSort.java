/*
Selection sort
in-place, non- stable, non-adaptive
O(n2)
*/
import java.util.*;

class SelectionSort{
	public static void main(String[] args){
		int[] arr = {4, 2, 5, 3, 7, 1};
		
		for(int i = 0; i < arr.length; i++){
			int smallIndex = i;
			for(int j = i+1; j < arr.length; j++){
				if(arr[j] < arr[smallIndex]){
					smallIndex = j;
				}
			}
			/* //for stable selection sort
			int key = arr[smallIndex];
			while(i < smallIndex ){
				arr[smallIndex] = arr[smallIndex-1];
				smallIndex--;
			}
			arr[smallIndex] = key;
			*/
			int t = arr[smallIndex];
			arr[smallIndex] = arr[i];
			arr[i] = t;
		}
		System.out.println(Arrays.toString(arr));
	}
}