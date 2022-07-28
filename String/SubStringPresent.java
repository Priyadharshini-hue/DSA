/*
Implement strstr

Your task is to implement the function strstr. The function takes two strings as arguments (s,x) and  
locates the occurrence of the string x in the string s. The function returns and 
integer denoting the first occurrence of the string x in s (0 based indexing).

Note: You are not allowed to use inbuilt function.

Example 1:

Input:
s = GeeksForGeeks, x = Fr
Output: -1
Explanation: Fr is not present in the
string GeeksForGeeks as substring.
 

Example 2:

Input:
s = GeeksForGeeks, x = For
Output: 5
Explanation: For is present as substring
in GeeksForGeeks from index 5 (0 based
indexing).
*/
//O(n)
class SubStringPresent{
	static int find(String str, String f){
		int j = 0;
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) == f.charAt(j)){
				j++;
			}else{
				if(j>0){
					i = i - j;
				}
				j=0;
			}
			if(j == f.length()){
				return (i-j+1);
			}
		}
		return -1;
	}
	
	public static void main(String[] args){
		String s = "ababaaaaaa";
		String f = "abaa";
		System.out.println(find(s, f));
	}
}