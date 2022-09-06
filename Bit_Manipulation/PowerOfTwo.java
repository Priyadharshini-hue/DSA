/*
Given a number n, check whether it is a power of two or not.

An integer n is a power of two, if there exists an integer x such that n = 2x.

Example:
2, 4, 8, 16 are powers of 2, while 3, 5, 6, 7 are not.
*/

class PowerOfTwo {
    static boolean power(int n) {
        /*
         * //log n
         * int count = 0;
         * while (n > 0) {
         * count = count + (n & 1);
         * n = n >> 1;
         * }
         * System.out.println(n&(n-1));
         * return count == 1 ? true : false;
         */

        // O(n)
        if (n == 0)  // If n equal to 0 return false
            return false;
        
        // Else do and operation for n and n-1
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        int n = 2;
        System.out.println(power(n));
    }
}
