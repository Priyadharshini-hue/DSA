import java.util.Arrays;

class SearchRange {

    static int[] search(int[] arr, int target) {
        // return the first and last index of the target as array
        return new int[] { startIndexSearch(arr, target), lastIndexSearch(arr, target) };
    }

    static int startIndexSearch(int[] arr, int target) {
        // Intialize start, end, startIndex
        int start = 0, end = arr.length - 1, startIndex = -1;

        while (start <= end) {
            // Intialize mid
            int mid = start + (end - start) / 2;

            // If the target is greater than mid element, then start is mid's next element
            if (arr[mid] < target) {
                start = mid + 1;
            }
            // If the target is less than mid element, then start is mid's previous element
            else if (arr[mid] > target) {
                end = mid - 1;
            }
            // If the target equals mid element, then set startIndex to mid and
            // end as mid's previous element to find the first target element.
            else {
                startIndex = mid;
                end = mid - 1;
            }
        }
        return startIndex;
    }

    static int lastIndexSearch(int[] arr, int target) {
        // Intialize start, end, endIndex
        int start = 0, end = arr.length - 1, endIndex = -1;

        while (start <= end) {
            // Intialize mid
            int mid = start + (end - start) / 2;

            // If the target is greater than mid element, then start is mid's next element
            if (arr[mid] < target) {
                start = mid + 1;
            }
            // If the target is less than mid element, then start is mid's previous element
            else if (arr[mid] > target) {
                end = mid - 1;
            }
            // If the target equals mid element, then set startIndex to mid and
            // start as mid's next element to find the last target element.
            else {
                endIndex = mid;
                start = mid + 1;
            }
        }
        return endIndex;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 7, 7, 8, 8, 9, 9, 10 };
        int target = 8;
        System.out.println(Arrays.toString(search(arr, target)));
    }
}
