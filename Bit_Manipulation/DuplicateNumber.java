/*
Find the duplicate number

You are given a list of integers nums of size n+1. 
Each number in nums lies from 1 to n.
All numbers appear once, except x which appears twice.

Find the number x.
*/
class DuplicateNumber {
    static int findNumber(int[] nums) {
        
        // Initialize xor
        int xor = nums[0];

        // Do xor for the elements in nums
        for (int i = 1; i < nums.length; i++) {
            xor = xor ^ nums[i];
        }

        // xor from 1 to n-1
        for (int n = 1; n < nums.length; n++) {
            xor = xor ^ n;
        }
        return xor;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 4 };
        System.out.println(findNumber(nums));
    }
}
