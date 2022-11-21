import java.util.Scanner;

public class CheckCharacter {
    // O(1) & O(1)
    public static String isCharacter(String number) {
        if (Character.isDigit(number.charAt(0))) {
            return "error";
        }
        // 97-122 (a-z) & 65-90(A_Z)
        else if (97 <= number.charAt(0) && number.charAt(0) <= 122) {
            return "lower";
        } else {
            return "upper";
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String n = s.nextLine();

        System.out.println(isCharacter(n));
    }
}