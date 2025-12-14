package advance;

import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    private int balance;

    private final ReentrantLock r1 = new ReentrantLock();

    public void withdraw(String threadName, int amount) throws InterruptedException {

        // now which ever thread will come first it will acquire the lock and other thread will wait until the lock is released
        // in synchronized we don't have any control over lock but here we have control over lock
        System.out.println(threadName + " is trying to withdraw" + amount);
        balance = 3000;
        // r1.lock();
        if (r1.tryLock()) {
            try {
                System.out.println(threadName + " got the lock");
                if (balance >= amount) {
                    Thread.sleep(2000);
                    balance = balance - amount;
                    System.out.println("Withdrawn amount: " + amount);
                } else {
                    System.out.println("Insufficient Balance");
                }
            } finally {
                r1.unlock();
            }
        }
    }
}
