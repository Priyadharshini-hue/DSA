import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Union {
  // sorted - 2 pointers  O(m+n)
  static ArrayList<Integer> findUnionSorted(int arr1[], int arr2[], int n, int m) {
    ArrayList<Integer> union = new ArrayList<>();
    int i = 0, j = 0;

    while (i < n && j < m) {
      if (arr1[i] <= arr2[j]) {
        if (union.size() == 0 || union.get(union.size() - 1) != arr1[i]) {
          union.add(arr1[i]);
        }
        i++;
      } else {
        if (union.size() == 0 || union.get(union.size() - 1) != arr2[j]) {
          union.add(arr2[j]);
        }
        j++;
      }
    }
    while (i < n) // IF any element left in arr1
    {
      if (union.get(union.size() - 1) != arr1[i])
        union.add(arr1[i]);
      i++;
    }
    while (j < m) // If any elements left in arr2
    {
      if (union.get(union.size() - 1) != arr2[j])
        union.add(arr2[j]);
      j++;
    }
    return union;
  }

  // sorted and unsorted
  static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
    TreeSet<Integer> s = new TreeSet<>();
    ArrayList<Integer> Union = new ArrayList<>();
    for (int i = 0; i < n; i++)
      s.add(arr1[i]);
    for (int i = 0; i < m; i++)
      s.add(arr2[i]);
    for (int it : s)
      Union.add(it);
    return Union;
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int n1 = s.nextInt();
    int[] arr1 = new int[n1];
    for (int i = 0; i < n1; i++) {
      arr1[i] = s.nextInt();
    }

    int n2 = s.nextInt();
    int[] arr2 = new int[n2];
    for (int i = 0; i < n2; i++) {
      arr2[i] = s.nextInt();
    }
    System.out.println(findUnionSorted(arr1, arr2, n1, n2));
  }
}