import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class LinkedList {
    Node head;

    // Insert the node at end
    void insertAtEnd(int data) {
        // Create a node and put the data
        Node newNode = new Node(data);
        // If the list is empty
        if (head == null) {
            head = newNode;
        } else {
            // Traverse the list
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    Node findMid(Node node) {
        Node slowPointer = node, fastPointer = node;

        while (fastPointer.next != null && fastPointer.next.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        return slowPointer;
    }

    Node reverse(Node node) {
        Node prev = null, next = null;
        while (node.next != null) {
            next = node.next;
            node.next = prev;
            prev = node;
            node = next;
        }
        node.next = prev;

        return node;
    }

    boolean isPalindrome(Node node) {
        Node mid = findMid(node).next;
        Node secondHalf = reverse(mid);
        while (node != null && secondHalf != null) {
            if (node.data != secondHalf.data) {
                return false;
            }
            node = node.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }
}

public class PalindromeLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        try (// Insert node at end
                Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            while (t > 0) {
                int data = s.nextInt();
                list.insertAtEnd(data);
                t--;
            }
        }

        if (list.isPalindrome(list.head)) {
            System.out.println("Palidrome");
        } else {
            System.out.println("Not a palidrome");
        }
    }
}