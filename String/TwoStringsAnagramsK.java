/*
Check if two strings are k-anagrams or not
Given two strings of lowercase alphabets and a value K, 
your task is to complete the given function which tells if  two strings are K-anagrams of each other or not.

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
class TwoStringsAnagramsK{
	
	static boolean isAnagrams(String s1, String s2, int m){
		int[] alphabetsArray = new int[26];
		int k = 0;
		if(s1.length() != s2.length()){
			return false;
		}
		for(int i = 0; i < s1.length(); i++){
			alphabetsArray[s1.charAt(i) - 'a']++;
		}
		System.out.println(Arrays.toString(alphabetsArray));
		
		for(int i = 0; i < s2.length(); i++){
			if(alphabetsArray[s2.charAt(i) - 'a'] > 0){
				alphabetsArray[s2.charAt(i) - 'a']--;
			}
		}
		for(int i = 0; i < 26; i++){
			if(alphabetsArray[i] > 0){}
		}
		System.out.println(s2.length());
		System.out.println(Arrays.toString(alphabetsArray));
		return k <= m ? true : false ;
	}

	public static void main(String[] args){
		String str1 = "ukdbgygrsjlaukwsgc", str2="memdwhetaewfahkc";
		int k = 14;
		System.out.println(isAnagrams(str1, str2, k));
	}
}