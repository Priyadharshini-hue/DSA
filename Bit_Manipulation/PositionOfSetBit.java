/*
Find position of set bit
Given a number N having only one ‘1’ and all other ’0’s in its binary representation, 
find position of the only set bit. If there are 0 or more than 1 set bit the answer should be -1. 
Position of  set bit '1' should be counted starting with 1 from LSB side in binary representation
of the number.
 */
public class PositionOfSetBit {

    static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    static int findBitPosition(int n) {
        if (!isPowerOfTwo(n)) {
            return -1;
        }
        int count = 0;
        while (n > 0) {
            count++;
            n = n >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 16;
        System.out.print(findBitPosition(n));
    }
}
