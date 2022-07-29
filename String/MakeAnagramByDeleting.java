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
	//O(n) & O(n)
	static int remAnagram(String s1, String s2){
		HashMap<Character, Integer> m = new HashMap<>();
		
		for(int i = 0; i < s1.length(); i++){
			if(m.containsKey(s1.charAt(i))){
				m.put(s1.charAt(i), m.get(s1.charAt(i))+1);
			}else{
				m.put(s1.charAt(i), 1);
			}
		}
		for(int i = 0; i < s2.length(); i++){
			//checking whether the letter is present as key in map and also the letter is already present in map since it is 1st word character
			if(m.containsKey(s2.charAt(i)) && s1.indexOf(s2.charAt(i)) != -1){
				m.put(s2.charAt(i), m.get(s2.charAt(i))-1);
			}
			else{
				if(m.containsKey(s2.charAt(i))){
				m.put(s2.charAt(i), m.get(s2.charAt(i))+1);
			}else{
				m.put(s2.charAt(i), 1);
			}
			}
		}
		System.out.println(m);
		int sum = 0;
		for(int num : m.values()){
			sum+=Math.abs(num);
		}
		return sum;
	}
	public static void main(String[] args){
		String s1 = "basgadhbfgvhads";
		String s2 = "sjdhgvbjdsbhvbvd";
		System.out.println(remAnagram(s1,s2));
	}
}