/*
Find Duplicate number / numbers in an array
*/
import java.util.*;

class DuplicateNumber{
	// O(n) & O(n)
	static int find(int[] arr){
		int d = 0;
		
		HashMap<Integer, Integer> m = new HashMap<>();
		
		for(int i = 0; i < arr.length; i++){
			if(!m.containsKey(arr[i])){
				m.put(arr[i], 1);
			}else{
				m.put(arr[i], m.get(arr[i])+1);
			}
		}
		
		for(Map.Entry<Integer, Integer> map : m.entrySet()){
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