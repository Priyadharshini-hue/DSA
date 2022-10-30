/*
You are given N number of books. Every ith book has Ai number of pages. 
You have to allocate contiguous books to M number of students. 
There can be many ways or permutations to do so. In each permutation, one of the M students will be allocated the maximum number of pages. 
Out of all these permutations, the task is to find that particular permutation in which the maximum number of pages allocated to a student is the minimum of those in all the other permutations and print this minimum value.
Each book will be allocated to exactly one student. Each student has to be allocated at least one book.
Note: Return -1 if a valid assignment is not possible, 
and allotment should be in contiguous order (see the explanation for better understanding). 
*/
import java.util.Arrays;

public class AllocateMinimumNumberOfPages {
    static boolean findMinimumPages(int[] books, int persons, int mid) {
        int personsCount = 1, temp = 0;
        for (int i = 0; i < books.length; i++) {
            temp = temp + books[i];
            if (temp > mid) {
                personsCount++;
                temp = books[i];
            }
            if (personsCount > persons) {
                return false;
            }
        }
        return true;
    }

    static int findPages(int[] books, int persons) {
        // base case
        if (books.length < persons) {
            return -1;
        }

        int pages = 0, start = Arrays.stream(books).max().getAsInt(),
                end = Arrays.stream(books).sum();

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (findMinimumPages(books, persons, mid)) {
                pages = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return pages;
    }

    public static void main(String[] args) {
        int[] books = { 15, 17, 20 };
        int persons = 2;

        System.out.println(findPages(books, persons));
    }
}