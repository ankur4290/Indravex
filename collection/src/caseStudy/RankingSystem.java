import java.util.TreeSet;

class Student implements Comparable<Student> {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student s) {
        return this.marks - s.marks;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + marks;
    }
}

public class RankingSystem {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>();

        students.add(new Student(1, "Ankur", 85));
        students.add(new Student(2, "Rahul", 70));
        students.add(new Student(3, "Amit", 92));
        students.add(new Student(4, "Vikas", 75));

        System.out.println(students);
    }
}