package tasks;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class EqualsDemo {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Ankur");
        Student s2 = new Student(1, "Ankur");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}