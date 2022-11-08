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

    void findXthNodeFromEnd(int x) {
        Node tempNode = head, currentNode = head;

        while (x != 0) {
            tempNode = tempNode.next;
            x--;
        }
        if (tempNode == null) {
            System.out.println(currentNode);
        }

        while (tempNode.next != null) {
            currentNode = currentNode.next;
            tempNode = tempNode.next;
        }
        System.out.println(currentNode.next.data);
    }
}

public class ToFindXthNodeFromEnd {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        try (Scanner s = new Scanner(System.in)) {
            int limit = s.nextInt();

            for (int i = 0; i < limit; i++) {
                int data = s.nextInt();
                list.insertAtEnd(data);
            }
        }

        list.findXthNodeFromEnd(1);
    }
}