// Even or Odd

class EvenOrOdd {
    static String find(int n) {
        // Odd if the 1st(2^0) is 1
        return ((n & 1) == 1) ? "odd" : "even";
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println(find(n));
    }
}