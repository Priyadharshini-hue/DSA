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

    void segregateOddEvenLL() {
        if (head == null || head.next == null) {
            return;
        }

        Node odd = new Node(0), oddTemp = odd,
                even = new Node(0), evenTemp = even,
                currentNode = head;

        while (currentNode != null) {
            // even
            if (currentNode.data % 2 == 0) {
                evenTemp.next = currentNode;
                evenTemp = evenTemp.next;
            } else {
                oddTemp.next = currentNode;
                oddTemp = oddTemp.next;
            }
            currentNode = currentNode.next;
        }
        evenTemp.next = odd.next;
        oddTemp.next = null;
        head = even.next;
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
}

public class SegregateOddEvenLL {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        try (Scanner s = new Scanner(System.in)) {
            int limit = s.nextInt();

            for (int i = 0; i < limit; i++) {
                int data = s.nextInt();
                list.insertAtEnd(data);
            }
        }
        list.segregateOddEvenLL();
        list.print();
    }
}