/*
Index of first 1 in a sorted array of 0s and 1s
Given a sorted array consisting 0s and 1s. 
The task is to find the index of first 1 in the given array.
Input : arr[] = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1}
Output : 6
Explanation:The index of first 1 in the array is 6.

Input : arr[] = {0, 0, 0, 0}
Output : -1
Explanation:1's are not present in the array.
*/
public class IndexOfFirstOneSorted0And1 {
    static int SearchFirstOne(int[] arr) {
        int start = 0, end = arr.length - 1, index = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // If 1 is present at mid, store the mid and ignore the right half
            if (arr[mid] == 1) {
                index = mid;
                end = end - 1;
            }
            // If 0 is present at mid, ignore the left half
            else {
                start = mid + 1;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 0, 1, 1, 1, 1, 1 };

        System.out.println(SearchFirstOne(arr));
    }
}