package java8;

@FunctionalInterface
public interface  FunctionalAndLambda {
    
    // Functional Interface is an interface that contains only one abstract method. E.g. run() method of Runnable interface.

    /*
    WHY ?
    To make java funcational, to reduce boiler plate code

    
    Lambda Expression Syntax ?

    -> shorthand to implement a funcational interface

    Syntax of lambda expression:

    (parameters) -> (logic)

    
    */
   int add();

   default void show(){
       System.out.println("This is default method of Functional Interface");
   }
}

// before 1.8
class Test implements FunctionalAndLambda{

    @Override
    public int add() {
        return 30+40;
    }
    
}

class Driver{
    public static void main(String[] args) {
        //Test t = new Test();
        //System.out.println("Sum is: "+t.add());

        FunctionalAndLambda fi = () -> 30+40; // lambda expression
        System.out.println("Sum using lambda expression is: "+fi.add());

    }
}
