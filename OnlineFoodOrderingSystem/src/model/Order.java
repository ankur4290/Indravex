package model;

import interfaces.Rateable;
import interfaces.Trackable;

import java.util.ArrayList;
import java.util.List;

public class Order implements Trackable, Rateable {

    private String orderId;
    private String customerName;
    private List<CartItem> items;
    private double totalPrice;

    private String status;
    private double rating;
    private int ratingCount;

    public Order(String orderId, String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.items = new ArrayList<>();
        this.status = "Created";
    }

    public void addItem(MenuItem item, int quantity) {

        if(item.getPrice() <= 0) {
            System.out.println("Invalid price");
            return;
        }

        if(quantity < 1) {
            System.out.println("Invalid quantity");
            return;
        }

        if(!item.isAvailable()) {
            System.out.println("Item unavailable");
            return;
        }

        CartItem cartItem = new CartItem(item, quantity);
        items.add(cartItem);

        totalPrice += cartItem.getSubtotal();
    }

    public void removeItem(String itemId) {

        CartItem removeItem = null;

        for(CartItem cartItem : items) {
            if(cartItem.getItem().getItemId().equals(itemId)) {
                removeItem = cartItem;
                totalPrice -= cartItem.getSubtotal();
                break;
            }
        }

        if(removeItem != null) {
            items.remove(removeItem);
        }
    }

    public double getTotal() {
        return totalPrice;
    }

    public List<CartItem> getItems() {
        return new ArrayList<>(items);
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void displayOrderSummary() {

        System.out.println("----- Order Summary -----");
        System.out.println("Order ID : " + orderId);
        System.out.println("Customer : " + customerName);

        for(CartItem item : items) {
            System.out.println(
                    item.getItem().getItemName()
                            + " x" + item.getQuantity()
                            + " = Rs." + item.getSubtotal());
        }

        System.out.println("-----------------------");
        System.out.println("Total : Rs." + totalPrice);
    }

    public void updateStatus(String status) {
        this.status = status;
    }

    @Override
    public void track() {
        System.out.println("Tracking Order " + orderId +
                " : " + status);
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void rate(int stars, String comment) {

        rating += stars;
        ratingCount++;

        System.out.println("Rating recorded : "
                + stars + " stars - "
                + comment);
    }

    @Override
    public double getRating() {
        if(ratingCount == 0)
            return 0;

        return rating / ratingCount;
    }
}