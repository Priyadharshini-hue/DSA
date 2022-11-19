import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int t) {
        data = t;
        next = null;
    }

}

public class AddTwoNumbersLL {
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

    // Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
    // Output: [8,9,9,9,0,0,0,1]

    // List1: 7->5->9->4->6 // represents number 75946
    // List2: 8->4 // represents number 84
    // Output:
    // Resultant list: 7->6->0->3->0// represents number 76030

    static Node addTwoNumbers(Node head1, Node head2) {
        Node currentNode1 = reverse(head1), currentNode2 = reverse(head2),
                tempNode = new Node(0), dummyNode = tempNode;
        int carry = 0;

        while (currentNode1 != null || currentNode2 != null || carry == 1) {
            int sum = carry;

            if (currentNode1 != null) {
                sum += currentNode1.data;
                currentNode1 = currentNode1.next;
            }

            if (currentNode2 != null) {
                sum += currentNode2.data;
                currentNode2 = currentNode2.next;
            }
            Node node = new Node(sum % 10);
            carry = sum / 10;
            // dummyNode.next = node;
            // dummyNode = dummyNode.next;
            node.next = dummyNode;
            dummyNode = node;
        }
        return dummyNode;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Node head1 = null, head2 = null;
        int length1 = s.nextInt();
        while (length1 != 0) {
            int t1 = s.nextInt();
            head1 = insertAtEnd(head1, t1);
            length1--;
        }

        int length2 = s.nextInt();
        while (length2 != 0) {
            int t1 = s.nextInt();
            head2 = insertAtEnd(head2, t1);
            length2--;
        }
        Node sumHead = addTwoNumbers(head1, head2);
        print(head1);
        print(head2);
        print(sumHead);
    }
}