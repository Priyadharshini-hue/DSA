import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class ThreeSum {

    // O(n2) &O(n) - Indicies
    static int[] findIndicies(int[] arr, int sum) {
        HashMap<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < arr.length - 1; i++) {
            int reducedSum = sum - arr[i];
            indexMap = new HashMap<>();
            for (int j = i + 1; j < arr.length; j++) {
                if (indexMap.containsKey(reducedSum - arr[j])) {
                    return new int[] { i + 1, indexMap.get(reducedSum - arr[j]), j + 1 };
                } else {
                    indexMap.put(arr[j], j + 1);
                }
            }
        }
        return new int[] { -1 };
    }

    // O(n2) & O(n)
    static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int sum) {
        ArrayList<ArrayList<Integer>> l = new ArrayList<ArrayList<Integer>>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            int low = i + 1, high = arr.length - 1,
                    a = sum - arr[i];
            while (low < high) {
                int tempSum = arr[low] + arr[high];
                if (tempSum < a) {
                    low++;
                } else if (tempSum > a) {
                    high--;
                } else {
                    ArrayList<Integer> l1 = new ArrayList<>();
                    l1.add(arr[i]);
                    l1.add(arr[low]);
                    l1.add(arr[high]);
                    l.add(l1);
                    while (low < high && arr[low] == arr[low + 1])
                        low++;
                    while (low < high && arr[high] == arr[high - 1])
                        high--;
                    low++;
                    high--;
                }
            }
            while (i + 1 < arr.length && arr[i] == arr[i + 1])
                i++;
        }
        return l;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println(findIndicies(arr, 10));
    }
}