import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FirstNegativeNumber {
    static void firstNegativeNumberKSize(int[] arr, int k) {
        int windowStart = 0;
        Queue<Integer> queue = new LinkedList<>(); // queue - FIFO

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            if (arr[windowEnd] < 0) {
                queue.add(arr[windowEnd]);
            }

            if (((windowEnd + 1) - windowStart) == k) {
                if (queue.isEmpty()) {
                    System.out.print(0 + " ");
                } else {
                    System.out.print(queue.peek() + " ");
                    if (queue.peek() == arr[windowStart]) {
                        queue.remove();
                    }
                }
                windowStart++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int k = s.nextInt();
        firstNegativeNumberKSize(arr, k);
        // Input: a[] = {-5, 1, 2, -6, 9}, k = 2
        // Output : -5 0 -6 -6
    }
}