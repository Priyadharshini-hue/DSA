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

    int findLength(Node node) {
        int length = 0;

        while (node != null) {
            node = node.next;
            length++;
        }
        return length;
    }

    Node reverseList(int k, Node head) {
        if(head == null||head.next == null) return head;

        int length = findLength(head);

        Node tempNode = new Node(0);
        tempNode.next = head;

        Node prevNode = tempNode, currNode , nextNode ;

        while (k <= length) {
            currNode = prevNode.next;
            nextNode = currNode.next;

            for (int i = 1; i < k; i++) {
                currNode.next = nextNode.next;
                nextNode.next = prevNode.next;
                prevNode.next = nextNode;
                nextNode = currNode.next;
            }
            prevNode = currNode;
            length -= k;
        }
        return tempNode.next;
    }
}

public class ReverseInkkGroupsI {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        try (Scanner s = new Scanner(System.in)) {
            int limit = s.nextInt();

            for (int i = 0; i < limit; i++) {
                int data = s.nextInt();
                list.insertAtEnd(data);
            }
        }
        list.head = list.reverseList(3, list.head);
        list.print();
    }
}