/*
Find Duplicate number / numbers in an array
*/
import java.util.*;

class DuplicateNumber{
	// O(n) & O(n)
	static int find(int[] arr){
		// Initialize hashmap m
		HashMap<Integer, Integer> m = new HashMap<>();
		
		// Traverse the array
		for(int i = 0; i < arr.length; i++){
			// To create map by checking the map for the key, if not set the value for the first time else increment by 1
			m.put(arr[i], m.getOrDefault(arr[i],0)+1);
		}
		
		// Traverse the map
		for(Map.Entry<Integer, Integer> map : m.entrySet()){
			// To check the frequency of the element is greaten than 1
			if(map.getValue() > 1){
				System.out.println( map.getKey());
			}
		}
		return 0;
	}

	public static void main(String[] args){
		int[] arr = {1, -2, -2,4, -5, 6, -1, 9,1};
		
		System.out.println(find(arr));
	}
}