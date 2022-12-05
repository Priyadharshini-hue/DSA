import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

// Indicies
public class TwoSum {

    // O(n) &O(n) -- not sorted
    static int[] findTwoSum(int[] arr, int sum) {
        HashMap<Integer, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (indexMap.containsKey(sum - arr[i])) {
                return new int[] { indexMap.get(sum - arr[i]), i + 1 };
            } else {
                indexMap.put(arr[i], i + 1);
            }
        }
        return new int[] { -1 };
    }

    // Sorted -O(n)
    static int[] findTwoSum1(int[] arr, int sum) {
        int rightPtr = arr.length - 1, leftPtr = 0;

        while (leftPtr < rightPtr) {
            int target = arr[leftPtr] + arr[rightPtr];
            if (target < sum) {
                leftPtr++;
            } else if (target > sum) {
                rightPtr--;
            } else {
                return new int[] { leftPtr + 1, rightPtr + 1 };
            }
        }

        return new int[] { -1 };
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println(Arrays.toString(findTwoSum1(arr, 5)));
    }
}