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

    // Reverse the linked list
    Node removeOccurrence(Node head, int key) {
        if (head == null) {
            System.out.println("List is empty");
            return head;
        } else {
            Node currentNode = head, previousNode = null;

            // If the head contains the key
            while (currentNode != null && currentNode.data == key) {
                head = currentNode.next;
                currentNode = head;
            }

            // For rest of elements
            while (currentNode != null) {
                while (currentNode != null && currentNode.data != key) {
                    previousNode = currentNode;
                    currentNode = currentNode.next;
                }
                // If the key is not present in list
                if (currentNode == null) {
                    return head;
                }
                // unlink the node
                previousNode.next = currentNode.next;

                // Track the current node
                currentNode = previousNode.next;
            }
        }
        return head;
    }
}

public class Removeoccurrences {
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
        list.print(list.head);

        list.head = list.removeOccurrence(list.head, 3);
        list.print(list.head);
    }
}