import java.util.Scanner;

class LinkedList {
    Node head, sortedHead;

    // Insert at end
    void insertAtEnd(int data) {
        Node node = new Node(data);

        if (head == null) {
            head = node;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = node;
        }
    }

    void insertionSort(Node node) {
        if (sortedHead == null || sortedHead.data > node.data) {
            node.next = sortedHead;
            sortedHead = node;
            return;
        }
        Node currentNode = sortedHead;
        while (currentNode.next != null && currentNode.next.data < node.data) {
            currentNode = currentNode.next;
        }
        node.next = currentNode.next;
        currentNode.next = node;
    }

    void sort() {
        sortedHead = null;
        if (head == null || head.next == null) {
            return;
        }

        Node presentNode = head;

        while (presentNode != null) {
            Node nextNode = presentNode.next;
            insertionSort(presentNode);
            presentNode = nextNode;
        }
        head = sortedHead;
    }

    void print() {
        if (head == null) {
            return;
        }

        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }
}

public class InsertionSortLL {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        try (Scanner s = new Scanner(System.in)) {
            int limit = s.nextInt();

            for (int i = 0; i < limit; i++) {
                int data = s.nextInt();
                list.insertAtEnd(data);
            }
        }

        list.sort();
        list.print();
    }
}