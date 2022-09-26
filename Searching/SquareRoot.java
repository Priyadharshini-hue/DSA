class SquareRoot {
    public static int root(int number) {
        // Base case
        // If the number is 0 or 1 then the sqaure root is same as number
        if (number == 0 || number == 1) {
            return number;
        }

        // Initialize start, end and res
        long start = 1, end = number / 2, res = 1;

        while (start <= end) {
            // Initialize mid
            long mid = start + (end - start) / 2;

            // If the mid* mid equals number, return mid
            if (mid * mid == number) {
                return (int) mid;
            }
            // If the mid*mid less than number, then res is mid & start is mid's next
            // element
            else if (mid * mid < number) {
                start = mid + 1;
                res = mid;
            }
            // If greater then end is mid's previous element
            else {
                end = mid - 1;
            }
        }
        return (int) res;
    }

    public static void main(String[] args) {
        int number = 180;
        System.out.println(root(number));
    }
}