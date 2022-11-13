import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int t) {
        data = t;
        next = null;
    }
}

public class ReverseCLL {
    static Node insertAtEnd(Node head, int data) {
        Node node = new Node(data);

        if (head == null) {
            head = node;
            head.next = node;
            return head;
        } else {
            Node currentNode = head;
            while (currentNode.next != head) {
                currentNode = currentNode.next;
            }
            currentNode.next = node;
            node.next = head;
        }
        return head;
    }

    static void print(Node head) {

        if (head == null) {
            return;
        } else {
            Node currentNode = head;
            while (currentNode.next != head) {
                System.out.print(currentNode.data + " ");
                currentNode = currentNode.next;
            }
            System.out.print(currentNode.data + " ");
        }
        System.out.println(" ");
    }

    static Node reverse(Node node) {
        if (node == null || node.next == node) {
            return node;
        }
        Node nextNode = null, currentNode = node, prevNode = null;
        while (node.next != currentNode) {
            nextNode = node.next;
            node.next = prevNode;
            prevNode = node;
            node = nextNode;
        }
        node.next = prevNode;
        currentNode.next = node;
        return node;
    }

    static Node reverse1(Node node, Node head) {
        if (node == null || node.next == head) {
            return node;
        }
        Node newHeadNode = reverse1(node.next, head);
        node.next.next = node;
        node.next = newHeadNode;
        return newHeadNode;
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
        head = reverse1(head, head);
        print(head);
    }
}