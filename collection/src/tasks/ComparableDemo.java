package tasks;

import java.util.ArrayList;
import java.util.Collections;

class EmployeeComparable implements Comparable<EmployeeComparable> {
    int id;
    String name;
    double salary;

    EmployeeComparable(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(EmployeeComparable e) {
        return this.id - e.id;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + salary;
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        ArrayList<EmployeeComparable> employees = new ArrayList<>();

        employees.add(new EmployeeComparable(105, "Ankur", 45000));
        employees.add(new EmployeeComparable(101, "Rahul", 50000));
        employees.add(new EmployeeComparable(103, "Amit", 40000));
        employees.add(new EmployeeComparable(102, "Vikas", 55000));
        employees.add(new EmployeeComparable(104, "Rohan", 48000));

        Collections.sort(employees);

        System.out.println(employees);
    }
}