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

    void segregate012() {
        Node zeroPtr = new Node(0), onePtr = new Node(0),
                twoPtr = new Node(0), currentNode = head;
        Node zero = zeroPtr, one = onePtr, two = twoPtr;

        while (currentNode != null) {
            if (currentNode.data == 0) {
                zeroPtr.next = currentNode;
                zeroPtr = zeroPtr.next;
            } else if (currentNode.data == 1) {
                onePtr.next = currentNode;
                onePtr = onePtr.next;
            } else {
                twoPtr.next = currentNode;
                twoPtr = twoPtr.next;
            }
            currentNode = currentNode.next;
        }

        zeroPtr.next = one.next != null ? one.next : two.next;
        onePtr.next = two.next;
        twoPtr.next = null;
        head = zero.next;
    }
}

public class Sort012 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        try (Scanner s = new Scanner(System.in)) {
            int limit = s.nextInt();

            for (int i = 0; i < limit; i++) {
                int data = s.nextInt();
                list.insertAtEnd(data);
            }
        }
        list.segregate012();
        list.print();
    }
}