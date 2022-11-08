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

    // Print the list
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

    void deleteXthNodeFromEnd(int x) {
        Node tempNode = head, currentNode = head;

        while (x != 0) {
            tempNode = tempNode.next;
            x--;
        }

        if (tempNode == null) {
            head = currentNode.next;
            currentNode.next = null;
            return;
        }

        while (tempNode.next != null) {
            currentNode = currentNode.next;
            tempNode = tempNode.next;
        }

        currentNode.next = currentNode.next.next;
    }
}

public class ToDeleteXthNodeFromEnd {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        try (Scanner s = new Scanner(System.in)) {
            int limit = s.nextInt();

            for (int i = 0; i < limit; i++) {
                int data = s.nextInt();
                list.insertAtEnd(data);
            }
        }

        list.deleteXthNodeFromEnd(4);

        list.print();
    }
}