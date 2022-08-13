/*
Sum of Series
Write a program to find the sum of the given series 1+2+3+ . . . . . .(N terms) 

Example 1:

Input:
N = 1
Output: 1
Explanation: For n = 1, sum will be 1.
Example 2:

Input:
N = 5
Output: 15
Explanation: For n = 5, sum will be 1
+ 2 + 3 + 4 + 5 = 15.
Your Task:
Complete the function seriesSum() which takes single integer n, 
as input parameters and returns an integer denoting the answer. You don't to print answer or take inputs.
*/

class SumOfSeries{
	
	static long seriesSum(int n){
		return ((n)*(n+1))/2;
	}
	
	public static void main(String[] args){
		
		int n = 5;
		
		System.out.println(seriesSum(n));
	}
}