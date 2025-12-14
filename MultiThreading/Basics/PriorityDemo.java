package multiThreading.Basics;

class Mythread extends Thread{
    @Override
    public void run(){
       System.out.println(Thread.currentThread().getName()+"  "+Thread.currentThread().getPriority());
    }
}



public class PriorityDemo {
    public static void main(String[] args) {
        Mythread t1 = new Mythread();
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.setName("Thread one");


        Mythread t2 = new Mythread();
        t2.setPriority(Thread.MAX_PRIORITY);
        t2.setName("Thread two");

        t1.start();
        t2.start();
    }
}
