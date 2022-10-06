/*
Find the minimum difference element in a sorted array
Given an array of integers sorted in ascending order, and a target value, 
find the element in the array that has minimum difference with the target value.
*/
class MinimumDifferenceWithTarget {
    static int searchMinimumDifference(int[] arr, int target) {
        int start = 0, end = arr.length;

        // If target is less than the first index
        if (target < arr[0]) {
            return arr[0];
        }
        // If the target is greater tahn last element
        if (target > arr[end]) {
            return arr[end];
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // If the target is present at mid
            if (arr[mid] == target) {
                return arr[mid];
            }
            // If the target is greater than mid element, inore the right half
            else if (arr[mid] < target) {
                end = mid - 1;
            }
            // If the target is lesser than mid element, ignore the left half
            else {
                start = end + 1;
            }
        }
        // retuen the min difference
        return (arr[start] - target) > (target - arr[end]) ? arr[end] : arr[start];
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 10, 12, 15 };
        int target = 6;

        System.out.println(searchMinimumDifference(arr, target));
    }
}