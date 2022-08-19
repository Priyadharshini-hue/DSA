/*
Print all pairs in an unsorted array with equal sum
Given an unsorted array A[]. The task is to print all unique pairs in the unsorted array with equal sum.

Input: A[] = { 6, 4, 12, 10, 22, 54, 32, 42, 21, 11}
Output:
Pairs : ( 4, 12) ( 6, 10)  have sum : 16
Pairs : ( 10, 22) ( 21, 11)  have sum : 32
Pairs : ( 12, 21) ( 22, 11)  have sum : 33
Pairs : ( 22, 21) ( 32, 11)  have sum : 43
Pairs : ( 32, 21) ( 42, 11)  have sum : 53
Pairs : ( 12, 42) ( 22, 32)  have sum : 54
Pairs : ( 10, 54) ( 22, 42)  have sum : 64
*/
import java.util.*;

class AllPairsOfEqualSum{
	
	static void findPairs(int[] arr, int n){
		// hashmap to store the pairs 
		HashMap<Integer, Integer> pairs = new HashMap<>();
		
		// traverse through the array from 0 to n
		for(int i = 0; i < n; i++){
			// traverse through the array from i to n
			for(int j = i+1; j < n; j++){
				// if the sum exists in the pairs, print the current pair and the value from pairs
				if(pairs.containsKey(arr[i] + arr[j])){
					System.out.println( arr[i] + "," + arr[j] + "=>" + ((arr[i] + arr[j]) - pairs.get(arr[i] + arr[j])));
				}
				// else put the new pair in pairs
				else{
					pairs.put(arr[i] + arr[j], arr[i]);
				}
			}
		}
	}

	public static void main(String[] args){
		int[] arr = { 6, 4, 12, 10, 22, 54, 32, 42, 21, 11};
		
		findPairs(arr, arr.length);
	}
}