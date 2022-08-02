/*
Print Anagrams Together
Given an array of strings, return all groups of strings that are anagrams. 
The groups must be created in order of their appearance in the original array. 
Look at the sample case for clarification.

Note: The final output will be in lexicographic order.


Example 1:

Input:
N = 5
words[] = {act,god,cat,dog,tac}
Output:
act cat tac 
god dog
Explanation:
There are 2 groups of
anagrams "god", "dog" make group 1.
"act", "cat", "tac" make group 2.
Example 2:

Input:
N = 3
words[] = {no,on,is}
Output: 
no on
is
Explanation:
There are 2 groups of
anagrams "no", "on" make group 1.
"is" makes group 2. 
*/
import java.util.*;

class GroupAnagrams{
	static LinkedList<LinkedList<String>> group(String[] words){
		HashMap<String, LinkedList<String>> map = new HashMap<>();
		
		for(int i = 0; i < words.length; i++){
			String word = words[i];
			char[] wordArr = (word.toLowerCase()).toCharArray();
			
			Arrays.sort(wordArr);
			String w = new String(wordArr);
			
			if(!map.containsKey(w)){
				LinkedList<String> l = new LinkedList<>();
				l.add(word);
				map.put(w, l);
			}else{
				map.get(w).add(word);
			}
			System.out.println(map);
		}
		
		LinkedList<LinkedList<String>> list = new LinkedList<>();
		
		for(Map.Entry<String, LinkedList<String>> m : map.entrySet()){
			list.add(m.getValue());
		}
		
	return list;
	}
	public static void main(String[] args){
		String words[] = {"act","god","cat","dog","tac"}; 
		
		System.out.println(group(words));
	}
}
