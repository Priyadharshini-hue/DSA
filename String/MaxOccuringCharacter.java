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
	// O(n) & O(1)
class MaxOccuringCharacter{
	static char getMaxOccuringChar(String str){
		
		int[] count = new int[26];
		
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i)!= ' '){
				count[str.charAt(i) - 'a']++;
			}
		}
		System.out.println(Arrays.toString(count));
		int max = -1;
		char maxCharacter = 0;
		for(int i = 0; i < 26; i++){
			if(max < count[i]){
				max = count[i];
				maxCharacter = (char )(i + 'a');
			}
		}
		return maxCharacter;
	}
	public static void main(String[] args){
		String str = "test ete";
		System.out.println(getMaxOccuringChar(str));
	}
}