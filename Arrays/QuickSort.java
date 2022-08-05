// in-place, not stable, adaptive

import java.util.*;

class QuickSort{

	static void swap(int[] arr, int a, int b){
		int t = arr[a];
		arr[a] = arr[b];
		arr[b] = t;
	}
	
	static int partition(int[] arr, int start, int end){
		int pivot = arr[end];
		
		int i = start - 1;
		
		for(int j = start; j <= end-1; j++){
			if(arr[j] < pivot){
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i+1, end);
		return (i+1);
	}
	
	static void sort(int[] arr, int start, int end){
		if(start < end){
			int pi = partition(arr, start, end);
			
			sort(arr, start, pi-1);
			sort(arr, pi+1, end);
		}
	}
	
	public static void main(String[] args){
		int[] arr = {10, 7, 8, 9, 1, 5};
		
		sort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}
}