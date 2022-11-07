import java.util.Scanner;

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
        }
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

    void removeduplicates() {

        if (head == null || head.next == null) {
            return;
        }

        Node currentNode = head, prevNode = null;

        while (currentNode != null && currentNode.next != null) {
            prevNode = currentNode;
            currentNode = currentNode.next;
            while (currentNode != null && prevNode.data == currentNode.data) {
                currentNode = currentNode.next;
            }
            prevNode.next = currentNode;
        }
    }
}

public class RemoveDuplicatesI {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        try (Scanner s = new Scanner(System.in)) {
            int limit = s.nextInt();

            for (int i = 0; i < limit; i++) {
                int data = s.nextInt();
                list.insertAtEnd(data);
            }
        }

        list.removeduplicates();
        list.print();
    }
}