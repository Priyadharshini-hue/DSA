/*
Check if two strings are k-anagrams or not
Given two strings of lowercase alphabets and a value K, your task is to complete the given function 
which tells if  two strings are K-anagrams of each other or not.

Two strings are called K-anagrams if both of the below conditions are true.
1. Both have same number of characters.
2. Two strings can become anagram by changing at most K characters in a string.

Example:
Input:
str1 = "fodr", str2="gork"
k = 2
Output:
1
Explanation: Can change fd to gk
Your Task:
Since this is a function problem, you don't need to take any input. 
Just complete the given function areKAnagrams that returns true if the strings can be turned into K-anagrams, else return false.
*/
import java.util.*;

class AnagramsK{
	static boolean isAnagramsbyK(String s1, String s2){
		HashMap<Character, Integer> map = new HashMap<>();
		int k = 0;
		
		if(s1.length() != s2.length()){
			return false;
		}
		
		for(int i = 0; i < s1.length(); i++){
			if(!map.containsKey(s1.charAt(i))){
				map.put(s1.charAt(i), 1);
			}else{
				map.put(s1.charAt(i), map.get(s1.charAt(i))+1);
			}
		}
		
		for( int i = 0; i < s2.length(); i++ ){
			if(!map.containsKey(s2.charAt(i))){
				k++;
			}
		}
		return k == 2 ? true : false;
	}
	
	public static void main(String[] args){
		String str1 = "fodrd", str2="gorkv";
		
		System.out.println(isAnagramsbyK(str1, str2));
	}
}