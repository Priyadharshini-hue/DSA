import java.util.ArrayList;
import java.util.List;

// Sieve of Eratosthenes algorithm

class PrimesUptoN {
    // O(n * log(log(n)))
    static List<Integer> findPrimes(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        // Initialize array of size n+1, by default initialized to false
        boolean bool[] = new boolean[n + 1];

        // Initialize the array from index 2 to n+1 as true
        for (int i = 2; i < n; i++) {
            bool[i] = true;
        }

        // Traverse till n if i^2 less than n and mark the multiples of i as non-prime
        for (int i = 2; i * i < n; i++) {
            if (bool[i] == true) {
                for (int j = i * i; j <= n; j += i) {
                    bool[j] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (bool[i] == true) {
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int n = 20;

        System.out.println(findPrimes(n));
    }
}
// O(n *sqrt(n))
/*
 * class PrimesUptoN {
 * static boolean isPrime(int k) {
 * for (int i = 2; i*i <= k; i++) {
 * if (k % i == 0) {
 * return false;
 * }
 * }
 * return true;
 * }
 * static List<Integer> findPrimes(int n){
 * ArrayList<Integer> list = new ArrayList<>();
 * 
 * for (int i = 2; i < n; i++) {
 * if(isPrime(i) == true){
 * list.add(i);
 * }
 * }
 * 
 * return list;
 * }
 * 
 * public static void main(String[] args) {
 * int n = 20;
 * 
 * System.out.println(findPrimes(n));
 * }
 * }
 */