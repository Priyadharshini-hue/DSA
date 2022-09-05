// most significant bit
class MostSignificantBit{
    static int msb(int n){
        int index = (int)(Math.log(n) / Math.log(2));
        //System.out.println(index);
        return 1 << index;
    }
    public static void main(String[] args) {
        int number = 10;

        System.out.println(msb(number));
    }
}