package tasks;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(45);
        numbers.add(10);
        numbers.add(70);
        numbers.add(25);
        numbers.add(90);
        numbers.add(5);
        numbers.add(60);
        numbers.add(15);
        numbers.add(35);
        numbers.add(80);

        System.out.println("Sorted Elements: " + numbers);

        System.out.println("First Element: " + numbers.first());
        System.out.println("Last Element: " + numbers.last());

        System.out.println("Greater than 30: " + numbers.tailSet(30, false));
        System.out.println("Less than 50: " + numbers.headSet(50));

        numbers.remove(25);

        System.out.println("After Removal: " + numbers);
    }
}