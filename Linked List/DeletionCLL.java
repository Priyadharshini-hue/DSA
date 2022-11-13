import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int t) {
        data = t;
        next = null;
    }
}

public class DeletionCLL {

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

    static Node deleteAtStart(Node last) {
        if (last == null) {
            return last;
        }
        Node currentNode = last.next;
        if (currentNode == last.next && currentNode.next == last) {
            last = null;
            return last;
        } else {
            last.next = currentNode.next;
            currentNode.next = null;
        }
        return last;
    }

    static Node deleteAtEnd(Node last) {
        if (last == null) {
            return last;
        }
        Node currentNode = last.next, prevNode = null;
        if (currentNode == last.next && currentNode.next == last) {
            last = null;
            return last;
        } else {
            while (currentNode != last) {
                prevNode = currentNode;
                currentNode = currentNode.next;
            }
            prevNode.next = last.next;
            last = prevNode;
            currentNode.next = null;
        }
        return last;
    }

    static Node deleteAtMiddle(Node last) {
        if (last == null) {
            return last;
        }

        Node currentNode = last.next;
        // if only onde node
        if (currentNode == last.next && currentNode.next == last) {
            last = null;
            return last;
        }
        int length = 1;
        while (currentNode != last) {
            currentNode = currentNode.next;
            length++;
        }

        int index = (length % 2 == 0) ? (length / 2) : (length + 1) / 2;
        Node tempNode = last.next, prevNode = null;
        while (index > 1) {
            prevNode = tempNode;
            tempNode = tempNode.next;
            index--;
        }
        prevNode.next = tempNode.next;
        return last;
    }

    // Delete the given node
    static Node deleteGivenNode(Node last, int k) {
        Node head = last.next;
        if (head == null) {
            return head;
        }

        Node currentNode = head, previousNode = null;

        while (k != currentNode.data) {
            if (head == currentNode.next) {
                break;
            }
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        // if only onde node
        if (currentNode == head && currentNode.next == head) {
            last = null;
            return last;
        }
        // if first node
        if (currentNode == head) {
            previousNode = head;
            while (previousNode.next != head) {
                previousNode = previousNode.next;
            }
            head = currentNode.next;
            previousNode.next = head;
        }
        // else if last node
        else if (currentNode.next == head) {
            previousNode.next = head;
            last = previousNode;
            currentNode.next = null;
        } else {
            previousNode.next = currentNode.next;
        }
        return last;
    }

      // Delete the node at given position
      static Node deleteGivenPosition(Node last, int k) {
        Node head = last.next;
        if (head == null) {
            return head;
        }

        Node currentNode = head, previousNode = null;

        while (k != 1) {
            if (head == currentNode.next) {
                break;
            }
            previousNode = currentNode;
            currentNode = currentNode.next;
            k--;
        }
        // if only onde node
        if (k ==1 && currentNode.next == head) {
            last = null;
            return last;
        }
        // if first node
        if (currentNode == head) {
            previousNode = head;
            while (previousNode.next != head) {
                previousNode = previousNode.next;
            }
            head = currentNode.next;
            previousNode.next = head;
        }
        // else if last node
        else if (currentNode.next == head) {
            previousNode.next = head;
            last = previousNode;
            currentNode.next = null;
        } else {
            previousNode.next = currentNode.next;
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
        int length = 9;
        while (length != 0) {
            int t1 = s.nextInt();
            last = insertAtEnd(last, t1);
            length--;
        }

        last = deleteAtStart(last);
        print(last);
        last = deleteAtEnd(last);
        print(last);
        last = deleteAtMiddle(last);
        print(last);
        last = deleteGivenNode(last, 4);
        print(last);
        last=deleteGivenPosition(last, 2);
        print(last);
    }
}