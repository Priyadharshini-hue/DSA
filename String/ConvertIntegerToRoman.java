/*
Convert to Roman No
Given an integer n, your task is to complete the function convertToRoman which prints the corresponding roman number of n. 
Various symbols and their values are given below
Note:- There are a few exceptions for some numbers like 4 in roman is IV,
9 in roman is IX, similarly, 40 is XL while 90 is XC. 
Similarly, 400 is CD while 900 is CM

I 1
V 5
X 10
L 50
C 100
D 500
M 1000

Example 1:

Input:
n = 5
Output: V

Example 2:

Input:
n = 3
Output: III
 
Your Task:
Complete the function convertToRoman() which takes an integer N as input parameter and returns the equivalent roman. 
*/

class ConvertIntegerToRoman{

	static String convertToRoman(int n){
		
		int[] integersArray = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		String[] romamArray = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "XI", "V", "IV", "I"};
		StringBuilder roman = new StringBuilder();
		
		for(int i = 0; i < integersArray.length; i++){
			while(integersArray[i] <= n ){
				roman.append(romamArray[i]);
				n -= integersArray[i];
			}
		}
		
		return roman.toString();
	}
	
	public static void main(String[] args){
		int n = 3;
		
		System.out.println(convertToRoman(n));
	}
}