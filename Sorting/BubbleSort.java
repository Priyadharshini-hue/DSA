/* 
Bubble Sorting / sinking sort
O(n2) & O(1)
best cace - O(n)
In-place, stable, adaptive(deplends on initial input's sequential order)
*/
import java.util.*;

class BubbleSort{
	public static void main(String[] args){
	
		int[] arr = {2,4,3,5,1,7};
		
		for(int i = 0; i < arr.length - 1; i++){ // n-1 iterations
			boolean swapped = false;
			for(int j = 0; j < arr.length - i - 1; j++){
				if( arr[j] > arr[j+1] ){
					int t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
					swapped = true;
				}
			}
			// flag for optimized bubble sort
			if(!swapped){
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}