import java.util.Scanner;

class LinkedList {
    Node head;

    void insertAtEnd(int data) {
        Node node = new Node(data);

        if (head == null) {
            head = node;
            return;
        }

        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = node;
    }

    boolean isPalindrome(Node node) {

        Node slowPtr = node, fastPtr = node, dummyNode = node,
                prevNode = null, nextNode = null;

        // Find the mid
        while (fastPtr.next != null && fastPtr.next.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }

        // Reverse
        while (slowPtr != null) {
            nextNode = slowPtr.next;
            slowPtr.next = prevNode; // prevNode=reversedNode
            prevNode = slowPtr;
            slowPtr = nextNode;
        }

        // Compare two lists
        while (dummyNode != null && prevNode != null) {
            if (dummyNode.data != prevNode.data) {
                return false;
            }
            dummyNode = dummyNode.next;
            prevNode = prevNode.next;
        }
        return true;
    }
}

public class PalindromeLL {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        try (Scanner s = new Scanner(System.in)) {
            int limit = s.nextInt();
            while (limit > 0) {
                int d = s.nextInt();
                list.insertAtEnd(d);
                limit--;
            }
        }

        System.out.println(list.isPalindrome(list.head));
    }
}