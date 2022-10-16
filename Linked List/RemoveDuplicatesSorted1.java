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
        // If the head or the head's next node is empty
        if (node == null || node.next == null) {
            return node;
        }

        // A dummy node to track the non repeated nodes from the original list
        Node prev = new Node(0);
        Node currentNode = node;
        node = prev;
        while (currentNode != null && currentNode.next != null) {
            if (currentNode.next != null && currentNode.data == currentNode.next.data) {
                while (currentNode.next != null && currentNode.data == currentNode.next.data) {
                    currentNode = currentNode.next;
                }
                prev.next = currentNode.next;
            } else {
                prev.next = currentNode;
                prev = prev.next;
            }
            currentNode = currentNode.next;
        }
        return node.next;
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

public class RemoveDuplicatesSorted1 {
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