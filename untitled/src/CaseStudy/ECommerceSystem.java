package CaseStudy;

import java.util.Scanner;

public class ECommerceSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int customerId = 0;
        String customerName = "";
        String mobileNumber = "";
        String email = "";
        String city = "";

        String productName = "";
        int productPrice = 0;
        int quantity = 0;

        double purchaseAmount = 0;
        double discount = 0;
        double extraDiscount = 0;
        double memberDiscount = 0;
        double finalAmount = 0;

        while (true) {

            System.out.println("\n==== E-COMMERCE SYSTEM ====");
            System.out.println("1. Register Customer");
            System.out.println("2.View Products");
            System.out.println("3.Place Order");
            System.out.println("4.Generate Bill");
            System.out.println("5.Exit");
            System.out.println("Enter Choice");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:

                    System.out.print("Customer ID: ");
                    customerId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Customer Name: ");
                    customerName = sc.nextLine();

                    System.out.print("Mobile Number: ");
                    mobileNumber = sc.nextLine();

                    if (!mobileNumber.matches("\\d{10}")) {
                        System.out.println("Invalid Mobile Number");
                        break;
                    }

                    System.out.print("Email: ");
                    email = sc.nextLine();

                    System.out.print("City: ");
                    city = sc.nextLine();

                    System.out.println("Customer Registered Successfully");
                    break;

                case 2:

                    System.out.println("\n===== PRODUCT CATALOG =====");
                    System.out.println("1. Laptop - ₹50000");
                    System.out.println("2. Mobile - ₹20000");
                    System.out.println("3. Headphones - ₹2000");
                    System.out.println("4. Smart Watch - ₹5000");
                    System.out.println("5. Exit");
                    break;

                case 3:

                    System.out.println("\n===== PRODUCT CATALOG =====");
                    System.out.println("1. Laptop - ₹50000");
                    System.out.println("2. Mobile - ₹20000");
                    System.out.println("3. Headphones - ₹2000");
                    System.out.println("4. Smart Watch - ₹5000");

                    System.out.print("Select Product: ");
                    int productChoice = sc.nextInt();

                    switch (productChoice) {

                        case 1:
                            productName = "Laptop";
                            productPrice = 50000;
                            break;

                        case 2:
                            productName = "Mobile";
                            productPrice = 20000;
                            break;

                        case 3:
                            productName = "Headphones";
                            productPrice = 2000;
                            break;

                        case 4:
                            productName = "Smart Watch";
                            productPrice = 5000;
                            break;

                        default:
                            System.out.println("Invalid Product Selection");
                            continue;
                    }

                    System.out.print("Enter Quantity: ");
                    quantity = sc.nextInt();

                    if (quantity <= 0) {
                        System.out.println("Invalid Quantity");
                        continue;
                    }

                    purchaseAmount = productPrice * quantity;

                    if (purchaseAmount < 1000) {
                        discount = 0;
                    } else if (purchaseAmount <= 5000) {
                        discount = purchaseAmount * 0.10;
                    } else {
                        discount = purchaseAmount * 0.20;
                    }

                    if (purchaseAmount > 10000) {
                        extraDiscount = purchaseAmount * 0.05;
                    } else {
                        extraDiscount = 0;
                    }

                    System.out.println("\nMembership Type");
                    System.out.println("1. Silver");
                    System.out.println("2. Gold");
                    System.out.println("3. Platinum");
                    System.out.print("Select Membership: ");

                    int membership = sc.nextInt();

                    switch (membership) {

                        case 1:
                            memberDiscount = purchaseAmount * 0.05;
                            break;

                        case 2:
                            memberDiscount = purchaseAmount * 0.10;
                            break;

                        case 3:
                            memberDiscount = purchaseAmount * 0.15;
                            break;

                        default:
                            memberDiscount = 0;
                    }

                    finalAmount = purchaseAmount - discount - extraDiscount - memberDiscount;

                    System.out.println("Order Placed Successfully");
                    break;

                case 4:

                    System.out.println("\n===== ORDER SUMMARY =====");
                    System.out.println("Customer Name : " + customerName);
                    System.out.println("Product : " + productName);
                    System.out.println("Quantity : " + quantity);
                    System.out.println("Purchase Amount : ₹" + purchaseAmount);
                    System.out.println("Discount : ₹" + discount);
                    System.out.println("Extra Discount : ₹" + extraDiscount);
                    System.out.println("Membership Discount : ₹" + memberDiscount);
                    System.out.println("Final Amount : ₹" + finalAmount);

                    if (purchaseAmount > 10000) {
                        System.out.println("Shipping : Free");
                    } else {
                        System.out.println("Shipping : Charges Applicable");
                    }

                    System.out.println("Thank You For Shopping With Us");
                    break;

                case 5:

                    System.out.println("Exiting Application...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }

    }
}
