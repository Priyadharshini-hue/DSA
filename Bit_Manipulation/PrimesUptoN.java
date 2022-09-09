import java.util.ArrayList;
import java.util.List;

class PrimesUptoN {
    // O(n * log(log(n)))
    static List<Integer> findPrimes(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        boolean bool[] = new boolean[n + 1];

        for (int i = 2; i < n; i++) {
            bool[i] = true;
        }

        for (int i = 2; i*i < n; i++) {
            for (int j = i * i; j <= n; j+=i) {
                if(bool[i] == true) {
                    bool[j] = false;
                }
            }
        }
        for(int i = 2; i <= n; i++) {
            if(bool[i] == true) {
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