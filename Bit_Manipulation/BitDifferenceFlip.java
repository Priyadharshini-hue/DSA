/*
You are given two numbers A and B. 
The task is to count the number of bits needed to be flipped to convert A to B.

Example 1:

Input: A = 10, B = 20
Output: 4
Explanation:
A  = 01010
B  = 10100
As we can see, the bits of A that need 
to be flipped are 01010. If we flip 
these bits, we get 10100, which is B.
 */
class BitDifferenceFlip {
    static int flipCount(int a, int b) {
        // Initialize count
        int count = 0;

        // While loop till any one of a or b reaches 0
        while (a > 0 || b > 0) {

            // increment count by 1
            count = count + ((a & 1) ^ (b & 1));
            
            // Shifting right by 1
            a = a >> 1;
            b = b >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int a = 10, b = 20;

        System.out.println(flipCount(a, b));
    }
}
