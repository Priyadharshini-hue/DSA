import java.util.Scanner;

public class ReverseNumber {
    public static int reverse(int number) {
        int reverse = 0;

        // log n
        while (number != 0) {
            int rem = number % 10;
            // avoids overflow INT_MAX is equal 2147483647. INT_MIN is equal -2147483648.
            if (reverse > Integer.MAX_VALUE / 10 || reverse == Integer.MAX_VALUE / 10 && rem > 7
                    || reverse < Integer.MIN_VALUE / 10 || reverse < Integer.MIN_VALUE / 10 && rem < -8) {
                return 0;
            }
            reverse = (reverse * 10) + rem;
            number = number / 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(reverse(arr[i]));
        }
    }
}