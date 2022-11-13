import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int t) {
        data = t;
        next = null;
    }
}

public class ReverseLL {
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
            prevNode = currentNode;
            currentNode = nextNode;
        }
        return prevNode;
    }

    // recursive - divide and conqeuer
    static Node reverse1(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHeadNode = reverse1(head.next);

        head.next.next = head;
        head.next = null;
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
        head = reverse1(head);
        print(head);
    }
}