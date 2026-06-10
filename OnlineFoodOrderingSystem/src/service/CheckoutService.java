package service;

import model.Order;
import payment.Payment;

public class CheckoutService {

    public void checkout(Order order, Payment payment) {

        System.out.println("\n========== CHECKOUT ==========");

        payment.processPayment();

        System.out.println("Payment Status : "
                + payment.getStatus());

        System.out.println("Order "
                + order.getOrderId()
                + " checkout completed.");
    }
}