package Tasks;

import java.util.Scanner;

public class EmployeeMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Add Employee");
        System.out.println("2. Update Employee");
        System.out.println("3. Delete Employee");
        System.out.println("4. Exit");

        System.out.println("Enter you choice: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Employee Added");
                break;
            case 2:
                System.out.println("Employee Updated");
                break;
            case 3:
                System.out.println("Employee Deleted");
                break;
            case 4:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice");
        }
        sc.close();
    }
}
