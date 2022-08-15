/*
Check for Binary

Given a non-empty sequence of characters str, return true if sequence is Binary, else return false

Example 1:

Input:
str = 101
Output:
1
Explanation:
Since string contains only 0 and 1, output is 1

Example 2:

Input:
str = 75
Output:
0
Explanation:
Since string contains digits other than 0 and 1, output is 0.
 

Your Task:
Complete the function isBinary() which takes an string str as input parameter and returns 1 if str is binary and returns 0 otherwise.
*/

class CheckForBinary{

	static boolean isBinary(String str){
		
		// s contains 0 & 1, it may be one or more than one
		String s = "[0-1]+"; // ^[0-1]+$
		
		// if str matches s, return true
		if(str.matches(s)) return true;
		else return false;		
		/* without regex
		for(char c : str.toCharArray()){
			if(c != '1' && c != '0'){
				return false;
			}
		}
		return true;*/
	}

	public static void main(String[] args){
		
		String str = "11";
	
		System.out.print(isBinary(str));
	}
}