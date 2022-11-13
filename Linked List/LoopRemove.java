
import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int t) {
        data = t;
        next = null;
    }
}

public class LoopRemove {

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

    static void loopRemove(Node head) {

        if (head == null || head.next == null)
            return;

        Node slowPtr = head, fastPtr = head,
                entryNode = head;

        // Check loop presence
        while (fastPtr.next != null && fastPtr.next.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if (slowPtr == fastPtr) {
                break;
            }
        }

        // If no loop
        if (fastPtr.next == null || fastPtr.next.next == null) {
            return;
        }

        // Find starting point
        if (entryNode != slowPtr) {
            while (entryNode.next != slowPtr.next) {
                entryNode = entryNode.next;
                slowPtr = slowPtr.next;
            }
            slowPtr.next = null;
        }
        // If the starting point is head
        else {
            // entryNode == slowPtr
            while (entryNode != slowPtr.next) {
                slowPtr = slowPtr.next;
            }
            slowPtr.next = null;
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

        loopRemove(head);
    }
}