/*
Check for subsequence
Given two strings A and B, find if A is a subsequence of B.

Example 1:
Input:
A = AXY 
B = YADXCP
Output: 0 
Explanation: A is not a subsequence of B
as 'Y' appears before 'A'.

Example 2:
Input:
A = gksrek
B = geeksforgeeks
Output: 1
Explanation: A is a subsequence of B.

Your Task:  
You dont need to read input or print anything. 
Complete the function isSubSequence() which takes A and B as input parameters and 
returns a boolean value denoting if A is a subsequence of B or not. 
*/

class SubSequence{
	
	static int isSubSequence(String A, String B){
		//Initialize tIndex and count
		int tIndex = 0, count = -1;
		
		// Traverse the string A
		for(int  i = 0; i < A.length(); i++){
			// Increment tIndex by 1 till the length of A and if b eqauls A 
			if( tIndex < A.length() && B.charAt(i) == A.charAt(tIndex)){
				tIndex++;
			}
		}
		return tIndex == A.length() ? 1 :0;
	}

	public static void main(String[] args){
		String A = "AXY", B = "YADXCPY";
		
		System.out.print(isSubSequence(A, B));
	}
}