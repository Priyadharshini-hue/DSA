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

    Node reverse(Node node) {
        Node currentNode = node, nextNode = null, prevNode = null;

        while (currentNode != null) {
            nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        return prevNode;
    }

    Node reverseList(int left, int right, Node head) {
        Node currentNode = head, startNode = head, endNode = null;
        int i = 1;

        while (currentNode != null) {
            if (i > right) {
                break;
            }
            if (i < left) {
                startNode = currentNode;
            }
            if (i == right) {
                endNode = currentNode;
            }
            i++;
            currentNode = currentNode.next;
        }
        if (endNode == null) {
            return head;
        } else {
            endNode.next = null;
        }

        if (left == 1) {
            endNode = head;
            head = reverse(head);
        } else {
            endNode = startNode.next;
            startNode.next = reverse(startNode.next);
        }
        endNode.next = currentNode;
        return head;
    }
}

public class ReverseLL1 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        try (Scanner s = new Scanner(System.in)) {
            int limit = s.nextInt();

            for (int i = 0; i < limit; i++) {
                int data = s.nextInt();
                list.insertAtEnd(data);
            }
        }
        list.head = list.reverseList(1, 5, list.head);
        list.print();
    }
}