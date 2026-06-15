package tasks;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> employees = new HashMap<>();

        employees.put(101, "Ankur");
        employees.put(102, "Rahul");
        employees.put(103, "Amit");
        employees.put(104, "Vikas");

        System.out.println("Employee Records: " + employees);

        System.out.println("Employee ID 102: " + employees.get(102));

        employees.put(102, "Rahul Sharma");

        employees.remove(103);

        System.out.println("Contains Key 101: " + employees.containsKey(101));
        System.out.println("Contains Value Ankur: " + employees.containsValue("Ankur"));

        System.out.println("Final Records: " + employees);
    }
}