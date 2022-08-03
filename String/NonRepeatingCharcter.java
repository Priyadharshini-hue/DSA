import java.util.*;

class NonRepeatingCharcter{
	
	static char firstNonRepeatingCharacter(String str){
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>(256);
		
		for(int i = 0; i < str.length(); i++){
			if(map.containsKey(str.charAt(i))){
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}else{
				map.put(str.charAt(i), 1);
			}
		}
		
		for(Map.Entry<Character, Integer> m : map.entrySet()){
			if(m.getValue() == 1){
				return m.getKey();
			}
		}
		
		return ' ';
	}

	static char LastNonRepeatingCharacter(String str){
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>(256);
		Character lastChar = null;
		
		for(int i = 0; i < str.length(); i++){
			if(map.containsKey(str.charAt(i))){
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}else{
				map.put(str.charAt(i), 1);
			}
		}
		
		for(Map.Entry<Character, Integer> m : map.entrySet()){
			if(m.getValue() == 1){
				lastChar =  m.getKey();
			}
		}
		
		return lastChar;
	}

	public static void main(String[] args){
		String str = "aasflkm";
		System.out.println(firstNonRepeatingCharacter(str));
		System.out.println(LastNonRepeatingCharacter(str));
	}
}