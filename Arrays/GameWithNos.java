import java.util.*;

class GameWithNos{
	
	static int[] game_with_number(int[] arr, int length){
		// Traverse the array from 0 to length-1
		for(int i = 0; i < length-1; i++){
			// xor arr[i] ^ arr[i+1]
			arr[i] = arr[i] ^ arr[i+1];
		}
		
		return arr;
	}

	public static void main(String[] args){
		int arr[ ] = {10, 11, 1, 2, 3};
		
		System.out.print(Arrays.toString(game_with_number(arr, arr.length)));
	}
}