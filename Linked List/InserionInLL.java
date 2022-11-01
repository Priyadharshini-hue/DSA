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

    // Insert at start
    void insertAtStart(int data) {
        Node node = new Node(data);

        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    void insertAtMiddle(int data) {
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

    void insertAtKthPosition(int data, int k) {
        Node node = new Node(data);

        // head insertion if k is 1
        if (k == 1) {
            node.next = head;
            head = node;
            return;
        }

        Node currentNode = head, prevNode = null;
        while (1 < k && currentNode != null) {
            prevNode = currentNode;
            currentNode = currentNode.next;
            k--;
        }

        // If k is greater than the list size
        if (currentNode == null) {
            return;
        }
        node.next = prevNode.next;
        prevNode.next = node;
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
}

public class InserionInLL {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        try (Scanner s = new Scanner(System.in)) {
            int limit = s.nextInt();

            for (int i = 0; i < limit; i++) {
                int data = s.nextInt();
                list.insertAtEnd(data);
            }
        }
        System.out.println("----------end-------------");
        list.print();
        System.out.println("-----------start------------");
        list.insertAtStart(0);
        list.print();
        System.out.println("-----------middle------------");
        list.insertAtMiddle(0);
        list.print();
        System.out.println("-----------kth------------");
        list.insertAtKthPosition(100, 13);
        list.print();
        System.out.println("-----------------------");
    }
}