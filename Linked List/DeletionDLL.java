import java.util.Scanner;

class Node {
    int data;
    Node next, prev;

    Node(int d) {
        data = d;
        next = prev = null;
    }
}

class LinkedList {
    Node head;

    // Insert at end
    void insertAtEnd(int data) {
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
    }

    // Print the list
    void print() {
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
    void deleteAtStart() {
        if (head == null) {
            return;
        }
        Node currentNode = head;
        head = head.next;
        currentNode.next = null;
        head.prev = null;
    }

    // Delete at end
    void deleteAtEnd() {
        if (head == null) {
            return;
        }
        Node currentNode = head;
        while (currentNode.next.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = null;
    }

    // Delete at middle
    /*
     * 1 2 (3) 4 5
     * 1 2 (3) 4 even (second of the two middle elements.)
     */
    void deleteAtMiddle() {
        Node slow = head, fast = head, previousNode = null;

        while (fast != null && fast.next != null) {
            previousNode = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        previousNode.next = slow.next;
        slow.next.prev = previousNode;
    }

    // Delete the given node
    void deleteGivenNode(int k) {
        Node currentNode = head, previousNode = null;

        if (head == null) {
            return;
        }

        // if head node
        while (currentNode.data == k) {
            head = head.next;
            currentNode.next = null;
            if (head != null) {
                head.prev = null;
            }
            return;
        }

        while (currentNode != null && currentNode.data != k) {
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        // Node not present
        if (currentNode == null) {
            return;
        }
        previousNode.next = currentNode.next;
        if (currentNode.next != null) {
            currentNode.next.prev = previousNode;
            return;
        }
    }

    // Delete the node at given position
    void deleteGivenPosition(int p) {
        if (head == null) {
            return;
        }
        Node currentNode = head, previousNode = null;

        if (p == 1) {
            head = head.next;
            currentNode.next = null;
            if (head != null) {
                head.prev = null;
            }
            return;
        }

        while (currentNode != null && 1 < p) {
            previousNode = currentNode;
            currentNode = currentNode.next;
            p--;
        }

        // If k is greater than list size
        if (currentNode == null) {
            return;
        }
        previousNode.next = currentNode.next;

        if (currentNode.next != null) {
            currentNode.next.prev = previousNode;
            return;
        }
    }
}

public class DeletionDLL {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        try (
                Scanner s = new Scanner(System.in)) {
            int limit = s.nextInt();

            for (int i = 0; i < limit; i++) {
                int data = s.nextInt();
                list.insertAtEnd(data);
            }
        }
        // System.out.println("----------Insert - end-------------");
        // list.print();
        // System.out.println("-----------Deletion------------");
        // System.out.println("------------start------------");
        // list.deleteAtStart();
        // list.print();
        // System.out.println("------------end------------");
        // list.deleteAtEnd();
        // list.print();
        // System.out.println("-----------middle------------");
        list.deleteAtMiddle();
        list.print();
        System.out.println("-----------given node------------");
        list.deleteGivenNode(3);
        list.print();
        System.out.println("-----------given position------------");
        list.deleteGivenPosition(1);
        list.print();
    }
}