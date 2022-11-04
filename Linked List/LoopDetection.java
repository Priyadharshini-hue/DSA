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

        int count = 0;
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

    boolean detectLoop() {
        if (head == null || head.next == null)
            return false;

        Node slowPtr = head.next, fastPtr = head.next.next;

        // Check loop presence
        while (fastPtr != null && fastPtr.next != null) {
            if (slowPtr == fastPtr) {
                return true;
            }
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }

        // if no loop is present
        return false;
    }
}

public class LoopDetection {
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

        System.out.println(list.head.next.next.next.next.next.data);
        System.out.println(list.detectLoop());
    }
}