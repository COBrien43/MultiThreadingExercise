package com.sparta.cob.engineering50.javabasic;

public class SharedCounter {
    private int counter = 0;


    public int getCounter() {
        System.out.println("Entered in getCounter "+Thread.currentThread().getId());
        return counter;
    }

    public int incrementCounter(){
        System.out.println("Entered in increase counter "+Thread.currentThread().getId());
        return ++counter;


    }

}
