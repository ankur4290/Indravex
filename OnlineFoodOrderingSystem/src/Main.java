import model.*;
import notification.*;
import payment.*;
import repository.OrderArchive;
import service.CheckoutService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Menu menu = new Menu();

        MenuItem pizza = new MenuItem("F001",
                "Margherita Pizza",
                "Main Course",
                299,
                true);

        MenuItem bread = new MenuItem("F002",
                "Garlic Bread",
                "Starter",
                99,
                true);

        MenuItem burger = new MenuItem("F003",
                "Veg Burger",
                "Fast Food",
                149,
                true);

        menu.addItem(pizza);
        menu.addItem(bread);
        menu.addItem(burger);

        System.out.println("========== ONLINE FOOD ORDERING SYSTEM ==========");

        System.out.print("Enter Customer Name : ");
        String customerName = sc.nextLine();

        Order order = new Order("ORD101", customerName);

        int choice;

        do {

            System.out.println("\n========== MENU ==========");
            System.out.println("1. Show Menu");
            System.out.println("2. Add Pizza");
            System.out.println("3. Add Garlic Bread");
            System.out.println("4. Add Burger");
            System.out.println("5. View Order");
            System.out.println("6. Make Payment");
            System.out.println("7. Track Order");
            System.out.println("8. Rate Order");
            System.out.println("9. Restaurant Archive Demo");
            System.out.println("0. Exit");

            System.out.print("Enter Choice : ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    menu.showAvailableItems();
                    break;

                case 2:

                    System.out.print("Enter Pizza Quantity : ");
                    int pizzaQty = sc.nextInt();

                    order.addItem(pizza, pizzaQty);

                    System.out.println("Pizza Added Successfully");
                    break;

                case 3:

                    System.out.print("Enter Bread Quantity : ");
                    int breadQty = sc.nextInt();

                    order.addItem(bread, breadQty);

                    System.out.println("Garlic Bread Added Successfully");
                    break;

                case 4:

                    System.out.print("Enter Burger Quantity : ");
                    int burgerQty = sc.nextInt();

                    order.addItem(burger, burgerQty);

                    System.out.println("Burger Added Successfully");
                    break;

                case 5:

                    order.displayOrderSummary();
                    break;

                case 6:

                    System.out.println("\nSelect Payment Method");
                    System.out.println("1. UPI");
                    System.out.println("2. Card");
                    System.out.println("3. Cash On Delivery");

                    int paymentChoice = sc.nextInt();

                    Payment payment = null;

                    if (paymentChoice == 1) {

                        sc.nextLine();

                        System.out.print("Enter UPI ID : ");
                        String upiId = sc.nextLine();

                        payment = new UPIPayment(
                                "PAY101",
                                order.getTotal(),
                                upiId);

                    } else if (paymentChoice == 2) {

                        sc.nextLine();

                        System.out.print("Enter Last 4 Card Digits : ");
                        String digits = sc.nextLine();

                        payment = new CardPayment(
                                "PAY102",
                                order.getTotal(),
                                digits);

                    } else if (paymentChoice == 3) {

                        payment = new CashOnDelivery(
                                "PAY103",
                                order.getTotal());
                    }

                    CheckoutService checkoutService =
                            new CheckoutService();

                    checkoutService.checkout(order, payment);

                    NotificationService notificationService =
                            new NotificationService();

                    notificationService.register(
                            new SMSNotification(
                                    "N001",
                                    "9876543210",
                                    ""));

                    notificationService.register(
                            new EmailNotification(
                                    "N002",
                                    "customer@gmail.com",
                                    ""));

                    notificationService.register(
                            new PushNotification(
                                    "N003",
                                    customerName,
                                    ""));

                    notificationService.notifyAllChannels(
                            "Your order has been placed successfully!");

                    order.updateStatus("Confirmed");

                    break;

                case 7:

                    order.track();
                    break;

                case 8:

                    sc.nextLine();

                    System.out.print("Enter Rating (1-5) : ");
                    int stars = Integer.parseInt(sc.nextLine());

                    System.out.print("Enter Comment : ");
                    String comment = sc.nextLine();

                    order.rate(stars, comment);

                    System.out.println(
                            "Average Rating : "
                                    + order.getRating());

                    break;

                case 9:

                    Restaurant restaurant =
                            new Restaurant(
                                    "R001",
                                    "Spice Garden");

                    restaurant.takeOrder(order);

                    restaurant.close();

                    System.out.println(
                            "\n----- Order Archive -----");

                    OrderArchive archive =
                            OrderArchive.getInstance();

                    for (Order archivedOrder : archive.getAll()) {

                        System.out.println(
                                archivedOrder.getOrderId()
                                        + " : "
                                        + archivedOrder.getCustomerName()
                                        + " Rs."
                                        + archivedOrder.getTotal());
                    }

                    break;

                case 0:

                    System.out.println("Thank You For Using The System");
                    break;

                default:

                    System.out.println("Invalid Choice");
            }

        } while (choice != 0);

        sc.close();
    }
}