import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Intersection {
  // sorted - 2 pointers O(n)
  static ArrayList<Integer> findUnionSorted(int arr1[], int arr2[], int n, int m) {
    ArrayList<Integer> intersect = new ArrayList<>();
    int i = 0, j = 0;

    while (i < n && j < m) {
      if (arr1[i] < arr2[j]) {
        i++;
      } else if (arr1[i] > arr2[j]) {
        j++;
      } else {
        if (intersect.size() == 0 || intersect.get(intersect.size() - 1) != arr2[j]) {
          intersect.add(arr2[j]);
          i++;
          j++;
        }
      }
    }
    return intersect;
  }

  // sorted and unsorted
  static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
    TreeSet<Integer> s = new TreeSet<>();
    ArrayList<Integer> intersect = new ArrayList<>();
    for (int i = 0; i < n; i++)
      s.add(arr1[i]);

    for (int i = 0; i < m; i++)
      if (s.contains(arr2[i])) {
        s.add(arr2[i]);
      }

    for (int it : s)
      intersect.add(it);
    return intersect;
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