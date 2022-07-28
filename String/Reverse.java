/*
Reverse a String

Example 1:

Input:
s = Geeks
Output: skeeG
Example 2:

Input:
s = for
Output: rof
Your Task:

You only need to complete the function reverseWord() that takes s as parameter and returns the reversed string.

Expected Time Complexity: O(|S|).
Expected Auxiliary Space: O(1).
*/

class Reverse{
	static String reverseWord(String str){
		
		String str1 = "";
		
		for(int i = str.length()-1; i >= 0; i--){
			str1+=str.charAt(i);
		}
		return str1;
	}	
	public static void main(String[] args){
		String s = "Geeks";
		System.out.println(reverseWord(s));
	}
}