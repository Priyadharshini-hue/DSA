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

    Node removeDuplicates(Node node) {
        Node prev = null, currentNode = node;
        while (currentNode != null && currentNode.next != null) {
            prev = currentNode;
            currentNode = currentNode.next;
            while (currentNode != null && prev.data == currentNode.data) {
                prev.next = currentNode.next;
                currentNode = prev.next;
            }
        }
        return node;
    }

    // print the list
    void print(Node head) {
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
}

public class RemoveDuplicatesSorted {
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

        list.head = list.removeDuplicates(list.head);
        list.print(list.head);
    }
}