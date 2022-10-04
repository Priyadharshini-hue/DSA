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
class LowerBound {
    static int search(int[] arr, int target) {

        int lowerboundIndex = -1, start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if the target is present at mid or greater than left half, then ignore
            // the left half
            if (arr[mid] <= target) {
                lowerboundIndex = mid;
                start = mid + 1;
            }
            // If the target is lesser than the mid element, then ignore right half
            else {
                end = mid - 1;
            }
        }
        return lowerboundIndex;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 8, 10, 11, 12, 19 };
        int target = 5;

        System.out.print(search(arr, target));
    }
}