class GreatestCommonDivisor {
    // Euclidean algorithm (subraction or division)
    static int gcdEuclid(int a, int b) {
        // Base case
        if (b == 0) {
            return a;
        }
        // General case
        else {
            return gcdEuclid(b, Math.abs(b - a)); // or b, b%a
        }
    }

    public static void main(String[] args) {
        int a = 4, b = 12;

        System.out.println(gcdEuclid(a, b));
    }
}
