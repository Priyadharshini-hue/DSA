/*
Given an array of integers, find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers, 
the consecutive numbers can be in any order. 
Input: arr[] = {1, 9, 3, 10, 4, 20, 2}
Output: 4
Explanation: 
The subsequence 1, 3, 4, 2 is the longest 
subsequence of consecutive elements

Input: arr[] = {36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42}
Output: 5
Explanation: 
The subsequence 36, 35, 33, 34, 32 is the longest 
subsequence of consecutive elements.
*/
import java.util.*;

class LongestSubSequence{
	/*
	// log n & n
	static void sequence(int[] arr, int length){
		
		HashSet<Integer> s = new HashSet<Integer>();
		
		int ans = 0;
		
		for(int i = 0; i < length; i++){
			s.add(arr[i]);
		}
		
		for(int i = 0; i < length; i++){
			
			if(!s.contains(arr[i] - 1)){
				
				int j = arr[i]; 
				
				while(s.contains(j)){
					j++;
				}
				
				if(ans < j - arr[i]){
					ans = j - arr[i];
				}
			}
		}
		System.out.println(ans);
	}
*/
	// n log n
	static void sequence(int[] arr, int length){
		
		Arrays.sort(arr);  // 1,2,3,4,9,10,20
		
		int t = 1, res = 0;
		
		for(int i = 1; i < length; i++){
			if(arr[i] - arr[i-1] == 1){
				t++;
			}else{
				t = 1;
			}
			
			if(res < t){
				res = t;
			}
		}
		System.out.println(res);
	}
	public static void main(String[] args){
		int[] arr = {36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42};
		
		sequence(arr, arr.length);
	}
}