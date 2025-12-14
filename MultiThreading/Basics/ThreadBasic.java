public class ThreadBasic {
    public static void main(String[] args) {
        
        /*
            Methods in Thread class:
            -> start()
            -> run()
            -> currentThread()
            -> getName()
            -> setName()
            -> getPriority()
            -> setPriority()
            -> sleep()
            -> join()
            -> isAlive()
            -> yield()       
        
        */

            Thread thread = Thread.currentThread();
            thread.setName("My Main Thread");   
            System.out.println(thread.getName());
    }
}
