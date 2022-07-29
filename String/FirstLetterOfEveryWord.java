/*
Print first letter of every word in the string

Given a string S, the task is to create a string with the first letter of every word in the string.
 

Example 1:

Input: 
S = "geeks for geeks"
Output: gfg

Example 2:

Input: 
S = "bad is good"
Output: big

Your Task:
You don't need to read input or print anything. Your task is to complete the function firstAlphabet() 
which takes string S as input parameter and returns a string that contains the first letter of every word in S.
*/

class FirstLetterOfEveryWord{
	static String firstAlphabet(String s){
		String result = "";
		result += s.charAt(0);
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == ' '){
				result+=s.charAt(i+1);
			}
		}
		return result;
	}
	
	public static void main(String args[]){
		String str = "tzm t styb ryndk rny ftux oh bjvc";
		System.out.println(firstAlphabet(str));
	}
}