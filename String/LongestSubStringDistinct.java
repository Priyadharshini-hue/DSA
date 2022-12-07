import java.util.HashMap;
import java.util.Scanner;

public class LongestSubStringDistinct {
    static void longestSubStringDistinct(String text, int k) {
        HashMap<Character, Integer> subStrCharCount = new HashMap<>();
        int windowStart = 0, length = Integer.MIN_VALUE;

        for (int windowEnd = 0; windowEnd < text.length(); windowEnd++) {
            subStrCharCount.put(text.charAt(windowEnd),
                    subStrCharCount.getOrDefault(text.charAt(windowEnd), 0) + 1);
            if (subStrCharCount.size() > k) {
                if (subStrCharCount.get(text.charAt(windowStart)) >= 2) {
                    subStrCharCount.put(text.charAt(windowStart),
                            subStrCharCount.get(text.charAt(windowStart)) - 1);
                } else {
                    subStrCharCount.remove(text.charAt(windowStart), 1);
                }
                windowStart++;
            }
            if (subStrCharCount.size() == k) {
                length = Math.max(windowEnd - windowStart + 1, length);
            }
        }
        System.out.println(length);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String text = s.nextLine();
        int k = s.nextInt();
        longestSubStringDistinct(text, k);
    }
}
