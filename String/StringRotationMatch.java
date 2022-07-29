/*
Check if strings are rotations of each other or not
Given two strings s1 and s2. The task is to check if s2 is a rotated version of the string s1. 
The characters in the strings are in lowercase. 

Example 1:

Input:
geeksforgeeks
forgeeksgeeks
Output: 
1
Explanation: s1 is geeksforgeeks, s2 is
forgeeksgeeks. Clearly, s2 is a rotated
version of s1 as s2 can be obtained by
left-rotating s1 by 5 units.

Example 2:

Input:
mightandmagic
andmagicmigth
Output: 
0
Explanation: Here with any amount of
rotation s2 can't be obtained by s1.

Your Task:
The task is to complete the function areRotations() which checks if the two strings are rotations of each other.
The function returns true if string 1 can be obtained by rotating string 2, else it returns false.
 
Expected Time Complexity: O(N).
Expected Space Complexity: O(N).
*/
class StringRotationMatch{
	//O(n2) & O(n)
	/*static boolean rotated(String s1, String s2){
		
		int start = s1.indexOf(s2.charAt(0));
		int j = 0, i = start;
		
		if(s1.length() == s2.length()){
			for(; i < s1.length(); i++){
				if(s1.charAt(i) == s2.charAt(j)){
					j++;
				}
			}
		
			if(i == s1.length()){
				for(int k = 0; k < start; k++){
					if(s1.charAt(k) == s2.charAt(j)){
					j++;
					}
				}
			}
			
			System.out.println(j);
			if(j == i){
				return true;
			}
			
		}
		return false;
	}*/
	
	static boolean rotated(String s1, String s2){
		// Strings are not equal
		if(s1.length() != s2.length()) return false;
		
		// Strings are equal
		int k = 0, i = 0;
		
		while(i < s1.length()){
			if(s1.charAt(i) == s2.charAt(k)){
				k++;
				i++; // increment if equal
			}
			else{
				if(k == 0){
					k = 0;
					i++; // increment if not checked for equalize previously 
				}
				else{
					k = 0; // reset the k value, without incrementing i. Because there is a possibilty k==i.
				}
			}
		}
		System.out.println(k);
		i = 0;
		for(int l = k; l < s1.length(); l++){
			if(s2.charAt(l)== s1.charAt(i)){
				i++;
			}else{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args){
		String s1 = "vcuszhlbtpmksjleuchmjffufrwpiddgyynfujnqblngzoogzg";
		String s2 = "fufrwpiddgyynfujnqblngzoogzgvcuszhlbtpmksjleuchmjf";
		
		System.out.println(rotated(s1,s2));
	}
}