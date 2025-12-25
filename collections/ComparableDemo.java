package collections;
import java.util.*;

public class ComparableDemo {
    public static void main(String args[]){
         /*
        Comparable -> natural sorting, used in TreeSet, TreeMap, Arrays.sort(), Collections.sort(), ascending order
          - All predefined wrapper classes implement Comparable interface
          - it works on thred parameter - -1,0,1
          - can we use Comparable for cusom classes? -> Yes, by implementing Comparable interface in custom classes
          - This sorting is called TimSorting where JVM decides the sorting, also in the compareTo method ew have two objects, and we cannnot say which one will be picked by jvm and why next, when a new element is added it compares with all the previous elements and places it at the correct position.
          
        Comparator -> Custom Sorting, Customizer classes
        */

        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(1);
        Collections.sort(list);
        System.out.println(list);

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(3,"Mohit"));
        students.add(new Student(1,"Ankit"));
        students.add(new Student(2,"Rahul"));

        Collections.sort(students); // will work becuse of that implemented comparable in student class


        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(3,"Mohit",101)); 
        employees.add(new Employee(1,"Ankit",102));
        employees.add(new Employee(2,"Rahul",103));
        Collections.sort(employees, new Employee()); // because this method accepts comparator object

    }
}
