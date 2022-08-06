//To find the sub-array(s) of given sum including -ve numbers

import java.util.*;

class SubArrayWithGivenSumNegative{
	
	static void findArray(int[] arr, int length, int sum){
		
		int currentSum = 0, start = 0, end = 0;
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < length; i++){
			
			end = i;
			currentSum = currentSum + arr[i];
			
			if(currentSum == sum){
				System.out.println(start + " " + end);
				System.out.println(Arrays.toString(Arrays.copyOfRange(arr, start, end+1)));
			}
			
			int diff = currentSum - sum;
			
			if(map.containsKey(diff)){
				start = map.get(diff) + 1;
				System.out.println(start + " " + end);
				System.out.println(Arrays.toString(Arrays.copyOfRange(arr, map.get(diff) + 1, end+1)));
			}
			
			map.put(currentSum, i);
			
		}
	}

	public static void main(String[] args){
		int[] arr = {20, 12, -2, -20, 10, -10};
		int k = -10;
		
		findArray(arr, arr.length, k);
	}
}