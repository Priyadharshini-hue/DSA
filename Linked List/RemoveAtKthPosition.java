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

    void deleteKthElement(Node head, int k) {
        Node currentNode = head, previousNode = null;
        int index = 1;
        // If the node to be removed is head
        if (k == 1) {
            this.head = head.next;
        }
        // Traverse the list
        while (currentNode.next != null) {
            //
            if (k == index) {
                break;
            }
            previousNode = currentNode;
            currentNode = currentNode.next;
            index++;
        }
        previousNode.next = currentNode.next;
    }
}

public class RemoveAtKthPosition {
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
        list.deleteKthElement(list.head, 3);
        list.print();
    }
}