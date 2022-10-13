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

    void findKthElement(Node head, int k) {
        Node currentNode = head;
        int index = 1;
        // Traverse the list
        while (currentNode.next != null) {
            // If reaches the position, terminate loop
            if (index == k) {
                break;
            }
            index++;
            currentNode = currentNode.next;
        }
        // If the list size is less than the given position
        if (index < k) {
            System.out.println("List size is less than the given position");
            return;
        }
        System.out.println(currentNode.data);
    }
}

class kthElementInSinglyLinkedList {
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

        list.findKthElement(list.head, 6);
    }
}