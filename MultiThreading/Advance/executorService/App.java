package executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {
    public static void main(String[] args) {
        
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        /*
        Difference between cachedThreadPool and fixedThreadPool:
        -> cachedThreadPool creates new threads as needed and reuses previously constructed threads when they are available. It is suitable for applications with many short-lived tasks.
        -> fixedThreadPool creates a pool with a fixed number of threads. If all threads are busy, new tasks have to wait until a thread becomes available. It is suitable for applications with a known number of concurrent tasks.


        callable vs future

        -> Callable is an interface that represents a task that returns a result and may throw an exception. It is similar to Runnable but can return a value.
        -> Future is an interface that represents the result of an asynchronous computation. It provides methods to check if the computation is complete, to wait for its completion, and to retrieve the result.

        
        */

        String[] students = {"Alice", "Bob", "Charlie", "David", "Eve", "Frank"};

        for(String student : students) {
          CertificateSender task = new CertificateSender(student);
          executorService.submit(task);
        }
        executorService.shutdown();
    }
}
