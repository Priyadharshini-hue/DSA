/*
Check if a string is Isogram or not
Given a string S of lowercase alphabets, check if it is isogram or not. An Isogram is a string in which no letter occurs more than once.

Example 1:

Input:
S = machine
Output: 1
Explanation: machine is an isogram
as no letter has appeared twice. Hence
we print 1.
Example 2:

Input:
S = geeks
Output: 0
Explanation: geeks is not an isogram
as 'e' appears twice. Hence we print 0.
Your Task:
This is a function problem. You only need to complete the function isIsogram() that takes a string
as a parameter and returns either true or false.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Number of distinct characters).

*/

class Isogram{
	static boolean isIsogram(String str){
		int[] count = new int[26];
		
		for(int i = 0; i < str.length(); i++){
			count[str.charAt(i) - 'a']++;
		}
		
		for(int i = 0; i < 26; i++){
			if(count[i] > 1){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args){
	String str = "htcrqspxfxeoxbrizxhsatzlpznaqcczwfqozfleesvbvmmvjtplpqxermehpiinpybofpvjjqleexbqsqbhjananrk";
	if(isIsogram(str)){
		System.out.println("1");
	}else{
		System.out.println("0");
	}
	}
}