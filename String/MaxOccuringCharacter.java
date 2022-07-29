/*
Maximum Occuring Character
Given a string str. The task is to find the maximum occurring character in the string str. 
If more than one character occurs the maximum number of time then print the lexicographically smaller character.
Example 1:

Input:
str = testsample
Output: e
Explanation: e is the character which
is having the highest frequency.
Example 2:

Input:
str = output
Output: t
Explanation:  t and u are the characters
with the same frequency, but t is
lexicographically smaller.
Your Task:
The task is to complete the function getMaxOccuringChar() which returns the character which is most occurring.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Number of distinct characters).
*/
import java.util.*;

class MaxOccuringCharacter{
	static char getMaxOccuringChar(String str){
		TreeMap<Character, Integer> m = new TreeMap<>();
		
		for(int i = 0; i < str.length(); i++){
			if(m.containsKey(str.charAt(i))){
				m.put(str.charAt(i), m.get(str.charAt(i))+1);
			}else{
				m.put(str.charAt(i), 1);
			}
		}
		int max = 0; char a= ' ';
		//System.out.println(m);
		for(Map.Entry<Character, Integer> v : m.entrySet()){
			if(max < v.getValue()){
				max = v.getValue();
				a = v.getKey();
			}
			
		}

		return a;
	}
	public static void main(String[] args){
		String str = "testsample";
		System.out.println(getMaxOccuringChar(str));
	}
}