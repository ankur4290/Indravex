package tasks;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        numbers.add(70);
        numbers.add(80);
        numbers.add(20);
        numbers.add(40);

        System.out.println("Elements: " + numbers);

        System.out.println("Contains 50: " + numbers.contains(50));

        numbers.remove(30);

        System.out.println("Final Set: " + numbers);
    }
}