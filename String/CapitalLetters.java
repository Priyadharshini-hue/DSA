// return true if all the letters are capital

class CapitalLetters{
	
	static boolean check(String s){
		
		int count = 0;
		
		for(int i = 0; i < s.length(); i++){
			if(Character.toUpperCase(s.charAt(i)) == s.charAt(i)){
				count++;
			}
		}
		return count == s.length() ? true : false;
	}

	public static void main(String[] args){
		String word = "PRkIYA";
		
		System.out.println(check(word));
	}
}