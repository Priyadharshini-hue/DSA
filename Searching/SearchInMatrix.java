// row wise sorted matrix / row-column wise sorted matrix
public class SearchInMatrix {

    static int binarySearch(int[] arr, int k) {
        int start = 0, end = arr.length - 1, mid;
        while (start <= end) {
            mid = start + (end - start) / 2;

            if (arr[mid] == k) {
                return 1;
            } else if (k < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    // row wise sorted matrix (or) row-column wise sorted matrix
    /*
     * static int findIndex(int[][] matrix, int k) {
     * int row = -1;
     * 
     * for (int[] arr : matrix) {
     * if (binarySearch(arr, k) > 0) {
     * row = binarySearch(arr, k);
     * break;
     * }
     * }
     * if (row == -1) {
     * return -1;
     * }
     * return 1;
     * }
     */
    // row-column wise sorted matrix
    static int findIndex(int[][] matrix, int k) {
        int rowSize = matrix.length - 1;
        int mid, row = -1;
        int start = 0, end = rowSize;
        int columnSize = matrix[0].length - 1;

        while (start <= end) {
            mid = start + (end - start) / 2;
            if (matrix[mid][0] <= k && k <= matrix[mid][columnSize]) {
                // row
                row = mid;
                break;
            } else if (k < matrix[mid][0]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        if (row == -1) {
            return -1;
        } else {
            return binarySearch(matrix[row], k);
        }
    }

    public static void main(String[] args) {
        // int[][] matrix = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48
        // }, { 32, 33, 39, 50 } };
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int k = 3;

        System.out.println(findIndex(matrix, k));
    }
}
