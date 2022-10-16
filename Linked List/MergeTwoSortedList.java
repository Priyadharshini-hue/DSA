import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class LinkedList {
    Node head;

    void insertAtEnd(int data) {
        // Create Node and put the data
        Node node = new Node(data);
        // If the list is empty
        if (head == null) {
            head = node;
        } else {
            Node currentNode = head;
            // Traverse the list
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = node;
        }
    }

    void print(Node head) {
        Node currentNode = head;
        // If the list is empty
        if (currentNode == null) {
            return;
        } else {
            while (currentNode != null) {
                System.out.print(currentNode.data + " ");
                currentNode = currentNode.next;
            }
        }
        System.out.println();
    }

    Node mergeTwoSortedList(Node list1, Node list2) {
        Node temp ;
        if (list1.data > list2.data) {
             temp = list1;
            list1 = list2;
            list2 = temp;
        }
        Node head = list1;
        Node prev = list1;
        list1=list1.next;
        while (list1 != null && list2 != null) {
            if (list1.data > list2.data) {
                prev.next = list2;
                 temp = list1;
                list1 = list2;
                list2 = temp;
            }
            prev = list1;
            list1 = list1.next;
        }
        prev.next = list2;
        return head;
    }
}

public class MergeTwoSortedList {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        try (// Insert node at end
                Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            while (t > 0) {
                int data = s.nextInt();
                list1.insertAtEnd(data);
                t--;
            }
            int t1 = s.nextInt();
            while (t1 > 0) {
                int data = s.nextInt();
                list2.insertAtEnd(data);
                t1--;
            }
        }

        LinkedList mergedList = new LinkedList();
        mergedList.head = mergedList.mergeTwoSortedList(list1.head, list2.head);
        mergedList.print(mergedList.head);
    }
}