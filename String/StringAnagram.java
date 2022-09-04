/*
Anagram
Given two stringsaandbconsisting of lowercase characters. The task is to check whether two given strings are an anagram of each other or not. 
An anagram of a string is another string that contains the same characters, only the order of characters can be different. 
For example, act and tac are an anagram of each other.

Example 1:

Input:a = geeksforgeeks, b = forgeeksgeeks
Output: YES
Explanation: Both the string have samecharacters with
        same frequency. So, both are anagrams.
Example 2:

Input:a = allergy, b = allergic
Output: NO
Explanation:Characters in both the strings are 
        not same, so they are not anagrams.
Your Task:
You don't need to read input or print anything. 
Your task is to complete the function isAnagram() which takes the string a and string b as input parameter and 
check if the two strings are an anagram of each other. The function returns true if the strings are anagram else it returns false.
*/

class StringAnagram{
	
	static String isAnagram(String s1, String s2){
		int[] alphabetsArr = new int[256];
		
		for(int i = 0; i < s1.length(); i++){
			alphabetsArr[s1.charAt(i)]++;
		}
		for(int i = 0; i < s2.length(); i++){
			if(alphabetsArr[s2.charAt(i)] != 0){
				alphabetsArr[s2.charAt(i)]--;
			}else{
				return "NO";
			}
		}
		return "YES";
	}

	public static void main(String[] args){
		String a = "geeksforgeeks", b = "forgeeksgeeks";
		System.out.println(isAnagram(a.replaceAll("\\s",""), b.replaceAll("\\s","")));
	}
}
