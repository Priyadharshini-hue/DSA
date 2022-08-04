/*
Merge Sort

O(n logn) & O(n)

out-place, stable, non-adaptive
*/

import java.util.*;

class MergeSort{
	
	
	static void merge(int[] arr, int start, int mid, int end){
	
		int[] leftArray = new int[mid - start + 1];
		int[] righttArray = new int[end - mid];
	
		for(int i = 0; i < leftArray.length; i++){
			leftArray[i] = arr[start+i];
		}
		for(int i = 0; i < righttArray.length; i++){
			righttArray[i] = arr[mid+ 1 + i];
		}
		
		int i = 0, j = 0;
		
		for(int k = start; k <= end; k++ ){
			if(i < leftArray.length && j < righttArray.length){
				if(leftArray[i] <= righttArray[j]){
					arr[k] = leftArray[i];
					i++;
				}else{
					arr[k] = righttArray[j];
					j++;
				}
			}else if(i < leftArray.length){
				arr[k] = leftArray[i];
				i++;
			}else{
				arr[k] = righttArray[j];
				j++;
			}
		}
	}
	
	static void sortMerge(int[] arr, int start, int end){
		if(start < end){
			int mid = (start+end)/2;
			
			sortMerge(arr, start, mid);
			sortMerge(arr, mid+1, end);
			merge(arr, start, mid, end);
		}
	}

	public static void main(String[] args){
		int[] arr = {4,2,5,3,7,1};
		
		sortMerge((arr), 0, arr.length-1);
		
		System.out.println(Arrays.toString(arr));
	}
}