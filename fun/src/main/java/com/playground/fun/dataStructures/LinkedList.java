package com.playground.fun.dataStructures;

class LinkedList {
    // Node class definition within LinkedList class
    static class Node {
        int data;
        Node next;
        // Node constructor
        Node(int d) {
            this.data = d;
            next = null;
        }
    }

    // Pointer to head node
    Node head;

    // Constructor
    LinkedList() {
        head = null;
    }

    // Function to print the linked list
    void printList() {
        // Pointer to traverse the linked list
        Node n = head;
        while (n != null) {
            // Print the data of the node
            System.out.print(n.data + " ");
            // Move to the next node
            n = n.next;
        }
    }
}
