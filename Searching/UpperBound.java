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
class UpperBound {
    static int search(int[] arr, int target) {
        int ans = -1, start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if the target is present at the mid or less than the target, ignore
            // right half and store the mid value in ans
            if (arr[mid] >= target) {
                ans = mid;
                end = mid - 1;
            }
            // If the target is greater than left half, then ignore the left half
            else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 8, 10, 11, 12, 19 };
        int target = 23;

        System.out.print(search(arr, target));
    }
}