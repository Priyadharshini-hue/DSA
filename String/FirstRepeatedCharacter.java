/*
Find first repeated character

Given a string S. 
The task is to find the first repeated character in it. 
We need to find the character that occurs more than once and whose index of second occurrence is smallest. 
S contains only lowercase letters.
Example 1:

Input: S="geeksforgeeks"
Output: e
Explanation: 'e' repeats at third position.
 
Example 2:

Input: S="hellogeeks"
Output: l
Explanation: 'l' repeats at third position.
 
Example 3:

Input: S="abc"
Output: -1
Explanation: There is no repeated character.
Your Task:  
You don't need to read input or print anything. 
Your task is to complete the function firstRepChar() which accepts a string S as input parameter and 
returns a string containing first repeated character in it. If there is no repeated character in the string S then return "-1".
*/

class FirstRepeatedCharacter{
	
	static String firstRepChar(String s){
		
		// Initialize map array of length 26
        int[] map = new int[26];
		
		// Traverse the string s
		for(int i  = 0; i < s.length(); i++){
			
			// if map contains the character frequency, return the charater
			if(map[s.charAt(i) - 'a'] >= 1){
				return (Character.toString(s.charAt(i)));   // e for geeksforgeeks
			}
			// else increment the frequency by 1
			else{
				map[s.charAt(i) - 'a']++;
			}
		}
		
		return "-1";
	}
	
	public static void main(String[] args){
		String s = "geeksforgeeks";
		
		System.out.print(firstRepChar(s));
	}
}