// Linked list to array

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class LinkedList {
    Node head;

    // Insert the node at end
    void insertAtEnd(int data) {
        // Create a node and put the data
        Node newNode = new Node(data);
        // If the list is empty
        if (head == null) {
            head = newNode;
        } else {
            // Traverse the list
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    // print the list
    void print() {
        // If the list is empty
        if (head == null) {
            return;
        } else {
            // Traverse the list
            Node currentNode = head;
            while (currentNode != null) {
                System.out.print(currentNode.data + " ");
                currentNode = currentNode.next;
            }
            System.out.println();
        }
    }

    void listToArray(LinkedList list) {
        List<Integer> array = new ArrayList<Integer>();

        Node currentNode = head;
        while (currentNode != null) {
            array.add(currentNode.data);
            currentNode = currentNode.next;
        }
        System.out.println(array);
    }
}

public class ListToArray {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        try (// Insert node at end
                Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            while (t > 0) {
                int data = s.nextInt();
                list.insertAtEnd(data);
                t--;
            }
        }
        list.print();

        list.listToArray(list);
    }
}