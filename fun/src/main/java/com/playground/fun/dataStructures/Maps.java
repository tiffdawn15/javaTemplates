package com.playground.fun.dataStructures;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Maps {
    /**
     * Maps in Java
     * - A map is a collection of key-value pairs
     * - Each key is unique and maps to a single value
     * - Common implementations include HashMap, TreeMap, and LinkedHashMap
     * - Used for fast lookups, insertions, and deletions based on keys
     */

    public static void examples(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("name", "Tiff is Great");

        if (map.containsValue("Tiff is Great")) {
            map.put("name", "Drew is fantastic");
        } else {
            System.out.println("Map does not contain the value: Tiff is Great");
        }

    }


    /**
     * HashMap Collisions - 2+ pieces of data to the same index.
     * Two different keys generate the same hash code because array is finiate.
     */


    /**
     * This implements separate chaining to handle collisions in a hash map.
     * utlize LinkedLIst for key-values in buckets indexed by hash code of keys
     * @param <K>
     * @param <V>
     */
    class MyHashMap<K, V> {
        private LinkedList<Map.Entry<K,V>> [] buckets;
        private int capacity;

        public MyHashMap(int capacity){
            this.capacity = capacity;
            buckets = new LinkedList[capacity];

            for(int i = 0; i < capacity; i++) {
                buckets[i] = new LinkedList<>();
            }
        }
        // Put values in the map
        public void put(K key, V value) {
            int index = key.hashCode() % capacity;
            LinkedList<Map.Entry<K,V>> bucket = buckets[index];
            for(Map.Entry<K, V> entry : bucket){
                if(entry.getKey().equals(key)){
                    entry.setValue(value);
                    return;
                }
            }
        }
    }

    /**
     * Open Addressing
     * When collision occurs the algo searches for an alternative location w/in the array to place the key-value pari
     *
     * Linear probing - after collision, the next index is checked sequentially until an empty slot is found
     * Quadratic probign - uses quadratic incrments (1, 3, 4, 10, 15) away from the collision point. Helps reduce clustering
     * Double Hashing - use second hash fucntion to determine the step size for probing. calculate the next buckat as hash(key) + i @ has2(key)
     * Double Hashing - better distrubution than linear or quadratic  probing.
     */
}