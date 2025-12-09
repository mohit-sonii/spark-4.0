public class MainThread {

    /*
        What exactly is Main Thread in java ?

        -> In Java, the main thread is the primary thread of execution that is created by the Java Virtual Machine (JVM) when a Java program starts. It is the thread that executes the main() method, which serves as the entry point for the program. The main thread is responsible for initializing the program, creating other threads if needed, and managing the overall flow of execution.

        -> The main thread has a default name of "main" and a default priority of 5. It is important to note that the main thread can create additional threads to perform concurrent tasks, allowing for multi-threaded programming in Java.
    */
    public static void main(String[] args) {
        System.out.println("Main Thread Name: " + Thread.currentThread().getName());
    }
}
