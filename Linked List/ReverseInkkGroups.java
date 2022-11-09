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

    // Print
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

    Node reverseList(int k, Node head) {
        Node currentNode = head;

        int totalNodes = 0;
        while (currentNode != null && totalNodes < k) {
            currentNode = currentNode.next;
            totalNodes++;
        }

        if (totalNodes < k) {
            return head;
        }

        currentNode = head;
        Node prevNode = null;
        Node nextNode = null;
        int nodeCount = 0;

        while (nodeCount < k) {
            nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
            nodeCount++;
        }
        head.next = reverseList(k, nextNode);
        return prevNode;
    }
}

public class ReverseInkkGroups {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        try (Scanner s = new Scanner(System.in)) {
            int limit = s.nextInt();

            for (int i = 0; i < limit; i++) {
                int data = s.nextInt();
                list.insertAtEnd(data);
            }
        }
        list.head = list.reverseList(2, list.head);
        list.print();
    }
}