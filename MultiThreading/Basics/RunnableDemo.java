package multiThreading.Basics;
class MyTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Task is running in a separate thread.");
    }
}


public class RunnableDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyTask());

        /*
            How ?
            -> Inside Thread class we have a constructor which takes Runnable interface refrence as an argument.
            -> when we call start() method of Thread class it internally calls the run() method of Runnable interface.
            -> because we are implementing runnable interface in MyTask which is why we are able to provide the argument of Runnable type while creating Thread class object.
        */
       thread.start();
    }
}
