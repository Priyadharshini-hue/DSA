/*
Check if two arrays are equal or not

Given two arrays A and B of equal size N, the task is to find if given arrays are equal or not. 
Two arrays are said to be equal if both of them contain same set of elements, arrangements (or permutation) of elements may be different though.
Note : If there are repetitions, then counts of repeated elements must also be same for two array to be equal.

Example 1:

Input:
N = 5
A[] = {1,2,5,4,0}
B[] = {2,4,5,0,1}
Output: 1
Explanation: Both the array can be 
rearranged to {0,1,2,4,5}
Example 2:

Input:
N = 3
A[] = {1,2,5}
B[] = {2,4,15}
Output: 0
Explanation: A[] and B[] have only 
one common value.

Your Task:
Complete check() function which takes both the given array and their size as function arguments and 
returns true if the arrays are equal else returns false.The 0 and 1 printing is done by the driver code.
*/
import java.util.*;

class TwoArraysEquality{
	// O(n) & O(n)
	static int check(int[] a, int[] b){
		int aLength = a.length, bLength = b.length, count = 0;
		HashMap<Integer, Integer> map = new HashMap<>(); 
		
		if(aLength != bLength){
			return 0;
		}
		
		for(int i = 0; i < aLength; i++){
			if(map.containsKey(a[i])){
				map.put(a[i], map.get(a[i])+1);
			}else{
				map.put(a[i], 1);
			}
		}
		
		for(int i = 0; i < bLength; i++){
			if(map.containsKey(b[i]) && map.get(b[i]) != 0){
				map.put(b[i], map.get(b[i])-1);
			}else{
				return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args){
		int[] A = {1,2,5,4,0,4,6};
		int[] B = {2,4,5,0,1,4,5};
		
		System.out.println(check(A,B));
	}
	
}