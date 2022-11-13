import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int t) {
        data = t;
        next = null;
    }
}

public class InsertionInLL {
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

    static Node insertAtStart(Node head, int data) {
        Node node = new Node(data);

        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
        return head;
    }

    static void insertAtMiddle(Node head, int data) {
        Node node = new Node(data);

        if (head == null) {
            head = node;
        }
        /*
         * 1 2 3 _ 4 5 -odd
         * 1 2 _ 3 4 -even (first of the two middle elements.)
         */
        Node slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        node.next = slow.next;
        slow.next = node;
    }

    static Node insertAtKthPosition(Node head, int data, int k) {
        Node node = new Node(data);

        if (k == 0) {
            return head;
        }
        // head insertion if k is 1
        if (k == 1) {
            node.next = head;
            head = node;
            return head;
        }

        Node currentNode = head, prevNode = null;
        int count = 1;

        while (currentNode != null) {
            if (count == k - 1) {
                prevNode = currentNode;
                break;
            }
            currentNode = currentNode.next;
            count++;
        }

        // If k is greater than the list size
        if (currentNode == null) {
            return head;
        }

        node.next = prevNode.next;
        prevNode.next = node;
        return head;
    }

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

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Node head = null;
        int length = 5;
        while (length != 0) {
            int t1 = s.nextInt();
            head = insertAtEnd(head, t1);
            length--;
        }

        System.out.println("----------end-------------");
        print(head);
        System.out.println("-----------start------------");
        head = insertAtStart(head, 0);
        print(head);
        System.out.println("-----------middle------------");
        insertAtMiddle(head, 0);
        print(head);
        // index start from 1
        System.out.println("-----------kth------------");
        head = insertAtKthPosition(head, 100, 5);
        print(head);
        System.out.println("-----------------------");
    }
}