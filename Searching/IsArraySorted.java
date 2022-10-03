/*
Check if the array is sorted
*/
class IsArraySorted {

    static boolean isSorted(int[] arr) {

        // Traverse the array
        for (int i = 0; i < arr.length - 1; i++) {
            // Check if the order is changed
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 89, 12, 11 };

        System.out.print(isSorted(arr));
    }
}