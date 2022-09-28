/*
Find the duplicate numbers in an array.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class DuplicateNumbers {
    // O(n) & O(n)
    private static ArrayList<Integer> findNumbers(int[] a) {

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        // Traverse the array
        for (int i = 0; i < a.length; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }

        // Traverse the map to check if the frequency of elements is greater than 1
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                list.add(entry.getKey());
            }
        }

        // If the list is zero, return -1
        if (list.size() < 0) {
            list.add(-1);
            return list;
        }

        // Sort the repeated elements
        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) {
        int a[] = { 0, 3, 1, 2, 3, 2 };

        System.out.println(findNumbers(a));
    }
}
