package com.playground.fun.dataStructures;

import com.playground.fun.dataStructures.LinkedList;

class RunLinkedList {
    public static void main(String[] args){
        LinkedList llist = new LinkedList();

        // Create three nodes with data 1, 2 and 3
        llist.head = new LinkedList.Node(1);
        LinkedList.Node second = new LinkedList.Node(2);
        LinkedList.Node third = new LinkedList.Node(3);

        // Connect the first node with the second node
        llist.head.next = second;
        // Connect the second node with the third node
        second.next = third;

        // Call the printList function to print the linked list
        llist.printList();
    }
}