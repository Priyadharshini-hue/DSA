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

    boolean search(int k) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.data == k) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    int findKthPositionedNode(int k) {
        int index = 1;
        Node currentNode = head;

        while (currentNode != null) {
            if (index == k) {
                return currentNode.data;
            }
            currentNode = currentNode.next;
            index++;
        }
        return -1;
    }
}

public class SearchInLL {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        try (Scanner s = new Scanner(System.in)) {
            int limit = s.nextInt();

            for (int i = 0; i < limit; i++) {
                int data = s.nextInt();
                list.insertAtEnd(data);
            }
        }
        System.out.println(list.search(13));

        System.out.println(list.findKthPositionedNode(4));
    }
}