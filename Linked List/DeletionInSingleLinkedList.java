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

    void deleteAtStart() {
        // If the list is empty
        if (head == null) {
            System.out.println("List is empty");
            return;
        } else {
            // Unlink the current head node
            head = head.next;
        }
    }

    void deleteAtEnd() {
        // If the list is empty
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node currentNode = head, previousNode = null;
            while (currentNode.next != null) {
                previousNode = currentNode;
                currentNode = currentNode.next;
            }
            // Unlink the last node
            previousNode.next = null;
        }
    }

    void deleteAtMiddle() {
        // If the list is empty
        if (head == null) {
            System.out.println("list is empty");
            return;
        } else {
            Node slowPointer = head, fastPointer = head, previousNode = null;

            // Traverse the list using two pointer
            while (fastPointer != null && fastPointer.next != null) {
                fastPointer = fastPointer.next.next;
                previousNode = slowPointer;
                slowPointer = slowPointer.next;
            }
            // Unlink the node
            previousNode.next = slowPointer.next;
        }
    }

    void deleteGivenElement(int key) {
        // If the list is Empty
        if (head == null) {
            System.out.println("List is empty");
            return;
        } else {
            Node currentNode = head, previousNode = null;

            // Travrerse the list to find the key node
            while (currentNode.data != key && currentNode != null) {
                previousNode = currentNode;
                currentNode = currentNode.next;
            }

            // If the key is not present in the list
            if (currentNode == null) {
                System.out.println("Key is not present in the list");
                return;
            }
            // Unlink the node
            previousNode.next = currentNode.next;
        }
    }

    void print() {
        // If the list is empty
        if (head == null) {
            System.out.println("List is empty");
            return;
        } else {
            Node currentnNode = head;
            // Trsverse the list
            while (currentnNode != null) {
                System.out.print(currentnNode.data + " ");
                currentnNode = currentnNode.next;
            }
        }
        System.out.println();
    }
}

public class DeletionInSingleLinkedList {
    public static void main(String[] args) {

        // Creating empty list
        LinkedList list = new LinkedList();

        try (// Insert nodes at end
        Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            while (t > 0) {
                int data = s.nextInt();
                list.insertAtEnd(data);
                t--;
            }
        }
        list.print();

        // Delete a node from the beginning
        list.deleteAtStart();
        list.print();

        // Delete a node from the end
        list.deleteAtEnd();
        list.print();

        // Delete a node from the middle
        list.deleteAtMiddle();
        list.print();

        // Delete a given element from list
        list.deleteGivenElement(3);
        list.print();
    }
}