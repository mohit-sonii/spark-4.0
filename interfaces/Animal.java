package interfaces;


public interface Animal {
    
    void makeSound();
    void eat();

}


class Dog implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();
        dog.eat();
    }

    /*
    In real -time abstract is not used much, most of the time interface is used

    -> when you have 50% information about the class actions then go for abstract class
    Animal {
        void makeSound();
        void eat();
        void sleep() {
            // concrete method
        }
    }

    -> use interface when you have 0% information about the class actions and want child to provide full implementation

    which is why we say interface is 100% abstraction


    Q -> After java 1.8 we have concrete methohs in interface then how it is 100% abstraction?

    A -> yes we can but those methods are static which are called by name and some are default which depends on child class to override or not just like abstract class, 

    Why Static ? -> suppose we have many child classes implementing the interface, suppose in interface there are 4 abstract methods and each class will override all 4 methods but there is one method which is same for all the classes then instead of writing that method in each class we can write it once in interface as static method and call it by name.

    there will be no major change in both the classes after those methods then why we do it in interface? -> because it enhance the power of the interface and we can provide some common functionality to all the classes.

    -> we cannot create object of interface but in abstract class we are still dependent on constructor to initialisze the memory in JVM
    
    */
    
}