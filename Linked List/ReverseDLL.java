import java.util.Scanner;

class Node {
    int data;
    Node next, prev;

    Node(int d) {
        data = d;
        next = prev = null;
    }
}

class LinkedList {
    Node head;

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
            node.prev = currentNode;
        }
    }

    // Reverse a list - iterative
    void reverseList() {
        Node currentNode = head, nextNode = null, prevNode = null;

        if (head == null) {
            return;
        }

        while (currentNode != null) {
            nextNode = currentNode.next;
            currentNode.next = prevNode;
            currentNode.prev = nextNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        head = prevNode;
    }

    void print() {
        Node currentNode = head;

        if (head == null) {
            return;
        } else {
            while (currentNode != null) {
                System.out.print(currentNode.data + " ");
                currentNode = currentNode.next;
            }
        }
        System.out.println(" ");
    }
}

public class ReverseDLL {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        try (Scanner s = new Scanner(System.in)) {
            int limit = s.nextInt();

            for (int i = 0; i < limit; i++) {
                int data = s.nextInt();
                list.insertAtEnd(data);
            }
        }

        list.reverseList();

        list.print();
    }
}