package comparator;

/*
say if we use implment comparable in student class


*/
public class Student implements Comparable<Student>{
    int roll;
    String name;
    int marks;

    public Student(int roll, String name, int marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    @Override
    public int compareTo(Student o) {
     return  this.name.compareTo(o.name);
     // we cannot have two sorting logics in comparable
     // fixed logic only
    }

    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
    public int getRoll(){
        return roll;
    }
    public void setRoll(int roll){
        this.roll=roll;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}
