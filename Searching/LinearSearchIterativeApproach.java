/*
Linear Search - O(n), O(1)
 */
class LinearSearchIterativeApproach {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 2, 6, 4, 33 };

        int elementToFind = 2;

        System.out.println(search(arr, elementToFind));
    }

    public static int search(int[] arr, int elementToFind) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elementToFind) {
                return i;
            }
        }
        return -1;
    }
}
