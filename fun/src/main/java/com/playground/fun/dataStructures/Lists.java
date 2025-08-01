package com.playground.fun.dataStructures;


import java.util.ArrayList;
import java.util.LinkedList;

public class Lists {
/**
 *  Collections in java
 *  - gourp of individual objects treated as a single unit
 *
 */

    /**
     * Array list - limited by size of array is predefined and fixed
     * <p>
     * - Part of the collection framework
     * - provides dynamic arrays
     * - dynamically add and remove items
     * automatically resizes itself
     *
     * @param args
     */
    public static void testArray(Integer[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
        System.out.println(list);

        list.remove(3);

        System.out.println(list);

    }

    /**
     * Linked LIst - Preferred over array list when there are frequent insertions and deletions
     * - element not stored in contiguosu location
     * - Element is called node
     * - Node is an object with address and data parts
     * - nodes linked using pointers and addresses
     * -
     *
     * @param args
     */
    public static void linkedListExample(String args[]) {
        LinkedList<String> object = new LinkedList<String>();

        object.add("A");
        object.add("B");
        object.add("C");

        System.out.println(object);

        object.remove("B");
        object.removeFirst();

        System.out.println("After deletions: " + object);
    }

}