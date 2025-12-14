package advance;

public class Driver {
    
    public static void main(String[] args)  {
        BankAccount ba = new BankAccount();

   Runnable t1 = ()->{
    try {
        ba.withdraw("wife", 500);
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
};
   Runnable t2 = ()->{
    try {
        ba.withdraw("husband", 1000);
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
};

       new Thread(t1).start();
       new Thread(t2).start();
    }
   
}
