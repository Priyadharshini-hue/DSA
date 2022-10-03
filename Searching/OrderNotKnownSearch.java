/*
Order not known search
Given a sorted array of numbers, find if a given number ‘key’ is present in the array. 
Though we know that the array is sorted, we don’t know if it’s sorted in ascending or descending order. .   
*/
class OrderNotKnownSearch {
    static int search(int[] arr, int elementToFind) {
        int start = 0, end = arr.length - 1;
        if (arr[0] < arr[arr.length - 1]) {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] == elementToFind) {
                    return mid;
                } else if (arr[mid] > elementToFind) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        } else {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] == elementToFind) {
                    return mid;
                } else if (arr[mid] < elementToFind) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 3, 2, 1, 0 };

        int elementToFind = 1;

        System.out.print(search(arr, elementToFind));
    }
}