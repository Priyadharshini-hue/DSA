/*
Uncommon characters

Given two strings A and B. Find the characters that are not common in the two strings. 

Example 1:

Input:
A = geeksforgeeks
B = geeksquiz
Output: fioqruz
Explanation: 
The characters 'f', 'i', 'o', 'q', 'r', 'u','z' 
are either present in A or B, but not in both.
Example 2:

Input:
A = characters
B = alphabets
Output: bclpr
Explanation: The characters 'b','c','l','p','r' 
are either present in A or B, but not in both.

Your Task:  
You dont need to read input or print anything. 
Complete the function UncommonChars() which takes strings A and B as input parameters and 
returns a string that contains all the uncommon characters in sorted order. If no such character exists return "-1".
*/
import java.util.*;

class UncommonCharacters{
	
	static String uncommonChars(String A, String B){
		
		// initialize AB to store the uncommon characters in two strings
		String AB = "";
		
		// initialize array to store the presence of characters
		int[] alphabets = new int[26];
		
		// mark as 1 for the presence of each character in A
		for(char c : A.toCharArray()){
			alphabets[c - 'a'] = 1;
		}
		
		for(char c : B.toCharArray()){
			// mark as -1 for the presence of each character in both A and B
			if(alphabets[c - 'a'] == 1 || alphabets[c - 'a'] == -1){
				alphabets[c - 'a'] = -1;
			}
			// mark as 2 for the presence of each character in B
			else{
				alphabets[c - 'a'] = 2;
			}
		}		
		
		// concatenate the uncommon characters in AB 
		for(int i = 0; i < 26; i++){
			if(alphabets[i] == 1 || alphabets[i] == 2){
				AB += (char)(i + 'a');
			}
		}
		
		// print AB if the string is not empty
		return AB != "" ? AB : "-1";
	}

	public static void main(String[] args){
		
		String A = "geeksforgeeks", B = "geeksquiz" ;
	
		System.out.print(uncommonChars(A, B));
	}
}