package multiThreading.Basics;

class Even extends Thread {

    @Override
    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Even Number: " + i);
        }
    }
}

class Odd extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 9; i += 2) {
            System.out.println("Odd Number: " + i);
        }
    }
}

public class OddEven {

    public static void main(String[] args) {
        /*
        
        Even evenThread = new Even();
        Odd oddThread = new Odd();
        
        evenThread.start();
        oddThread.start();
        
        */

        new Even().start();
        new Odd().start();
    }
}
