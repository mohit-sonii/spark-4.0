package multiThreading.Basics;
class Yield extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
            // if (i == 2) {
                // System.out.println(Thread.currentThread().getName() + " is yielding...");
                Thread.yield(); 
            // }
        }
    }
}

class Sleep extends  Thread {

    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + " - " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("thread interrupted");
            }
        }
    }
}


class Join extends Thread{
    @Override
    public void run(){
        for(int i=0;i<=5;i++)
        System.out.println("Child thread");
    }
}

public class PreventhreadExecution {
    public static void main(String[] args) throws InterruptedException {
        
        /*
        Methods to prevent thread execution in Java:

        -> yield () ->  The yield() method is a static method of the Thread class that allows a thread to voluntarily give up its current use of the CPU. When a thread calls yield(), it signals to the thread scheduler that it is willing to yield its current time slice and allow other threads of the same priority to run. However, there is no guarantee that the yielding thread will be paused immediately or that other threads will be scheduled to run.
        

        -> when yield happens and by chance it is accepted by thread scheduled then that thread will do to ready statte from running state
        */

        Yield t1 = new Yield();
        Yield t2 = new Yield();

        t1.start();
        t2.start();


        /*
        Thread.sleep()

        -> The sleep() method is a static method of the Thread class that allows a thread to pause its execution for a specified period of time. When a thread calls sleep(milliseconds), it is put into a timed waiting state for the specified duration. During this time, the thread does not consume any CPU resources and allows other threads to execute. After the sleep duration has elapsed, the thread becomes eligible to run again and will be scheduled by the thread scheduler based on its priority and other factors.

        -> for sleep the thread will go to timed waiting state from running state.

        -> it goes to sleeping state and we have two options
        t.sleep()
        t.sleep(millis)
        */

        Sleep s1 = new Sleep();
        s1.setName("Thread Sleeep");
        s1.start();


        /*
            join()

            -> The join() method in Java is used to wait for a thread to complete its execution before allowing the calling thread to proceed. When a thread calls the join() method on another thread, it pauses its own execution until the specified thread has finished executing. This is particularly useful when you want to ensure that a particular thread has completed its task before continuing with further operations in the calling thread.

            -> when one thread calls join() on another thread, it means it says I will wait until you are done with your execution then only I will proceed further.

            -> whwn join is called it opens a waiting state and in that we have three typs
            t.join() -> wait until other thread complete
            t.join(millis) -> wait until other thread complete or millis time elapses
            t.join(millis, nanos) -> wait until other thread complete or millis+nanos time elapses

            then it goes to ready state

        
        */


            Join j1 = new Join();
            j1.start();

            // I want that I want complete the child first 
            j1.join(); // is thread pe join kon krega ? ->  main - jo line execute krega wohi wait krega jab tak j1 thread complete na ho jaye. 

            // now even if I sleep child thread main thread will wait for it to complete first.

            for(int i=0;i<=6;i++){
                System.out.println("main thread");
            }


            /*
            yield() vs sleep()

            -> yield() is a static method of the Thread class that allows a thread to voluntarily give up its current use of the CPU, while sleep() is also a static method of the Thread class that allows a thread to pause its execution for a specified period of time.

            -> but the thing is it is not guranteed that the seceduler will do what yiedl() wants but it is guranteed that sleep() will pause the thread for specified time.
            
            
            */
    }
}
