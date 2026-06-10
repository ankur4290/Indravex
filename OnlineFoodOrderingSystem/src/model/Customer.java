package model;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User {

    private String deliveryAddress;
    private List<Order> orderHistory;

    public Customer(String userId,
                    String name,
                    String email,
                    String phone,
                    String deliveryAddress) {

        super(userId, name, email, phone);

        this.deliveryAddress = deliveryAddress;
        this.orderHistory = new ArrayList<>();
    }

    public void placeOrder(Order order) {
        orderHistory.add(order);
        System.out.println("Order placed: " + order.getOrderId());
    }

    public void viewOrderHistory() {

        System.out.println("Order History:");

        for (Order order : orderHistory) {
            System.out.println(order.getOrderId());
        }
    }

    @Override
    public void getInfo() {

        System.out.println("----- Customer -----");
        super.getInfo();
        System.out.println("Address : " + deliveryAddress);
    }
}