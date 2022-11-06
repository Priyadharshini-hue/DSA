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

    Node findMidNode() {
        if (head == null || head.next == null) {
            return head;
        }

        /*
         * 1 2 3 4 5 -odd
         * 1 2 3 4 -even (second of the two middle elements -3.)
         * 1 2 3 4 -even (first of the two middle elements. - 2)
         */

        Node slowPtr = head, fastPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        // first of two mid elements
        // Node slowPtr = head, fastPtr = head;
        // while (fastPtr.next != null && fastPtr.next.next != null) {
        // slowPtr = slowPtr.next;
        // fastPtr = fastPtr.next.next;
        // }
        return slowPtr;
    }

}

public class MiddleNodeLL {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        try (Scanner s = new Scanner(System.in)) {
            int limit = s.nextInt();

            for (int i = 0; i < limit; i++) {
                int data = s.nextInt();
                list.insertAtEnd(data);
            }
        }

        System.out.println(list.findMidNode().data);
    }
}
