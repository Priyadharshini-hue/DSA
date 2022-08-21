/*
longest substring containing '1'
Given a function that takes a binary string. The task is to return the longest size of contiguous substring containing only ‘1’.

Input:
The first line of input contains an integer T denoting the no of test cases.Then T test cases follow. Each test case contains a string S.

Output:
For each test case return the maximum length of required sub string.

Constraints: 
1<=T<=100
1<=|string length|<=104

Example:
Input:
2
110
11101110
Output:
2
3
*/
class LongestSubStringOf1{
	
	static int count(String s){
		int length = 0, count = 0;
		
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == '1'){
				count++;
				length = Math.max(length, count);
			}else{
				count = 0;
			}
		}
		return (length);
	}
    
	public static void main(String[] args){
		String s = "11101110";
		
		System.out.print(count(s));
	}
}