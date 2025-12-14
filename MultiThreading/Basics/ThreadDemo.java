package multiThreading.Basics;

class MyThread2 extends Thread {

    /*
    What is I do not override run() method in my thread class ?

    -> If you do not override the run() method in your thread class, the thread will not have any specific behavior defined for it. When you start the thread using the start() method, it will execute the default implementation of the run() method from the Thread class, which does nothing. As a result, the thread will start and then immediately terminate without performing any actions. This means that your thread will not execute any custom code or perform any tasks, rendering it effectively useless


    -> Move to RunOverride.java for example.
    */

    @Override
    public void run() {

       for (int i = 0; i < 5; i++) {
         System.out.println("Child Thread: " + i + " - " + Thread.currentThread().getPriority());   
        }

    }
}

public class ThreadDemo {

    public static void main(String[] args) {

        MyThread thread = new MyThread();
        thread.setPriority(Thread.MAX_PRIORITY);
        thread.start();

        for (int i = 0; i < 5; i++) {
         System.out.println("Main Thread: " + i+" - "+Thread.currentThread().getPriority());   
        }
    }
}

/*
Realationship between start() method and run() method in Java Thread?

-> The start() method is used to begin the execution of a thread. When the start() method is called on a Thread object, it creates a new thread of execution and invokes the run() method of that thread. The run() method contains the code that defines the thread's behavior.

-> when we use run() in place of start() method then it will not create a new thread instead it will be executed in the current thread just like a normal method call. which means run() method will be a case of multithreading
*/

/*

Thread Scheduler ?

-> A thread scheduler is a part of the operating system that manages the execution of threads. It determines which thread should run at any given time based on factors such as thread priority, scheduling algorithms, and system load. The thread scheduler ensures that multiple threads can share CPU time effectively, allowing for concurrent execution and improved performance in multi-threaded applications.

-> when multiple thread are waiting for the execution then which thread will run first will be decided by thread scheduler.

-> It majorly decides the thread execution based on priority of the thread. initally the priority of main thread is 5 and when we create a new thread the priority of that thread will be same as main thread unless we change it explicitly.

*/