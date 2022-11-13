
import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int t) {
        data = t;
        next = null;
    }
}

public class LoopCreation {
    Node head = null;

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

    static void loopCreation(Node head, int k) {
        Node currentNode = head, ptrNode = head;
        int ptr = 1;

        while (currentNode.next != null) {
            if (ptr==k) {
                ptrNode=currentNode;
            }
            currentNode = currentNode.next;
            ptr++;
        }
        currentNode.next=ptrNode;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        Node head = null;
        int length = 5;
        while (length != 0) {
            int t1 = s.nextInt();
            head = insertAtEnd(head, t1);
            length--;
        }

        // if the list index as 1 (create cycle at k)
        loopCreation(head, 3);
    }
}