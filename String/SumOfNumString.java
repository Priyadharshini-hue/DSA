/*
Sum of numbers in string

Given a string str containing alphanumeric characters. The task is to calculate the sum of all the numbers present in the string.

Example 1:

Input:
str = 1abc23
Output: 24
Explanation: 1 and 23 are numbers in the
string which is added to get the sum as
24.
Example 2:

Input:
str = geeks4geeks
Output: 4
Explanation: 4 is the only number, so the
sum is 4.
Your Task:
The task is to complete the function findSum() which finds and returns the sum of numbers in the string.
*/

class SumOfNumString{
	
	static int findSum(String s){
		int sum = 0;
		String number = "0";
		
		for(int i = 0; i < s.length(); i++){
			if(Character.isDigit(s.charAt(i))){
				number += s.charAt(i);
			}else{
				sum += Integer.parseInt(number);
				number="0";
			}
		}
		
		return sum += Integer.parseInt(number);
	}

	public static void main(String args[]){
		String str = "1abc23f891";
		System.out.println(findSum(str));
	}
}