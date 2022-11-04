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

    Node detectStartingPointOfLoop() {

        if (head == null || head.next == null)
            return null;

        Node slowPtr = head.next, fastPtr = head.next.next,
                entryNode = head;

        // Check loop presence
        while (fastPtr != null && fastPtr.next != null) {
            if (fastPtr == slowPtr) {
                break;
            }
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }

        // If no loop
        if (fastPtr == null || fastPtr.next == null) {
            return null;
        }

        // Starting point
        while (entryNode != slowPtr) {
            entryNode = entryNode.next;
            slowPtr = slowPtr.next;
        }

        return entryNode;
    }
}

public class LoopStartingPoint {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        try (Scanner s = new Scanner(System.in)) {
            int limit = s.nextInt();

            for (int i = 0; i < limit; i++) {
                int data = s.nextInt();
                list.insertAtEnd(data);
            }
        }

        list.createCycle(2);

        System.out.println(list.detectStartingPointOfLoop().data);
    }
}