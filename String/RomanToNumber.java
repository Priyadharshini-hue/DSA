/*
Roman to Number
*/
import java.util.*;

class RomanToNumber{
	
	static int conversion(String s){
		Map<Character,Integer> romanMap = new HashMap<>();
		
		romanMap.put('I', 1 );
		romanMap.put('V', 5 );
		romanMap.put('X', 10 );
		romanMap.put('L', 50 );
		romanMap.put('C', 100 );
		romanMap.put('D', 500 );
		romanMap.put('M', 1000 );
		
		int number = 0;
		
		for(int i = 0; i < s.length(); i++){
			if(i > 0 && romanMap.get(s.charAt(i)) > romanMap.get(s.charAt(i-1))){
				number = number + romanMap.get(s.charAt(i)) - (2*romanMap.get(s.charAt(i-1)));
			}else{
				number += romanMap.get(s.charAt(i));
			}
			//System.out.println(number);
		}
		return number;
	}
	
	public static void main(String[] args){
		String s = "CXLV";
		System.out.println(conversion(s));
	}
}