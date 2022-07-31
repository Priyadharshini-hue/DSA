/*
Repeated Character
Given a string consisting of lowercase english alphabets. Find the repeated character present first in the string.

Example 1:

Input:
S = "geeksforgeeks"
Output: g
Explanation: g, e, k and s are the repeating
characters. Out of these, g occurs first. 
Example 2:

Input: 
S = "abcde"
Output: -1
Explanation: No repeating character present.

Your Task:
You don't need to read input or print anything. 
Your task is to complete the function firstRep() which takes the string S as input and 
returns the the first repeating character in the string. In case there's no repeating character present, return '#'.
*/
import java.util.*;

class RepeatedCharacter{
	
	static char firstRep(String str){
		int[] alphabetsArray = new int[26];
		
		for(int i = 0; i < str.length(); i++){
			alphabetsArray[str.charAt(i)- 'a']++;
		}
		//System.out.println(Arrays.toString(alphabetsArray));
		for(int i = 0; i < str.length(); i++){
			if(alphabetsArray[str.charAt(i)- 'a'] > 1){
				return str.charAt(i);
			}
		}
		
		return '#';
	}

	public static void main(String[] args){
		String str = "qwdqwdgew";
		
		System.out.println(firstRep(str));
	}
}