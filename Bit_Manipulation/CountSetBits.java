//Given a positive integer n, 
//count the number of set bits in the binary representation of n.

class CountSetBits {
    static int setBits(int n) {
        // Initialize count
        int count = 0;
        
        // Loop till n reaches zero
        while (n > 0) {
            // Count is incremented by if n&1 is 1
            count = count + (n & 1);

            // shift right by 1
            n = n >> 1;   
        }

        return count;
    }

    public static void main(String[] args) {
        int n = 1;

        System.out.println(setBits(n));
    }
}
