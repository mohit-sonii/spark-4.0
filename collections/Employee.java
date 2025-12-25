package collections;

import java.util.Comparator;

public class Employee implements Comparator<Employee>{
    int id;
    String name;
    int dept;

    public Employee(int id, String name, int dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }
    @Override
    public int compare(Employee o1,Employee o2) {
        return o1.id - o2.id; // Ascending order based on id
    }

    public Employee() {
        // Default constructor for Comparator
    }
}
