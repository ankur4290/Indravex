package tasks;

import java.util.*;

class EmployeeComparator {
    int id;
    String name;
    double salary;

    EmployeeComparator(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + salary;
    }
}

class NameComparator implements Comparator<EmployeeComparable> {
    @Override
    public int compare(EmployeeComparable e1, EmployeeComparable e2) {
        return e1.name.compareTo(e2.name);
    }
}

class SalaryComparator implements Comparator<EmployeeComparable> {
    @Override
    public int compare(EmployeeComparable e1, EmployeeComparable e2) {
        return Double.compare(e1.salary, e2.salary);
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        List<EmployeeComparable> employees = new ArrayList<>();

        employees.add(new EmployeeComparable(105, "Ankur", 45000));
        employees.add(new EmployeeComparable(101, "Rahul", 50000));
        employees.add(new EmployeeComparable(103, "Amit", 40000));
        employees.add(new EmployeeComparable(102, "Vikas", 55000));
        employees.add(new EmployeeComparable(104, "Rohan", 48000));

        Collections.sort(employees, new NameComparator());
        System.out.println("Sorted By Name:");
        System.out.println(employees);

        Collections.sort(employees, new SalaryComparator());
        System.out.println("Sorted By Salary:");
        System.out.println(employees);
    }
}