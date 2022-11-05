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

    void sort() {
        if (head == null || head.next == null) {
            return;
        }

        Node currentNode = head, tempNode = null;

        while (currentNode.next != null) {
            tempNode = currentNode.next;
            while (tempNode != null) {
                if (currentNode.data > tempNode.data) {
                    int t = currentNode.data;
                    currentNode.data = tempNode.data;
                    tempNode.data = t;
                }
                tempNode = tempNode.next;
            }
            currentNode = currentNode.next;
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
}

public class BubbleSortLL {
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