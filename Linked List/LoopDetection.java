import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int t) {
        data = t;
        next = null;
    }
}

public class LoopDetection {

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
            currentNode = currentNode.next;
            ptr++;
        }
        currentNode.next = ptrNode;
    }

    static boolean detectLoop(Node head) {
        if (head == null || head.next == null)
            return false;

        Node slowPtr = head, fastPtr = head;

        // Check loop presence
        while (fastPtr.next != null && fastPtr.next.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if (slowPtr == fastPtr) {
                return true;
            }
        }

        // if no loop is present
        return false;
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

        System.out.println(detectLoop(head));
    }
}