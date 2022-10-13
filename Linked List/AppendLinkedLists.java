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
    // Head node is null intially
    Node head;

    void insertAtEnd(int data) {
        // Create a node and put the data
        Node newNode = new Node(data);

        // If the list is empty
        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            // Traverse the list
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            // Add the node at the end of the list
            currentNode.next = newNode;
        }
    }

    void print(Node head) {
        // If the list is empty
        if (head == null) {
            System.out.println("List is empty");
            return;
        } else {
            Node currentnNode = head;
            // Traverse the list
            while (currentnNode != null) {
                System.out.print(currentnNode.data + " ");
                currentnNode = currentnNode.next;
            }
        }
        System.out.println();
    }

    Node appendLists(Node list1, Node list2) {
        Node currentNode = list1;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = list2;
        return list1;
    }
}

public class AppendLinkedLists {
    public static void main(String[] args) {
        // Creating empty list
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        LinkedList appendedList = new LinkedList();

        try (// Insert nodes at end
                Scanner s = new Scanner(System.in)) {
            int t1 = s.nextInt();
            while (t1 > 0) {
                int data = s.nextInt();
                list1.insertAtEnd(data);
                t1--;
            }
            int t2 = s.nextInt();
            while (t2 > 0) {
                int data = s.nextInt();
                list2.insertAtEnd(data);
                t2--;
            }
        }
        list1.print(list1.head);
        list2.print(list2.head);

        Node l = appendedList.appendLists(list1.head, list2.head);
        appendedList.print(l);
    }
}