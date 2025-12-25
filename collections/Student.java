package collections;

public class Student implements Comparable<Student> {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /*
    0 -equal
    1 - big (postive)
    -1 - small (negative)

    */
    public int compareTo(Student other) {
        return this.id - other.id; // Ascending order based on id
    }


}
