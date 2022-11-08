// Input:
// a: 501 :   1 → 0 → 5
// b: 639 :   9 → 3 → 6

// Output:
// c: 1140 :   0 → 4 → 1 → 1

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
        Node temp = new Node(0), dummyNode = temp;
        int carry = 0;

        while (head1 != null || head2 != null || carry != 0) {
            int val = carry;

            if (head1 != null) {
                val += head1.data;
            }
            if (head2 != null) {
                val += head2.data;
            }

            carry = val / 10;

            Node newNode = new Node(val % 10);
            dummyNode.next = newNode;
            dummyNode = dummyNode.next;

            if (head1 != null) {
                head1 = head1.next;
            }
            if (head2 != null) {
                head2 = head2.next;
            }
        }
        return temp.next;
    }
}

public class AddTwoNumbersLLI {
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