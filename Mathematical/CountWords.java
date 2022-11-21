import java.util.Scanner;

public class CountWords {
    static int findCountWords(String sentence) {
        int count =1;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(findCountWords(str));
    }
}