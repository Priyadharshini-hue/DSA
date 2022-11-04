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

    void loopRemove() {

        if (head == null || head.next == null)
            return;

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
            return;
        }

        // Find starting point
        if (slowPtr == fastPtr) {
            if (entryNode != slowPtr) {
                while (entryNode.next != slowPtr.next) {
                    entryNode = entryNode.next;
                    slowPtr = slowPtr.next;
                }
                slowPtr.next = null;
            }
            // If the starting point is head
            else {
                while (entryNode != slowPtr.next) {
                    slowPtr = slowPtr.next;
                }
                slowPtr.next = null;
            }
        }
    }
}

public class LoopRemove {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        try (Scanner s = new Scanner(System.in)) {
            int limit = s.nextInt();

            for (int i = 0; i < limit; i++) {
                int data = s.nextInt();
                list.insertAtEnd(data);
            }
        }

        list.createCycle(1);

        list.loopRemove();
    }
}