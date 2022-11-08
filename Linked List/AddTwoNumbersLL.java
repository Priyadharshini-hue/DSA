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

    Node reverse(Node head) {
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

    Node addTwoNumbers(Node head1, Node head2) {
        Node list1 = reverse(head1), list2 = reverse(head2),
                sum = null;
        int carry = 0;

        while (list1 != null || list2 != null || carry != 0) {
            int val = carry;

            if (list1 != null) {
                val += list1.data;
            }
            if (list2 != null) {
                val += list2.data;
            }

            carry = val / 10;

            Node newNode = new Node(val % 10);
            newNode.next = sum;

            sum = newNode;

            if (list1 != null) {
                list1 = list1.next;
            }
            if (list2 != null) {
                list2 = list2.next;
            }
        }
        return sum;
    }
}

public class AddTwoNumbersLL {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        LinkedList list = new LinkedList();

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

        list.head = list.addTwoNumbers(list1.head, list2.head);
        list.print();
    }
}