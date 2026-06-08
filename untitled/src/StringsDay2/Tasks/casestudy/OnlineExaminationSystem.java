package StringsDay2.Tasks.casestudy;

import java.util.Scanner;

public class OnlineExaminationSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] marks = new int[20][5];
        int[] total = new int[20];
        double[] percentage = new double[20];

        for (int i = 0; i < 20; i++) {

            System.out.println("\nEnter marks for Student " + (i + 1));

            for (int j = 0; j < 5; j++) {

                System.out.print("Subject " + (j + 1) + ": ");
                marks[i][j] = sc.nextInt();

                total[i] += marks[i][j];
            }

            percentage[i] = total[i] / 5.0;
        }

        System.out.println("\n===== STUDENT REPORT =====");

        for (int i = 0; i < 20; i++) {

            String performance;

            if (percentage[i] > 80) {
                performance = "Excellent";
            } else if (percentage[i] >= 60) {
                performance = "Good";
            } else if (percentage[i] >= 40) {
                performance = "Average";
            } else {
                performance = "Poor";
            }

            System.out.println(
                    "Student " + (i + 1)
                            + " | Total = " + total[i]
                            + " | Percentage = " + percentage[i]
                            + " | Performance = " + performance);
        }

        int first = -1;
        int second = -1;
        int third = -1;

        for (int i = 0; i < 20; i++) {

            if (first == -1 || percentage[i] > percentage[first]) {
                third = second;
                second = first;
                first = i;
            } else if (second == -1 || percentage[i] > percentage[second]) {
                third = second;
                second = i;
            } else if (third == -1 || percentage[i] > percentage[third]) {
                third = i;
            }
        }

        System.out.println("\n===== TOP 3 STUDENTS =====");

        System.out.println("Rank 1 : Student " + (first + 1)
                + " Percentage = " + percentage[first]);

        System.out.println("Rank 2 : Student " + (second + 1)
                + " Percentage = " + percentage[second]);

        System.out.println("Rank 3 : Student " + (third + 1)
                + " Percentage = " + percentage[third]);

        System.out.println("\n===== SUBJECT WISE AVERAGE =====");

        for (int j = 0; j < 5; j++) {

            int sum = 0;

            for (int i = 0; i < 20; i++) {
                sum += marks[i][j];
            }

            double avg = sum / 20.0;

            System.out.println("Subject " + (j + 1)
                    + " Average = " + avg);
        }

        System.out.println("\n===== FAILED STUDENTS =====");

        boolean found = false;

        for (int i = 0; i < 20; i++) {

            boolean failed = false;

            for (int j = 0; j < 5; j++) {

                if (marks[i][j] < 40) {
                    failed = true;
                    break;
                }
            }

            if (failed) {
                found = true;
                System.out.println("Student " + (i + 1));
            }
        }

        if (!found) {
            System.out.println("No Failed Students");
        }

        sc.close();
    }
}
