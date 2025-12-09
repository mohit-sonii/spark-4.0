
class MyThread extends Thread {

    // No override of run() method

}


public class RunOverride {

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();

        /*
        Now will it create a new thread ?

        -> Yes, it will create a new thread but that thread will not do anything as we have not overridden the run() method in MyThread class. so the default implementation of run() method from Thread class will be executed which does nothing.

        -> when we override the run() method that means we are defining a new task for that thread to perform but in this case there is no task defined for that thread, hence it will not perform any action.
        */

        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread: " + i);
        }
    }
    
}
