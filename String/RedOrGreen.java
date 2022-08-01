/*
Red OR Green
Given a string of length N, made up of only uppercase characters 'R' and 'G', where 'R' stands for Red and 'G' stands for Green.
Find out the minimum number of characters you need to change to make the whole string of the same colour.

Example 1:

Input:
N=5
S="RGRGR"
Output:
2
Explanation:
We need to change only the 2nd and 
4th(1-index based) characters to 'R', 
so that the whole string becomes 
the same colour.
Example 2:

Input:
N=7
S="GGGGGGR"
Output:
1
Explanation:
We need to change only the last 
character to 'G' to make the string 
same-coloured.
 
Your Task:
You don't need to read input or print anything. 
Your task is to complete the function RedOrGreen() which takes the Integer N and the string S as input parameters and
returns the minimum number of characters that have to be swapped to make the string same-coloured.
*/class RedOrGreen{
	
	static int find(String str, int length){
		int R = 0, G = 0;
		
		for(int i = 0; i < length; i++){
			if(str.charAt(i) == 'R'){
				R++;
			}else{
				G++;
			}
		}
		return Math.min(R, G);
	}

	public static void main(String[] args){
		String S = "RGRGR";
		
		System.out.println(find(S, S.length()));
	}
}