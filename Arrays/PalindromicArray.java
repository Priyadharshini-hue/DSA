/*
Palindromic Array

Given a Integer array A[] of n elements. 
Your task is to complete the function PalinArray. 
Which will return 1 if all the elements of the Array are palindrome otherwise it will return 0.

Example:

Input:
5
111 222 333 444 555
3
121 131 20

Output:
1
0
*/

class PalindromicArray{
	
	static int palinArray(int[] arr, int length){
		// intialize count of the palindrome number
		int count = 0;
		// traversing from 0 to n-1
		for(int i = 0; i < length; i++){
			// intialize temporary - element and temp
			int element = arr[i], temp = 0;
			// reversing the number
			while(element > 0){
				int lastDigit = element % 10;
				temp = (temp*10) + lastDigit;
				element /= 10;
			}
			// if reversed number in temp is equal to arr[i]
			if(arr[i] == temp){
				count+=1;
			}
		}
		// return if the length equal or not
		return count == length ? 1 : 0;
	}

	public static void main(String[] args){
		int[] arr = { 111, 222, 333, 444, 666 , 32};
		
		System.out.println(palinArray(arr, arr.length));
	}
}