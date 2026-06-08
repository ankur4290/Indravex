package StringsDay2.Tasks;

import java.util.Scanner;

public class ReverseFrequencyAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");

        System.out.println("Total Words: " + words.length);

        System.out.println("\nReverse Words:");

        for (String word : words) {

            for (int i = word.length() - 1; i >= 0; i--) {
                System.out.print(word.charAt(i));
            }

            System.out.print(" ");
        }

        System.out.println("\n\nWord Frequency:");

        for (int i = 0; i < words.length; i++) {

            int count = 1;
            boolean visited = false;

            for (int k = 0; k < i; k++) {
                if (words[i].equalsIgnoreCase(words[k])) {
                    visited = true;
                    break;
                }
            }

            if (visited)
                continue;

            for (int j = i + 1; j < words.length; j++) {

                if (words[i].equalsIgnoreCase(words[j])) {
                    count++;
                }
            }

            System.out.println(words[i] + " = " + count);
        }

        String longest = words[0];
        String shortest = words[0];

        for (String word : words) {

            if (word.length() > longest.length())
                longest = word;

            if (word.length() < shortest.length())
                shortest = word;
        }

        System.out.println("Longest Word: " + longest);
        System.out.println("Shortest Word: " + shortest);

        sc.close();
    }
}
