/*
Ceiling in a sorted array
Given a sorted array and a value x, 
the ceiling of x is the smallest element in an array greater than or equal to x.
For example, let the input array be {1, 2, 8, 10, 10, 12, 19}
For x = 0:    floor doesn't exist in array,  ceil  = 1
For x = 1:    floor  = 1,  ceil  = 1
For x = 5:    floor  = 2,  ceil  = 8
For x = 20:   floor  = 19,  ceil doesn't exist in array
*/
public class UpperBound {
    static int findUpperBound(int[] arr, int k) {
        int start = 0, end = arr.length - 1, mid, ans = -1;

        while (start <= end) {
            mid = start + ((end - start) / 2);
            if (arr[mid] == k) {
                return arr[mid];
            } else if (k < arr[mid]) {
                ans = arr[mid];
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66, 77};
        int k = 74;

        System.out.println(findUpperBound(arr, k)); //77
    }
}