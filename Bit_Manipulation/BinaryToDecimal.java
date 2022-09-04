class BinaryToDecimal{

    static int conversion(int n){
        int base = 1, lastDigit = 0, temp = n, result = 0;

        while(temp > 0){
            // Last Digit of binary lastDigit
            lastDigit = temp % 10;

            // Removing the last digit
            temp = temp / 10;

            // Conversion
            result += lastDigit * base;
            
            // Increasing the base value
            base *= 2;
        }
        return result;
    }

	public static void main(String[] args){
        int binaryValue = 10101001;

        System.out.print(conversion(binaryValue));
	}
}