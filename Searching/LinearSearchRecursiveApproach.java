/*
Linear Search - O(n), O(n)
 */
class LinearSearchRecursiveApproach {
    public static int search(int[] arr, int size, int elementToFind) {
        if (size == 0) {
            return -1;
        }
        if (arr[size - 1] == elementToFind) {
            return size - 1;
        }
        return search(arr, size - 1, elementToFind);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 2, 6, 4, 33 };

        int elementToFind = 2;

        System.out.println(search(arr, arr.length, elementToFind));
    }
}
