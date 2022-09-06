/*
Find the Missing Number

You are given a list of integers nums of size n-1. 
Each number in nums is unique and lies from 1 to n.

Find the number that is missing from the list.
 */
class MissingNumber {

    static int findNumber(int[] nums) {
        // Initialize sum
        int sum = 0;

        // Traverse the nums
        for (int n : nums) {
            sum += n;
        }

        // Return the value subracted from sum by n(n+1)/2
        return sum - ((nums.length * (nums.length + 1)) / (2));
    }

    public static void main(String[] args) {
        int nums[] = { 3, 1, 4 };

        System.out.println(findNumber(nums));
    }
}
