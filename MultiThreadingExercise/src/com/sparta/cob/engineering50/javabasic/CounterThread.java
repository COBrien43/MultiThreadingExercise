package com.sparta.cob.engineering50.javabasic;

public class CounterThread extends Thread {
    private final SharedCounter data;

    public CounterThread(SharedCounter data){
        this.data = data;
    }

    @Override
    public void run() {
        synchronized (data) {
            int oldValue = data.getCounter();
            System.out.println(Thread.currentThread().getName() + " Old" +
                    "Value " + oldValue);

            int newValue = data.incrementCounter();
            System.out.println(Thread.currentThread().getName() + " New" +
                    "Value " + newValue);
        }
    }
}
