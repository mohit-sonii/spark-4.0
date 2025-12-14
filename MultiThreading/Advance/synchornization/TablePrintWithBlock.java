package synchornization;


public class TablePrintWithBlock {
    

    public  void printTable(int n){

        // now this means we want lock on this object
        synchronized (this){
            for(int i=1;i<=5;i++){
                System.out.println(Thread.currentThread().getName()+ " : "+(n*i));
                try{
                    Thread.sleep(500);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }

    /* depth ++

    when ever a thread enters in synchronized then that thread takes the lock on that object and when that task is completed then JVM realise the lock.

    We have inter thread communication mechanism and for that we have three methods

    -> wait()
    • this method is called on an object with in a synchronized context/area to make a current thread wait until another thread invokes notify() or notifyAll()
    • when thread calls wait method it release the lock on the object and enter into waiting state.

    -> wait() vs join()
    • join does not run in syncronization context.
    • join does not realse any lock, it just waits for the thread to complete its execution
    • join is not dependent on  any other method to continue where as  wait needs to notify in order to continue.


    -> notify()
    • this is called on an object within syncronized object to wake up the waiting thread. when notify() is invoked it notifies on of the thread that are in waiting on the objectto wake up.
    • The choice of which thread to notify is not specifies and depends on the JVM.


    -> notifyAll()
    • this method is similar to notify but it wakes up all thread that are in waiting state on same object.

     */


    // whcih all methods are realease and acquire lock in multithread ?
}
