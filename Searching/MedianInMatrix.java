import java.util.Arrays;

// row wise sorted matrix / row-column wise sorted matrix
// (log(max - min) * r * log(c)) c-upperbound

public class MedianInMatrix {
    private static int binarySearch(int[][] matrix, int start, int end, int rowSize, int columnSize,
            int requiredIndex) {

        while (start < end) {
            int mid = start + (end - start) / 2;
            int count = 0;
            int temp = 0;
            for (int i = 0; i < rowSize; i++) {
                temp = Arrays.binarySearch(matrix[i], mid);
                if (temp < 0) {
                    temp = Math.abs(temp) - 1;
                } else {
                    while (temp < matrix[i].length && matrix[i][temp] <= mid) {
                        temp += 1;
                    }
                }
                count += temp;
            }
            if (count < requiredIndex) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    static int findMedian(int[][] matrix) {
        int rowSize = matrix.length, columnSize = matrix[0].length;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int i = 0; i < rowSize; i++) {
            if (min > matrix[i][0]) {
                min = matrix[i][0];
            }
            if (max < matrix[i][columnSize - 1]) {
                max = matrix[i][columnSize - 1];
            }
        }
        int requiredIndex = (rowSize * columnSize + 1) / 2;

        return binarySearch(matrix, min, max, rowSize, columnSize, requiredIndex);
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1,3,5 }, { 2,6,9}, { 3,6,9 } };

        System.out.println(findMedian(matrix));
    }
}