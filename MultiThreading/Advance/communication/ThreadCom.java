package multiThreading.Advance.communication;

public class ThreadCom {


    public static void main(String[] args) throws InterruptedException {
        ThreadA a1 = new ThreadA();

        a1.start();
        synchronized (a1) {
            System.out.println("Main thread calling wait method..");
            //a1.wait();

            // if i dont wait the result will be 0 but if I wait then its correct, why ? see the answer below
            System.out.println("Main thread get notify");
            System.out.println("total : " + a1.t);
        }

    }
}

/*
we have an object of thread that has run() mehtod na returns the total. Until the run() is invoked the total value will be 0 itself.

Now I have two thread one is main thread and one is AThread()
now both have same priority so I cannot say who will run first
but I assume main gets chance first and we printed the total
-> will ever run() get chance ? no, because main thread already took lock on this object and then it prints the value which is 0 and its printed and then main thread release the lock and then it call run() but that time we already printed the vlaue


-> when the lock realease ??? either the method completed or it waits

and when i use wait() method it realease the lock on current object and then it gets chance for other thread and then it updates the lock.

 */


class ThreadA extends Thread {

    int t = 0;

    @Override
    public void run() {

        synchronized (this) {
            System.out.println("Child thread start ....");
            for (int i = 0; i <= 100; i++) {
                t += i;
            }
        }
    }
}