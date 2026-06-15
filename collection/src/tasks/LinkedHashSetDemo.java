package tasks;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> students = new LinkedHashSet<>();

        students.add("Ankur");
        students.add("Rahul");
        students.add("Amit");
        students.add("Vikas");
        students.add("Rohan");
        students.add("Karan");
        students.add("Mohit");
        students.add("Sumit");

        students.add("Rahul");
        students.add("Amit");

        System.out.println("Students: " + students);

        students.remove("Karan");

        System.out.println("Contains Rahul: " + students.contains("Rahul"));

        System.out.println("Final List: " + students);
    }
}