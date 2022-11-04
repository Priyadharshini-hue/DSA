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

    void createCycle(int k) {

        // no loop
        if (k < 0)
            return;

        int count = 1;
        Node currNode = head, ptr = head;

        while (currNode.next != null) {
            if (k != count) {
                count++;
                ptr = ptr.next;
            }
            currNode = currNode.next;
        }
        currNode.next = ptr;
    }

    int findLoopLength() {

        if (head == null || head.next == null)
            return 0;

        Node slowPtr = head.next, fastPtr = head.next.next,
                entryNode = head;

        // Check loop presence
        while (fastPtr != null && fastPtr.next != null) {
            if (slowPtr == fastPtr) {
                break;
            }
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }

        // If no loop
        if (fastPtr == null || fastPtr.next == null) {
            return -1;
        }

        // Starting point of loop
        while (entryNode != slowPtr) {
            entryNode = entryNode.next;
            slowPtr = slowPtr.next;
        }

        // Find the length loop
        int count = 1;
        slowPtr = slowPtr.next;
        while (entryNode != slowPtr) {
            count++;
            slowPtr = slowPtr.next;
        }

        return count;
    }
}

public class LoopLength {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        try (Scanner s = new Scanner(System.in)) {
            int limit = s.nextInt();

            for (int i = 0; i < limit; i++) {
                int data = s.nextInt();
                list.insertAtEnd(data);
            }
        }

        list.createCycle(3);

        System.out.println(list.findLoopLength());
    }
}