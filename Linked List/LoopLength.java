import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int t) {
        data = t;
        next = null;
    }
}

public class LoopLength {
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
        Node currentNode = head, ptrNode = head;
        int ptr = 1;

        while (currentNode.next != null) {
            if (ptr == k) {
                ptrNode = currentNode;
            }
            ptr++;
            currentNode = currentNode.next;
        }
        currentNode.next = ptrNode;
    }

    static int findLoopLength(Node head) {

        if (head == null || head.next == null)
            return 0;

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
            return 0;
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

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        Node head = null;
        int length = 5;
        while (length != 0) {
            int t1 = s.nextInt();
            head = insertAtEnd(head, t1);
            length--;
        }

        loopCreation(head, 2);

        System.out.println(findLoopLength(head));
    }
}