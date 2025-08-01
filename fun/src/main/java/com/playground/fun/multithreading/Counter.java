package com.playground.fun.multithreading;

class Counter {
    private int c = 0;


    public synchronized void inc(){
        c++;
    }

    public synchronized int get(){
        return c;
    }
}