package abstractClasses;

public abstract class Vehicle {
    String brand;

    Vehicle(String brand){
        this.brand=brand;
    }

    abstract  void start();

    // are concrete method possible in abstract classes ? YES

    public void concreteMethod(){

    }
    // but how do i call them as we need to make object of the class inorder to call methods and
}
