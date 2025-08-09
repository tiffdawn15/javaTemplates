package com.playground.fun.dataStructures;


import java.util.HashSet;
import java.util.Set;

public class Sets {
    /**
     * follows the unordered way and it found in java.util and extends the collection interface in java
     * duplicates are ignored in sets and it will not print in the final output
     * @param args
     */
    public static void main(String[] args){
        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("two");
        set.add("apple");
        set.add("true");

        System.out.println("Set size: " + set.size());
        System.out.println(set);
    }

}