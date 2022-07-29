/*
Anagram of String

Given two strings S1 and S2 in lowercase, the task is to make them anagram. 
The only allowed operation is to remove a character from any string. 
Find the minimum number of characters to be deleted to make both the strings anagram. 
Two strings are called anagram of each other if one of them can be converted into another by rearranging its letters.

Example 1:

Input:
S1 = bcadeh
S2 = hea
Output: 3
Explanation: We need to remove b, c
and d from S1.
Example 2:

Input:
S1 = cddgk
S2 = gcd
Output: 2
Explanation: We need to remove d and
k from S1.
Your Task:
Complete the function remAnagram() which takes two strings S1, S2 as input parameter, and returns minimum characters needs to be deleted.
*/
import java.util.*;

class MakeAnagramByDeleting{
	//O(n) & O(1)
	static int remAnagram(String s1, String s2){
		int[] count = new int[26];
		int sum = 0;
		for(int i = 0; i < s1.length(); i++){
			count[s1.charAt(i) - 'a']++;
		}
		for(int i = 0; i < s2.length(); i++){
			count[s2.charAt(i) - 'a']--;
		}
		//System.out.println(Arrays.toString(count));
		for(int n : count){
			sum += Math.abs(n);
		}
		
		return sum;
	}
	public static void main(String[] args){
		String s1 = "basgadhbfgvhads";
		String s2 = "sjdhgvbjdsbhvbvd";
		System.out.println(remAnagram(s1,s2));
	}
}