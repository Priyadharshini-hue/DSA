class DecimalToBinary {
    static StringBuilder toBinary(int n) {
        StringBuilder str = new StringBuilder();
        int l = 0;

        while (n > 0) {
            l = n % 2;
            n = n / 2;
            str.append(l);
        }
        return str.reverse();
    }

    public static void main(String[] args) {
        int number = 7;

        System.out.println(toBinary(number));
    }
}
