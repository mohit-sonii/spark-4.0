package synchornization;

public class TestSync {

    public static void main(String[] args) {
        System.out.println("sync method......");

        TablePrintWithMethod t = new TablePrintWithMethod();

        Thread t1 = new MyThrea(t);
        Thread t2= new MyThrea(t);


        t1.setName("t1-thread");
        t2.setName("t2-thead");


        t1.start();
        t2.start();
    }
}
