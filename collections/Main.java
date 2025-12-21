
package collections;

import java.util.*;


public class Main {
    
    /*
    What is collections?
    -> In java, a collection is a data structure that allows you to store, retrieve, and manipulate groups of objects as a single unit. Collections provide a way to organize and manage data efficiently.
    */

    /*
    Why Wrapper classes ?
    ->Java was designed to be object oriented programming but primitive data types are not objects. To overcome this limitation, Java provides wrapper classes for each primitive data type. Wrapper classes allow primitives to be treated as objects, enabling them to be used in collections and other object-oriented contexts.

    1-> Collections -> Group of objects
    2-> For serialization -> Converting object to byte stream
    3-> For using in Generics -> Generics work with objects only, not with primitive data types
    4-> For Synchronization -> Some wrapper classes provide methods for thread-safe operations on primitive data types. example -> sync(this)
    5-> Auto-boxing and Unboxing -> Automatic conversion between primitive data types and their corresponding wrapper classes

    Integer i = 10; // Auto-boxing
    int j = i; // Unboxing
    */


    /*
    Collection vs Collections

    -> Collection is an super interface for List,Set,Queue in Java that represents a group of objects, while Collections is a utility/helper class that provides static methods for manipulating collections.
    
    */

    /*
    we have .get() method in list and array both then how can we say random access is only in array?

    -> Array implement Random Access interface but linkedlist does not implement. but that random access interface has nothing init and those interface is just a market interface to tell that this data structure support random access or not. As Linked list does not have that implemented as there is no index like things in linked list so it does not support random access.

    Then what about .get() method in linked list?
     -> in linked list .get() internally traverse the linked list from starting to that index and return the value. so it is not random access.
    
    */

     /*
     Fetch in Collections

     1 -> Enumeration -> Used for legacy Classes like Vector and Stack. It cannot remove elements from the collection during iteration. Only Fetch

     2 -> Iterator -> Works for all collection types. Traverses in forward direction only. Can remove elements during iteration.

     3 -> ListIterator -> Works only for List types like ArrayList and LinkedList. Traverses in both forward and backward directions. Can add, remove, and modify elements during iteration.
     
     */
    public static void main(String[] args) {
        
        Vector<Integer> vector = new Vector<>();

        vector.add(10);
        vector.add(20);
        Enumeration<Integer> enumeration = vector.elements();
        while(enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

        List<Integer> list = new ArrayList<>();
        list.add(30);
        list.add(40);
        list.add(50);
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()) {
           int data = iterator.next();
           if(data == 30) {
            iterator.remove();
           } else {
            System.out.println(data);
           }
        }


        ListIterator<Integer> listIterator = list.listIterator();
        while(listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

    }
}
