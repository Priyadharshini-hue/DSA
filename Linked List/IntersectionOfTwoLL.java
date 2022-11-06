import java.util.HashSet;
import java.util.Set;

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

    Node findIntersectNodes(Node head1, Node head2) {
        Set<Integer> set = new HashSet<>();

        Node ptr = new Node(0), temp = ptr;
        while (head2 != null) {
            set.add(head2.data);
            head2 = head2.next;
        }

        while (head1 != null) {
            if (set.contains(head1.data)) {
                temp.next = new Node(head1.data);
                temp = temp.next;
            }
            head1 = head1.next;
        }
        return ptr.next;
    }
}

public class IntersectionOfTwoLL {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkedList list1 = new LinkedList();

        list.insertAtEnd(0);
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);

        list1.insertAtEnd(4);
        list1.insertAtEnd(5);
        list1.insertAtEnd(6);
        list1.insertAtEnd(0);
        list1.insertAtEnd(8);
        list1.insertAtEnd(2);

        Node ptr = list.findIntersectNodes(list.head, list1.head);
        list.head = ptr;

        list.print();
    }
}