/*
Linear Search - O(n), O(n)
 */
class LinearSearchRecursiveApproach {
    public static int search(int[] arr, int size, int elementToFind) {
        if (size == -1) {
            return -1;
        }
        if (arr[size] == elementToFind) {
            return size;
        }
        return search(arr, size - 1, elementToFind);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 2, 6, 4, 33 };

        int elementToFind = 2;

        System.out.println(search(arr, arr.length - 1, elementToFind));
    }
}
