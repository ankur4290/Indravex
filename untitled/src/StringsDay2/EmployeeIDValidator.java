package StringsDay2;

import java.util.Scanner;

public class EmployeeIDValidator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] empIds = {
                "EMP-101",
                "EMP-102",
                "EMP-103",
                "EMP-104",
                "EMP-105",
                "EMP-106",
                "EMP-107",
                "EMP-108",
                "EMP-109",
                "EMP-110"
        };

        System.out.print("Enter Employee ID: ");
        String searchId = sc.nextLine();

        boolean found = false;

        for (String id : empIds) {

            if (id.equalsIgnoreCase(searchId)) {

                found = true;

                System.out.println("Employee Exists");

                String empNumber = id.substring(4);
                System.out.println("Employee Number: " + empNumber);

                String[] parts = id.split("-");
                System.out.println("Prefix: " + parts[0]);
                System.out.println("Number: " + parts[1]);

                break;
            }
        }

        if (!found) {
            System.out.println("Employee Does Not Exist");
        }

        sc.close();
    }
}
