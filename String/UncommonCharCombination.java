/*
Remove common characters and concatenate
Given two strings s1 and s2. Modify both the strings such that all the common characters of s1 and s2 are to be removed and 
the uncommon characters of s1 and s2 are to be concatenated.
Note: If all characters are removed print -1.

Example 1:

Input:
s1 = aacdb
s2 = gafd
Output: cbgf
Explanation: The common characters of s1
and s2 are: a, d. The uncommon characters
of s1 and s2 are c, b, g and f. Thus the
modified string with uncommon characters
concatenated is cbgf.
Example 2:

Input:
s1 = abcs
s2 = cxzca
Output: bsxz
Explanation: The common characters of s1
and s2 are: a,c. The uncommon characters
of s1 and s2 are b,s,x and z. Thus the
modified string with uncommon characters
concatenated is bsxz.

Your Task:
The task is to complete the function concatenatedString() which removes the common characters, concatenates, and 
returns the string. If all characters are removed then return -1.
*/
import java.util.*;
class UncommonCharCombination{
	static String concatenatedString(String s1, String s2){
		HashMap<Character, Integer> map = new HashMap<>();
		String result = "";
		
		for(int i = 0; i < s2.length(); i++){
			if(!map.containsKey(s2.charAt(i))){
				map.put(s2.charAt(i), 1);
			}
		}
		
		for(int i = 0; i < s1.length(); i++){
			if(!map.containsKey(s1.charAt(i))){
				result+=s1.charAt(i);
			}else{
				map.put(s1.charAt(i), 2);
			}
		}
		
		for(int i = 0; i < s2.length(); i++){
			if(map.get(s2.charAt(i)) == 1){
				result+=s2.charAt(i);
			}
		}
		if(result == ""){
			result = "-1";
		}
		return result;
	}

	public static void main(String[] args){
		String s1 = "aacdb";
		String s2 = "gafd";
		
		System.out.println(concatenatedString(s1, s2));
	}
}