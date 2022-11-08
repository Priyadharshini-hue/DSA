import java.util.Scanner;

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

    Node addOneToLL(Node head) {
        Node lastNode = reverse(head), prevNode = null,
                currentNode = lastNode;
        int c = 1;

        while (currentNode != null) {
            currentNode.data = currentNode.data + c;
            c = currentNode.data / 10;
            currentNode.data = currentNode.data % 10;
            prevNode = currentNode;
            currentNode = currentNode.next;
        }

        if (c != 0) {
            Node newNode = new Node(1);
            prevNode.next = newNode;
        }

        return reverse(lastNode);
    }
    // O(n) & O(n)
    // int addOne(Node node) {
    // if (node == null) {
    // return 1;
    // }
    // int c = addOne(node.next);
    // node.data = c + node.data;
    // int carry = node.data / 10;
    // node.data = node.data % 10;
    // return carry;
    // }

    // Node addOneToLL(Node head) {
    // int carry = addOne(head);
    // if (carry == 1) {
    // Node newNode = new Node(1);
    // newNode.next = head;
    // head = newNode;
    // }
    // return head;
    // }
}

public class AddOneToLL {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        try (Scanner s = new Scanner(System.in)) {
            int limit = s.nextInt();

            for (int i = 0; i < limit; i++) {
                int data = s.nextInt();
                list.insertAtEnd(data);
            }
        }

        list.head = list.addOneToLL(list.head);
        list.print();
    }
}