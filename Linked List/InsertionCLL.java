import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int t) {
        data = t;
        next = null;
    }
}

public class InsertionCLL {

    static Node insertAtEnd(Node last, int data) {
        Node node = new Node(data);

        if (last == null) {
            last = node;
            last.next = node;
            return last;
        } else {
            Node currentNode = last.next;
            while (currentNode != last) {
                currentNode = currentNode.next;
            }
            node.next = last.next;
            currentNode.next = node;
        }
        last = node;
        return last;
    }

    static Node insertAtStart(Node last, int data) {
        Node node = new Node(data),
                currentNode = null;

        if (last == null) {
            last = node;
            node.next = last;
            return last;
        } else {
            currentNode = last.next;
            while (currentNode != last) {
                currentNode = currentNode.next;
            }
            currentNode = currentNode.next;
            node.next = currentNode;
            last.next = node;
        }
        return last;
    }

    static Node insertAtMiddle(Node last, int data) {
        Node node = new Node(data);
        if (last == null) {
            last = node;
            node.next = last;
            return last;
        }

        Node currentNode = last.next;
        int length = 1;
        while (currentNode != last) {
            currentNode = currentNode.next;
            length++;
        }

        int index = (length % 2 == 0) ? (length / 2) : (length + 1) / 2;
        Node tempNode = last.next, prevNode = null;
        while (index > 0) {
            prevNode = tempNode;
            tempNode = tempNode.next;
            index--;
        }
        node.next = prevNode.next;
        prevNode.next = node;
        return last;
    }

    static Node insertAtKthPosition(Node last, int k, int data) {
        if (last == null && k > 1) {
            return last;
        }
        Node node = new Node(data);
        if (k == 1) {
            Node temp = last.next;
            node.next = temp;
            last.next = node;
            return last;
        }
        Node tempNode = last.next, prevNode = last;
        int count = 1;
        while (tempNode != last) {
            if (count == k - 1) {
                prevNode = tempNode;
                break;
            }
            tempNode = tempNode.next;
            count++;
        }
        if (count < k - 1) {
            return last;
        }
        node.next = prevNode.next;
        prevNode.next = node;

        if (tempNode == last) {
            last = last.next;
            return last;
        }
        return last;
    }

    // Print the list
    static void print(Node last) {

        if (last == null) {
            return;
        } else {
            Node currentNode = last.next;
            while (currentNode != last) {
                System.out.print(currentNode.data + " ");
                currentNode = currentNode.next;
            }
            System.out.print(currentNode.data + " ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Node last = null;
        int length = 5;
        while (length != 0) {
            int t1 = s.nextInt();
            last = insertAtEnd(last, t1);
            length--;
        }

        last = insertAtStart(last, 0);
        print(last);
        last = insertAtMiddle(last, 0);
        print(last);
        last = insertAtKthPosition(last, 3, 11);
        print(last);
    }
}