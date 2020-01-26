package com.sparta.cob.engineering50.javabasic;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        SharedCounter sharedCounter = new SharedCounter();

        Thread thread1 = new  CounterThread(sharedCounter);
        Thread thread2 = new  CounterThread(sharedCounter);

        Task task = new Task();
        Thread thread = new Thread(task);

        thread.start();
        thread1.start();
        thread2.start();
    }

    static class Task implements Runnable{

        @Override
        public void run(){
            System.out.println("I am inside run");
        }
    }
}
