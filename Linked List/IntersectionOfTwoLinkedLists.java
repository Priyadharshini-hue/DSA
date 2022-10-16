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

    void insertAtEnd(int d) {
        // Create node and put the data
        Node newNode = new Node(d);

        // If the list is empty
        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            // Traverse the list
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    void print(Node head) {
        Node currentNode = head;
        // If the list is empty
        if (currentNode == null) {
            return;
        } else {
            while (currentNode != null) {
                System.out.println(currentNode.data + " ");
                currentNode = currentNode.next;
            }
        }
        System.out.println();
    }

    Node getIntersectionNode(Node head1, Node head2, int difference) {
        while (difference > 0) {
            head1 = head1.next;
            difference--;
        }
        while (head1 != null && head2 != null) {
            if (head1.data == head2.data) {
                return head1;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return null;
    }

    Node findIntersectionNode(Node head1, Node head2) {
        int firstLength = 0;
        Node firstCurrNode = head1;
        while (firstCurrNode != null) {
            firstLength++;
            firstCurrNode = firstCurrNode.next;
        }
        int secondLength = 0;
        Node secondCurrNode = head2;
        while (secondCurrNode != null) {
            secondLength++;
            secondCurrNode = secondCurrNode.next;
        }

        if (firstLength > secondLength) {
            return getIntersectionNode(head1, head2, firstLength - secondLength);
        } else {
            return getIntersectionNode(head2, head1, secondLength - firstLength);
        }
    }
}

public class IntersectionOfTwoLinkedLists {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        try (// Insert node at end
                Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            while (t > 0) {
                int data = s.nextInt();
                list1.insertAtEnd(data);
                t--;
            }
            int t1 = s.nextInt();
            while (t1 > 0) {
                int data = s.nextInt();
                list2.insertAtEnd(data);
                t1--;
            }
        }
        /*
         * 1st 3->6->9->15->30
         * 2nd 10->15->30
         * 
         * 15 is the intersection point
         */
        Node l = list1.findIntersectionNode(list1.head, list2.head);
        System.out.println(l.data);
    }
}