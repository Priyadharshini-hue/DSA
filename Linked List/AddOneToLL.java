import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int t) {
        data = t;
        next = null;
    }

}

public class AddOneToLL {
    // Insert at end
    static Node insertAtEnd(Node head, int data) {
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
        return head;
    }

    // Print the list
    static void print(Node head) {
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

    // O(n) & O(n)
    static int traverseNode(Node node) {
        if (node == null) {
            return 1;
        }

        int carry = traverseNode(node.next);
        node.data = node.data + carry;
        carry = node.data / 10;
        node.data = node.data % 10;
        return carry;
    }

    static Node reverse(Node head) {
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

    static Node addOneToLL(Node node) {
        // int carry = traverseNode(node);

        // if (carry == 1) {
        // Node newNode = new Node(carry);
        // newNode.next = node;
        // return newNode;
        // }
        // System.out.println(carry);
        // return node;
        Node reversedNode = reverse(node), currentNode = reversedNode,
                prevNode = null;
        int carry = 1;

        while (currentNode != null) {
            currentNode.data = currentNode.data + carry;
            carry = currentNode.data / 10;
            currentNode.data = currentNode.data % 10;
            prevNode = currentNode;
            currentNode = currentNode.next;
        }

        if (carry != 0) {
            Node newNode = new Node(carry);
            prevNode.next = newNode;
        }
        return reverse(reversedNode);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Node head = null;
        int length = s.nextInt();
        while (length != 0) {
            int t1 = s.nextInt();
            head = insertAtEnd(head, t1);
            length--;
        }
        head = addOneToLL(head);
        print(head);
    }
}