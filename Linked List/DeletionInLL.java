import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int t) {
        data = t;
        next = null;
    }

}

public class DeletionInLL {
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

    // Print the list
    static void print(Node head) {
        Node currentNode = head;

        if (head == null) {
            return;
        } else {
            while (currentNode != null) {
                System.out.print(currentNode.data + " ");
                currentNode = currentNode.next;
            }
        }
        System.out.println(" ");
    }

    // Delete at start
    static Node deleteAtStart(Node head) {
        if (head == null) {
            return null;
        }
        head = head.next;
        return head;
    }

    // Delete at end
    static Node deleteAtEnd(Node head) {
        if (head == null) {
            return head;
        }
        Node currentNode = head;
        while (currentNode.next.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = null;
        return head;
    }

    // Delete at middle
    /*
     * 1 2 (3) 4 5
     * 1 2 (3) 4 even (second of the two middle elements.)
     */
    static void deleteAtMiddle(Node head) {
        Node slow = head, fast = head, previousNode = null;

        while (fast != null && fast.next != null) {
            previousNode = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        previousNode.next = slow.next;
    }

    // Delete the given node
    static Node deleteGivenNode(Node head, int k) {
        Node currentNode = head, previousNode = null;

        if (head == null) {
            return head;
        }

        // if head node
        while (currentNode.data == k) {
            head = currentNode.next;
            return head;
        }

        while (currentNode != null && currentNode.data != k) {
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        // Node not present
        if (currentNode == null) {
            return head;
        }
        previousNode.next = currentNode.next;
        return head;
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
        System.out.println("----------Insert - end-------------");
        print(head);
        System.out.println("-----------Deletion------------");
        System.out.println("------------start------------");
        head = deleteAtStart(head);
        print(head);
        System.out.println("------------end------------");
        head = deleteAtEnd(head);
        print(head);
        System.out.println("-----------middle------------");
        deleteAtMiddle(head);
        print(head);
        System.out.println("-----------given node------------");
        head = deleteGivenNode(head, 3);
        print(head);
        System.out.println("-----------given position------------");
        deleteGivenNode(head,3);
        print(head);
    }
}