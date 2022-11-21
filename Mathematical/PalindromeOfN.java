import java.util.Scanner;

public class PalindromeOfN {
    // O(n) & O(1)
    public static String isPalindrome(int number) {
        int tempNumber = number, reversedNumber = 0;

        while (number != 0) {
            int rem = number % 10;
            reversedNumber = reversedNumber * 10 + rem;
            number /= 10;
        }
        return tempNumber == reversedNumber ? "Yes" : "No";
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.println(isPalindrome(arr[i]));
        }
    }
}