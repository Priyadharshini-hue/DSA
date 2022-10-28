/*
Given a sorted array arr[] of size N without duplicates, and given a value x. 
Floor of x is defined as the largest element K in arr[] such that K is smaller than or equal to x. 
Find the index of K(0-based indexing).
return -1 if there isn't any such number.
Input:
N = 7, x = 5 
arr[] = {1,2,8,10,11,12,19}
Output: 1
Explanation: Largest Number less than 5 is 2 (i.e K = 2), whose index is 1(0-based indexing). 
*/
public class LowerBound {
    static int findLowerBound(int[] arr, int k) {
        int start = 0, end = arr.length - 1, mid, ans = -1;

        while (start <= end) {
            mid = start + ((end - start) / 2);

            if (arr[mid] == k) {
                return arr[mid];
            } else if (k < arr[mid]) {
                end = mid - 1;
            } else {
                ans = arr[mid];
                start = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66, 77};
        int k = 45;

        System.out.println(findLowerBound(arr, k)); //44
    }
}