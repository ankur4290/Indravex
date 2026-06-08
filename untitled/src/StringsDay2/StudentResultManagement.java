package StringsDay2;

import java.util.Scanner;

public class StudentResultManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] marks = new int[10][5];

        int topperIndex = 0;
        double highestPercentage = 0;

        for (int i = 0; i < 10; i++) {

            System.out.println("Enter marks for Student " + (i + 1));

            int total = 0;

            for (int j = 0; j < 5; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[i][j] = sc.nextInt();
                total += marks[i][j];
            }

            double percentage = total / 5.0;

            if (percentage > highestPercentage) {
                highestPercentage = percentage;
                topperIndex = i;
            }
        }

        System.out.println("\n===== STUDENT RESULTS =====");

        for (int i = 0; i < 10; i++) {

            int total = 0;

            for (int j = 0; j < 5; j++) {
                total += marks[i][j];
            }

            double percentage = total / 5.0;

            String grade;

            if (percentage >= 90)
                grade = "A";
            else if (percentage >= 75)
                grade = "B";
            else if (percentage >= 60)
                grade = "C";
            else
                grade = "D";

            System.out.println("Student " + (i + 1) +
                    " Total=" + total +
                    " Percentage=" + percentage +
                    " Grade=" + grade);
        }

        System.out.println("\nTopper Student: " + (topperIndex + 1));
        System.out.println("Top Percentage: " + highestPercentage);

        System.out.println("\nSubject Wise Highest Marks");

        for (int j = 0; j < 5; j++) {

            int max = marks[0][j];

            for (int i = 1; i < 10; i++) {
                if (marks[i][j] > max)
                    max = marks[i][j];
            }

            System.out.println("Subject " + (j + 1) + ": " + max);
        }

        sc.close();
    }
}
