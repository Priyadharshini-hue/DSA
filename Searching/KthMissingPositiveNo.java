public class KthMissingPositiveNo {
    static int kthMissingPositiveNumber(int numbers[], int k) {
        int start = 0, end = numbers.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (numbers[mid] - mid - 1 < k) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start + k;
    }

    public static void main(String[] args) {
        int[] numbers = { 2, 4, 6, 9};
        int k = 6;

        System.out.println(kthMissingPositiveNumber(numbers, k));
    }
}