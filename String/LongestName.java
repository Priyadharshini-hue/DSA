/*
Display longest name
Given a list of names, display the longest name.

Example:

Input:
N = 5
names[] = { "Geek", "Geeks", "Geeksfor",
  "GeeksforGeek", "GeeksforGeeks" }

Output:
GeeksforGeeks

Your Task:  
You don't need to read input or print anything. 
Your task is to complete the function longest() which takes the array names[] and
its size N as inputs and returns the Longest name in the list of names.
*/

class LongestName{

	static String longest(String names[], int length) {
		
		// initialize longestName
		String longestName = "";
		
		// traverse names array
		for(String word : names){
			
			// if current word's length is greater than longestName's length, then replace the longestName
			if(longestName.length() < word.length()){
				longestName = word;
			}
		}
		return longestName;
    }
	
	public static void main(String[] args){
		String[] names = { "Geek", "Geeks", "Geeksfor", "GeeksforGeek", "GeeksforGeeks" };
	
		System.out.println(longest(names, names.length));
	} 
}