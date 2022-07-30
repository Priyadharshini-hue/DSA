/*
Binary String

Given a binary string S. The task is to count the number of substrings that start and end with 1. 
For example, if the input string is “00100101”, 
then there are three substrings “1001”, “100101” and “101”.

Example 1:

Input:
N = 4
S = 1111
Output: 6
Explanation: There are 6 substrings from
the given string. They are 11, 11, 11,
111, 111, 1111.
Example 2:

Input:
N = 5
S = 01101
Output: 3
Explanation: There 3 substrings from the
given string. They are 11, 101, 1101.
Your Task: 1234 
The task is to complete the function binarySubstring() which takes the length of binary string n and 
a binary string a as input parameter and counts the number of substrings starting and ending with 1 and returns the count.
*/
class BinaryString{
	// O(n) & O(1)
	static int binarySubstring(int a, String s){
		int count = 0;
		
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == '1'){
				count++;
			}
		}
		return (count*(count-1))/2;	
	}
	
	public static void main(String[] args){
		int n = 4;
		String str = "01101";
		System.out.println(binarySubstring(n, str));
	}
}