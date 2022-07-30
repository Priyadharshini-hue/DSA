/*
Remove Consecutive Characters
Given a string S. For each index i(1<=i<=N-1), erase it if s[i] is equal to s[i-1] in the string.

Example 1:

Input:
S = aabb
Output:  ab 
Explanation: 'a' at 2nd position is
appearing 2nd time consecutively.
Similiar explanation for b at
4th position.

Example 2:

Input:
S = aabaa
Output:  aba
Explanation: 'a' at 2nd position is
appearing 2nd time consecutively.
'a' at fifth position is appearing
2nd time consecutively.
 

Your Task:
You dont need to read input or print anything. 
Complete the function removeConsecutiveCharacter() which accepts a string as input parameter and returns modified string.
*/

class ConsecutiveCharacter{
	static String removeConsecutiveCharacter(String s){
		String modifiedString = "";
	
		for(int i = 0; i < s.length()-1; i++){
			if(s.charAt(i) != s.charAt(i+1)){
				modifiedString += s.charAt(i);
			}
		}	
		modifiedString += s.charAt(s.length()-1);
		
		return modifiedString;
	}

	public static void main(String[] args){
		String S = "a";
		System.out.println(removeConsecutiveCharacter(S));
	}
}