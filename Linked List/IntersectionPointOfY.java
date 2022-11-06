class LinkedList {
    Node head, tail;

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
            tail = node;
        }
    }

    void print() {
        if (head == null) {
            return;
        }

        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    // int getdifference(Node head1, Node head2) {
    // int l1 = 1, l2 = 1;
    // while (head1 != null || head2 != null) {
    // if (head1 != null) {
    // head1 = head1.next;
    // l1++;
    // }
    // if (head2 != null) {
    // head2 = head2.next;
    // l2++;
    // }
    // }
    // return l1 - l2;
    // }

    // Node findIntersectionPoint(Node head1, Node head2) {
    // int difference = getdifference(head1, head2);

    // if (difference > 0) {
    // while (difference != 0) {
    // head1 = head1.next;
    // difference--;
    // }
    // } else {
    // while (difference != 0) {
    // head2 = head2.next;
    // difference++;
    // }
    // }

    // while (head1 != head2) {
    // head1 = head1.next;
    // head2 = head2.next;
    // }
    // return head1;
    // }
    Node findIntersectionPoint(Node head1, Node head2) {
        Node d1 = head1, d2 = head2;
        while (d1 != d2) {
            d1 = d1 != null ? d1.next : head2;
            d2 = d2 != null ? d2.next : head1;
        }
        return d1;
    }
}

public class IntersectionPointOfY {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        list.insertAtEnd(0);
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);

        list1.insertAtEnd(4);
        list1.insertAtEnd(5);
        list1.insertAtEnd(6);
        list1.insertAtEnd(7);
        list1.insertAtEnd(8);
        list1.insertAtEnd(9);

        list2.insertAtEnd(10);
        list2.insertAtEnd(1);
        list2.insertAtEnd(2);
        list2.insertAtEnd(3);

        list.tail.next = list2.head;
        list1.tail.next = list2.head;

        System.out.println(list2.findIntersectionPoint(list.head, list1.head).data);
        list.print();
        list1.print();
    }
}