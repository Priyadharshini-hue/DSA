public class LeastSignificantBit {
    static int lsb(int n) {
        int right = (int) (Math.log(n & -n) / Math.log(2)) +1;
        return right;
    }

    public static void main(String[] args) {
        int number = 11;

        System.out.println(lsb(number));
    }
}
