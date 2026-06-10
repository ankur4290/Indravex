package model;

import interfaces.Trackable;

public class DeliveryAgent extends User implements Trackable {

    private String vehicleType;
    private boolean available;
    private String currentLocation;

    public DeliveryAgent(String userId,
                         String name,
                         String email,
                         String phone,
                         String vehicleType) {

        super(userId, name, email, phone);

        this.vehicleType = vehicleType;
        this.available = true;
        this.currentLocation = "Warehouse";
    }

    public void acceptDelivery(Order order) {
        System.out.println("Accepted Order: "
                + order.getOrderId());
    }

    public void markDelivered(String orderId) {
        System.out.println(orderId + " delivered.");
    }

    @Override
    public void track() {
        System.out.println("Agent Location : "
                + currentLocation);
    }

    @Override
    public String getStatus() {
        return available ? "Available" : "Busy";
    }

    @Override
    public void getInfo() {

        System.out.println("----- Delivery Agent -----");
        super.getInfo();
        System.out.println("Vehicle : "
                + vehicleType);
    }
}