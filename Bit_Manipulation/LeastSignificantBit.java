public class LeastSignificantBit {
    static int lsb(int n) {
        int index = (int) (Math.log(n & -n) / Math.log(2)) +1;
        // System.out.println(index);
        return  index;
    }

    public static void main(String[] args) {
        int number = 11;

        System.out.println(lsb(number));
    }
}
