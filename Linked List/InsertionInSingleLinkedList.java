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

    // Insert the node at end
    void insertAtEnd(int data) {
        // Create a node and put the data
        Node newNode = new Node(data);
        // If the list is empty
        if (head == null) {
            head = newNode;
        } else {
            // Traverse the list
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    // print the list
    void print() {
        // If the list is empty
        if (head == null) {
            return;
        } else {
            // Traverse the list
            Node currentNode = head;
            while (currentNode != null) {
                System.out.print(currentNode.data + " ");
                currentNode = currentNode.next;
            }
            System.out.println();
        }
    }

    // Insert the node at start
    void insertAtStart(int data) {
        // Create a node and put data
        Node newNode = new Node(data);

        Node currentNode = head;
        head = newNode;
        newNode.next = currentNode;
    }

    // Insert the node at middle
    void insertAtMiddle(int data) {
        // Create a node and put the data
        Node newNode = new Node(data);

        Node fastPointer = head, slowPointer = head;
        while (fastPointer.next != null && fastPointer.next.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        newNode.next = slowPointer.next;
        slowPointer.next = newNode;
    }

    // Insert after the node
    void insertAfter(Node previousNode, int data) {
        // Create a node and put the data
        Node newNode = new Node(data);

        newNode.next = previousNode.next;
        previousNode.next = newNode;
    }
}

public class InsertionInSingleLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        try (// Insert node at end
                Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            while (t > 0) {
                int data = s.nextInt();
                list.insertAtEnd(data);
                t--;
            }
        }
        list.print();

        // Insert node at start
        list.insertAtStart(8);
        list.print();

        // Insert Node at middle
        list.insertAtMiddle(90);
        list.print();

        // Insert after
        list.insertAfter(list.head.next.next, 78);
        list.print();
    }
}