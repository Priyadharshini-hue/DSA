import java.util.Scanner;

public class FactorialOfNumber {
    // O(n) & O(1)
    public static int findFactorial(int number) {
        int factorial = 1;

        if (number == 0 || number == 1) {
            return 1;
        }
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.println(findFactorial(arr[i]));
        }
    }
}