import java.util.HashMap;
import java.util.Scanner;

public class AnagramsOccurrenceCount {
    static boolean isAnagram(HashMap<Character, Integer> wordCharCount, HashMap<Character, Integer> subStrCharCount) {
        for (Character character : wordCharCount.keySet()) {
            if (wordCharCount.get(character) != subStrCharCount.get(character)) {
                return false;
            }
        }
        return true;
    }

    static void anagramsOccurrenceCount(String text, String word) {
        HashMap<Character, Integer> wordCharCount = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            wordCharCount.put(letter, wordCharCount.getOrDefault(letter, 0) + 1);
        }

        int windowStart = 0, count = 0;
        HashMap<Character, Integer> subStrCharCount = new HashMap<>();
        for (int windowEnd = 0; windowEnd < text.length(); windowEnd++) {
            char letter = text.charAt(windowEnd);
            subStrCharCount.put(letter, subStrCharCount.getOrDefault(letter, 0) + 1);
            if (((windowEnd + 1) - windowStart) == word.length()) {
                if (isAnagram(wordCharCount, subStrCharCount)) {
                    count++;
                }
                subStrCharCount.put(text.charAt(windowStart), subStrCharCount.get(text.charAt(windowStart)) - 1);
                windowStart++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String text = s.nextLine();
        String word = s.nextLine();
        anagramsOccurrenceCount(text, word);

        // aabaabaa
        // aaba
        // 4
    }
}