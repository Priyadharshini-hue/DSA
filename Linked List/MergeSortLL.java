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

    Node findMidNode(Node node) {
        Node slowPtr = node, fastPtr = node;

        while (fastPtr.next != null && fastPtr.next.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }

    Node sort(Node firstHalf, Node secondHalf) {
        Node mergedSortedList = new Node(0),
                tempNode = mergedSortedList;

        while (firstHalf != null && secondHalf != null) {
            if (firstHalf.data < secondHalf.data) {
                tempNode.next = firstHalf;
                firstHalf = firstHalf.next;
            } else {
                tempNode.next = secondHalf;
                secondHalf = secondHalf.next;
            }
            tempNode = tempNode.next;
        }

        while (firstHalf != null) {
            tempNode.next = firstHalf;
            firstHalf = firstHalf.next;
            tempNode = tempNode.next;
        }

        while (secondHalf != null) {
            tempNode.next = secondHalf;
            secondHalf = secondHalf.next;
            tempNode = tempNode.next;
        }

        return mergedSortedList.next;
    }

    Node mergeSort(Node node) {
        // base case
        if (node == null || node.next == null) {
            return node;
        }

        Node middleNode = findMidNode(node),
                nextOfMiddleNode = middleNode.next;
        middleNode.next = null;

        Node leftNode = mergeSort(node);
        Node rightNode = mergeSort(nextOfMiddleNode);

        Node sortedlistHead = sort(leftNode, rightNode);

        return sortedlistHead;
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
}

public class MergeSortLL {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        try (Scanner s = new Scanner(System.in)) {
            int limit = s.nextInt();

            for (int i = 0; i < limit; i++) {
                int data = s.nextInt();
                list.insertAtEnd(data);
            }
        }

        list.head=list.mergeSort(list.head);
        
        list.print();
    }
}