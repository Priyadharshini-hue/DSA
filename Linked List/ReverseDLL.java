import java.util.Scanner;

class Node {
    int data;
    Node next, prev;

    Node(int t) {
        data = t;
        next = prev = null;
    }
}

public class ReverseDLL {
    // Print the list
    static void print(Node head) {
        if (head == null) {
            return;
        } else {
            Node currentNode = head;
            while (currentNode != null) {
                System.out.print(currentNode.data + " ");
                currentNode = currentNode.next;
            }
        }
        System.out.println(" ");
    }

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
            node.prev = currentNode;
        }
        return head;
    }

    // iterative
    static Node reverse(Node head) {
        Node prevNode = null, currentNode = head,
                nextNode = null;
        while (currentNode != null) {
            nextNode = currentNode.next;
            currentNode.next = prevNode;
            currentNode.prev = nextNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        return prevNode;
    }

    // recursive
    static Node reverse1(Node node) {
        if (node == null || node.next == null) {
            return node;
        }
        Node newHeadNode = reverse1(node.next);

        node.next.next = node;
        node.next = null;
        return newHeadNode;
        // Node nextNode = node.next;
        // node.next = node.prev;
        // node.prev=nextNode;
        // if (node.prev==null) {
        // return node;
        // }
        // return reverse1(node.prev);
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
        head = reverse(head);
        print(head);
        head = reverse1(head);
        print(head);
    }
}