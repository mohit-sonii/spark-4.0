package multiThreading.Basics;

class Addition {

    int sum = 0;

    synchronized  public void add() {
        sum += 1;
    }

    // void add {
    //     synchronized{
    //         //
    //     }
    // }

    /* we can make the thread synchronixed either by method or by block, then which is the optimal and shoudl be used ? 
     
        -> only the risky code shall be synchornized, for better performance not method as a whole
     
    */



}

class MyThread extends Thread {

    Addition addition;

    MyThread(Addition addition) {
        this.addition = addition;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            addition.add();
        }
    }

}

class MyThread2 extends Thread {

    Addition addition;

    MyThread2(Addition addition) {
        this.addition = addition;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            addition.add();
        }
    }

}

public class Problem {

    public static void main(String[] args) throws InterruptedException {

        // we can give implementation to abstraact methods in run time -> using anonymous class
        Addition addition = new Addition();
        // we hav single object for addition and we have two threads working on same object
        MyThread thread1 = new MyThread(addition);
        MyThread2 thread2 = new MyThread2(addition);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(addition.sum); // it will print anything which is wrong

        //SOLUTION

        /*
            we can use synchronized keyword to make sure that only one thread can access the add() method at a time.
        
         */
    }
}
