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

    // Reverse a list - iterative
  /*void reverseList() {
    Node currentNode=head,nextNode=null,prevNode=null;

    if(head==null){
    return;
    }

    while (currentNode!=null) {
    nextNode=currentNode.next;
    currentNode.next=prevNode;
    prevNode=currentNode;
    currentNode=nextNode;
    }
    head=prevNode;
    }*/    

    // Reverse a list - recursive
   /*Node reverseList(Node node) {
    if (node == null || node.next == null) {
    return node;
    }

    Node rest = reverseList(node.next);
    node.next.next = node;

    node.next = null;

    return rest;
    }*/

    // Tail Recursive Method
    Node reverseList(Node currentNode, Node prevNode) {
        if (head == null) {
            return head;
        }
        if (currentNode.next == null) {
            head = currentNode;
            currentNode.next = prevNode;
            return head;
        }
        Node nextNode = currentNode.next;
        currentNode.next = prevNode;
        reverseList(nextNode, currentNode);
        return head;
    }

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

public class ReverseLL {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        try (Scanner s = new Scanner(System.in)) {
            int limit = s.nextInt();

            for (int i = 0; i < limit; i++) {
                int data = s.nextInt();
                list.insertAtEnd(data);
            }
        }

        // list.reverseList();
        // Node head = list.reverseList(list.head);

        Node head = list.reverseList(list.head, null);
        list.head = head;
        list.print();
    }
}