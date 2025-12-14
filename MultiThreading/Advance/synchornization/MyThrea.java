package synchornization;


public class MyThrea extends Thread{

    TablePrintWithMethod t;
    MyThrea(TablePrintWithMethod t){
        this.t=t;
    }

    @Override
    public void run(){
        t.printTable(5);
    }
    
}
