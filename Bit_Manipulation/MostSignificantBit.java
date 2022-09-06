// most significant bit
class MostSignificantBit{
    static int msb(int n){
        // log2(n) = log(n) / log 2
        int index = (int)(Math.log(n) / Math.log(2)); 
        // Left shift by index
        return 1 << index; 
    }
    public static void main(String[] args) {
        int number = 10;

        System.out.println(msb(number));
    }
}