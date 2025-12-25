package comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>(new MyComparator());

        students.add(new Student(1, "Alice", 85));
        students.add(new Student(5, "Bob", 90));
        students.add(new Student(33, "Xharlie", 80));
        students.add(new Student(2, "David", 95));

        /*
        
        can  we use same sorting using comparable for custom classes ?
        - Yes, then why two funcationalities ?

        - Comparable usually run with class by implements the comparable interface. Java says when we want to use natural sorting order then use comparable.
        - Comparator usually run outside the class, Java says when we want to use custom sorting order then use comparator.

        Still why two functionalities ?
        
        -  we have funcationalInterface over Comparator meaning we can have multiple implementations at runtime using lambda expressions.
        */

        Comparator<Student> byRoll = (s1,s2) -> s1.roll-s2.roll;
       Comparator<Student> studentComparator =  Comparator.comparing(Student::getName).thenComparing(Student::getMarks); // :: Method reference
       // this is not possible in comparable
        System.out.println(students);

    }
}
