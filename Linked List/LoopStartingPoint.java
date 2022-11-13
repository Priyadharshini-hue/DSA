import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int t) {
        data = t;
        next = null;
    }
}

public class LoopStartingPoint {
    // Insert at end
    static Node insertAtEnd(Node head, int data) {
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
        return head;
    }

    static void loopCreation(Node head, int k) {
        int count = 1;
        Node currNode = head, ptr = head;
        while (currNode.next != null) {
            if (k == count) {
                ptr = currNode;
            }
            count++;
            currNode = currNode.next;
        }
        currNode.next = ptr;
    }

    static Node detectStartingPointOfLoop(Node head) {

        if (head == null || head.next == null)
            return null;

        Node slowPtr = head, fastPtr = head,
                entryNode = head;

        // Check loop presence
        while (fastPtr.next != null && fastPtr.next.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if (fastPtr == slowPtr) {
                break;
            }
        }

        // If no loop
        if (fastPtr.next == null || fastPtr.next.next == null) {
            return null;
        }

        // Starting point-head
        if (entryNode == slowPtr) {
            return entryNode;
        } else {
            while (entryNode != slowPtr) {
                entryNode = entryNode.next;
                slowPtr = slowPtr.next;
            }
            return entryNode;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        Node head = null;
        int length = 5;
        while (length != 0) {
            int t1 = s.nextInt();
            head = insertAtEnd(head, t1);
            length--;
        }
        loopCreation(head, 1);

        System.out.println(detectStartingPointOfLoop(head).data);
    }
}