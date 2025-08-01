package com.playground.fun.multithreading;

public class Restaurant {
    public static void main(String[] args){
        Thread t1 = new CookingTask("Salad");
        Thread t2 = new CookingTask("Soup");
        Thread t3 = new CookingTask("Main Course");

        t1.start();
        t2.start();
        t3.start();
    }
}