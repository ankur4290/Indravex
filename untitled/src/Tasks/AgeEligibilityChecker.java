package Tasks;

import java.util.Scanner;

public class AgeEligibilityChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Age");
        int age = sc.nextInt();

        if(age < 18) {
            System.out.println("Not Eligible");
        } else if (age >= 18 && age <= 59) {
            System.out.println("Eligible");
        } else {
            System.out.println("Senior Citizen");
        }
        sc.close();
    }
}
