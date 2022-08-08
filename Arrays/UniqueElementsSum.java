/*
Sum of all Unique elements in a given array
[] arrA = {1, 6, 4, 3, 2, 2, 3, 8, 1};
Output : 24 
(Unique elements are: 1, 6, 4, 3, 2, 8)

[] arrA = {1, 1, 3, 2, 2, 3};
Output : 6 
(Unique elements are: 1, 2, 3)
*/
import java.util.*;

class UniqueElementsSum{
	
	static int findSum(int[] arr, int length){

		HashMap<Integer, Integer> numberFrequency = new HashMap<>();

		for(int i = 0; i < length; i++){
			if(numberFrequency.containsKey(arr[i])){
				numberFrequency.put(arr[i], numberFrequency.get(arr[i])+1);
			}else{
				numberFrequency.put(arr[i], 1);
			}
		}
		
		int sum = 0;
		
		for(Map.Entry<Integer, Integer> n : numberFrequency.entrySet() ){
			if(n.getValue() == 1){
				sum += n.getKey();
			}
		}
		return sum;
	}

	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,1,2};
		
		System.out.println(findSum(arr, arr.length));
	}
}