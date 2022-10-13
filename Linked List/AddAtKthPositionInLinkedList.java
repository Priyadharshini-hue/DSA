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

    // Insert node at the end
    void insertAtEnd(int data) {
        // Create node and put the data
        Node newNode = new Node(data);

        // If the node is empty
        if (head == null) {
            head = newNode;
        } else {
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

    void addAtKthPositionInLinkedList(Node head, int k, int newElement) {
        // Create a node and put the data
        Node newNode = new Node(newElement);
        Node currentNode = head;
        int index = 0;

        // If the insertion at start i.e.head
        if (k == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        // Traverse till the list
        while (currentNode != null) {
            index = index + 1;
            if (index == k - 1) {
                break;
            }
            currentNode = currentNode.next;
        }
        // If the position is greater than list size
        if (index < k - 1) {
            System.out.println("List size is less than the given position");
            return;
        }
        // Insert the element at the position
        newNode.next = currentNode.next;
        currentNode.next = newNode;
        return;
    }
}

public class AddAtKthPositionInLinkedList {
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
        list.addAtKthPositionInLinkedList(list.head, 3, 90);
        list.print();
    }
}