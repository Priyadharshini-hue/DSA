class DecimalToBinary {
    /*
     * static StringBuilder toBinary(int n) {
     * StringBuilder str = new StringBuilder();
     * int l = 0;
     * 
     * while (n > 0) {
     * l = n % 2;
     * n = n / 2;
     * str.append(l);
     * }
     * return str.reverse();
     * }
     */
    // Integer.toString(num,2) --> to binary
    static String str = "";

    static String toBinary(int n) {

        // for (int i = 1 << 31; i > 0; i = i /2) { // o/p for 30 digits - str = "0"
        // 0000000000000000000000000000111
        // if ((n & i) != 0) {
        // str += 1;
        // } else {
        // str += 0;
        // }
        // }
    // Recursive using bit
        if (n > 1) {
            toBinary(n >> 1); // n/2
        }
        str += n & 1; // n % 2

        return str;
    }

    public static void main(String[] args) {
        int number = 6;

        System.out.println(toBinary(number));
    }
}