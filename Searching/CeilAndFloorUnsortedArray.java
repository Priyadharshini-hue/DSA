/*
Given an unsorted array Arr[] of N integers and an integer X, 
find floor and ceiling of X in Arr[0..N-1].
Floor of X is the largest element which is smaller than or equal to X. 
Floor of X doesn’t exist if X is smaller than smallest element of Arr[].
Ceil of X is the smallest element which is greater than or equal to X. 
Ceil of X doesn’t exist if X is greater than greatest element of Arr[].

Input:
N = 8, X = 7
Arr[] = {5, 6, 8, 9, 6, 5, 5, 6}
Output: 6 8
Explanation: Floor of 7 is 6 and ceil of 7 is 8.
*/
import java.util.ArrayList;
import java.util.Arrays;

class CeilAndFloorUnsortedArray {

    static ArrayList<Integer> getFloorAndCeil(int[] arr, int target) {

        int ceil = Integer.MAX_VALUE, floor = -1;

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            // If element is greater than floor and lesser than or equal to target.
            if (floor < arr[i] && arr[i] <= target) {
                floor = arr[i];
            }
            // If the element is greater than or equal to target and the element is less
            // than ceil.
            else if (target <= arr[i] && arr[i] < ceil) {
                ceil = arr[i];
            }
        }
        if (ceil == Integer.MAX_VALUE) {
            ceil = -1;
        }

        return new ArrayList<>(Arrays.asList(floor, ceil));
    }

    public static void main(String[] args) {
        int arr[] = { 5, 6, 8, 9, 6, 5, 5, 6 };
        int target = 10;

        System.out.println(getFloorAndCeil(arr, target));
    }
}