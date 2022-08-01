/*
Replace all 0's with 5
You are given an integer N. You need to convert all zeroes of N to 5.

Example 1:

Input:
N = 1004
Output: 1554
Explanation: There are two zeroes in 1004
on replacing all zeroes with "5", the new
number will be "1554".
Example 2:

Input:
N = 121
Output: 121
Explanation: Since there are no zeroes in
"121", the number remains as "121".
Your Task:
Your task is to complete the function convertFive() which takes an integer N as an argument and replaces all zeros in the number N with 5. 
Your function should return the converted number.
*/

class Replace0with5{
	
	static int convertFive(int n){
		
		if(n == 0){
			return 5;
		}
		
		int t = n, result = 0, d =1;
		
		while(n>0){
			if( n%10 == 0){
				result = result + (5*d);
			}
			n = n/10;
			d = d*10;
		}		
		return t+result;
	}
	
	public static void main(String[] args){
		
		int number = 1007094;
		
		System.out.println(convertFive(number));
	}
}