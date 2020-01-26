# MultiThreadingExercise

## H2 Outline of Project

This project looks at using multiple threads. There is a counter that increments whenever it is used, this project was made to demonstrate the different uses of threads and it also shows how random the scheduler is within Java.

## H2 Thread Creation

There is two different ways to create a thread. The first way is creating a class that implements the Runnable interface and can override the run() method, this is a recommended way to create a thread. The second way is to create a new class file and extend the Thread interface and create your thread from there. The second way is a problematic solution as everytime you want to create a new thread you will need to create a new class file to hold it, after a while the files just pile up and this creates more work for your main program to keep going further to access the needed threads.

## H2 Experimenting with Synchronization

When I created the intital increment counter and then created two threads to access the the counter. I didn't use synchronization so the threads just both accessed the counter at the same time. When I added synchronization the first thread accessed the counter and once that was done the second thread accessed the counter, instead of at the same time.



