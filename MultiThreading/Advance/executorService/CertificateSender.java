package executorService;


public class CertificateSender implements Runnable {
    // Thread pool management 

    /*
    WHY ?
    -> creating many using new Thread() is costly in terms of time and resources.
    -> Thread pools help manage a fixed number of threads to handle multiple tasks efficiently.
    -> Reusing threads from a pool reduces the overhead of thread creation and destruction.
    
    */
   
    private final String studentName;

    public CertificateSender(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public void run() {
        System.out.println("Student " + studentName + " is attending the class. By " + Thread.currentThread().getName());

        try {
            
            Thread.sleep(2000);

        } catch (InterruptedException e) {
        }
        System.out.println("Student " + studentName + " has left the class. By " + Thread.currentThread().getName());
    }

}
