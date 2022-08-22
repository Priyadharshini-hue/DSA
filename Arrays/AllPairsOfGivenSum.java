/*
Print all pairs with given sum
Examples :
Input  :  arr[] = {1, 5, 7, -1, 5, -3}, 
          sum = 6
Output : (1, 5) (7, -1) (1, 5)

Input  :  arr[] = {2, 5, 17, -1}, 
          sum = 7
Output :  (2, 5)
*/
import java.util.*;

class AllPairsOfGivenSum{
	
	static void findPairs(int[] arr, int length, int target){
		
		// Initialize pairs
		HashMap<Integer, Integer> pairs = new HashMap<>();
		
		// Traverse the array
		for(int i = 0; i < length; i++){
			// If pairs contains Key
			if(pairs.containsKey(arr[i])){
				System.out.println(pairs.get(arr[i]) + "," + arr[i]);
			} 
			// If not, subract the element from target which is key and the element is value
			else{
				pairs.put(target - arr[i], arr[i]);
			}
			System.out.println(pairs);
		}
	}
	

	public static void main(String[] args){
		int[] arr = {1, 5, 7, -1, 5, 2};
		int target = 6;
		
		findPairs(arr, arr.length, target);
	}
}