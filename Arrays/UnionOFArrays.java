/*
Union of two arrays -- count'
Input:
6 2 
85 25 1 32 54 6
85 2 
Output: 
7
 */
import java.util.HashSet;

class UnionOFArrays {
    // O(nlog n + m log m)
    static int unionCountFind(int[] array1, int[] array2) {
        // Initialize setArr to store unique elements
        HashSet<Integer> setArr = new HashSet<>();

        // Add the elements in set
        for (int i : array1) {
            setArr.add(i);
        }
        for (int e : array2) {
            setArr.add(e);
        }
        return setArr.size();
    }

    public static void main(String[] args) {
        int array1[] = { 1, 2, 3, 4, 5 };
        int array2[] = { 1, 2, 3 };

        System.out.println(unionCountFind(array1, array2));
    }
}