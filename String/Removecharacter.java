/*
Remove character

Given two strings string1 and string2, remove those characters from first string(string1) which are present in second string(string2). Both the strings are different and contain only lowercase characters.
NOTE: Size of  first string is always greater than the size of  second string( |string1| > |string2|).
 

Example 1:

Input:
string1 = "computer"
string2 = "cat"
Output: "ompuer"
Explanation: After removing characters(c, a, t)
from string1 we get "ompuer".
Example 2:

Input:
string1 = "occurrence"
string2 = "car"
Output: "ouene"
Explanation: After removing characters
(c, a, r) from string1 we get "ouene".
 

Your Task:  
You dont need to read input or print anything. 
Complete the function removeChars() which takes string1 and string2 as input parameter and 
returns the result string after removing characters from string2  from string1.
*/
class Removecharacter{
	
	static String removeChars(String A, String B){
		//Initialize string s
		String s = "";
		
		// Traverse the string A
		for(char c : A.toCharArray()){
			//	if the character is not in B, then concatenate in s
			if(B.indexOf(c) == -1){
				s+=c;
			}
		}
		return s;
	}
    
	public static void main(String[] args){
		String A = "occurrence";
		String B = "car";
		
		System.out.print(removeChars(A, B));
	}
}