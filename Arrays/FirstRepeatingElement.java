
/*
Find the first repeating element. 
The element should occurs more than once and the index of its first occurrence should be the smallest.

Example 1:
Input:
n = 7
arr[] = {1, 5, 3, 4, 3, 5, 6}
Output: 2
Explanation: 
5 is appearing twice and its first appearence is at index 2 
which is less than 3 whose first occuring index is 3.

Example 2:
Input:
n = 4
arr[] = {1, 2, 3, 4}
Output: -1
Explanation: 
All elements appear only once so answer is -1. 
*/
import java.util.HashMap;

public class FirstRepeatingElement {
    static int findElement(int[] arr) {
        // Map to store the frequency of elements
        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse the array and store the frequency of elements in map
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // Traverse the array to find the first index of repeating element
        for (int element : arr) {
            if (map.get(element) > 1) {
                return element;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 3, 4, 3, 5, 6 };

        System.out.println(findElement(arr));
    }
}