/*
Reverse order of vowels
*/
import java.util.*;

class ReverseVowels{
	
	static String modify(String s){
		LinkedList<Character> vowels = new LinkedList<>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		vowels.add('A');
		vowels.add('E');
		vowels.add('I');
		vowels.add('O');
		vowels.add('U');

		int start = 0, end = s.length()-1;
		char[] str = s.toCharArray();
		
		while(start <= end){
			if(vowels.contains(str[start]) && vowels.contains(str[end])){
				char t = str[start];
				str[start] = str[end];
				str[end] = t;
				start++;
				end--;
			}else if(!vowels.contains(str[start])){
				start++;
			}else{
				end--;
			}
			
		}
		return String.copyValueOf(str);
	}

	public static void main(String[] args){
		
		String S = "Priyadharshini";
		
		System.out.println(modify(S));
	}
}