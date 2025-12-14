package interfaces;

public interface Gadi {
    void start();
    void stop();


    // all methods in interface are implicity public and abstract
    // we cannt create object of interface and construcuor
    // all variables are public final static by default
    // until java 1.8 we don't have any concrete method in interface after java 1.8 we can put default and static method with body

    // WHY default methods?
    // -> because they will go to child thorugh parent
}
