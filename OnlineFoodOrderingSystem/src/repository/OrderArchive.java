package repository;

import model.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderArchive {

    private static OrderArchive instance;

    private List<Order> orders;

    private OrderArchive() {
        orders = new ArrayList<>();
    }

    public static OrderArchive getInstance() {

        if (instance == null) {
            instance = new OrderArchive();
        }

        return instance;
    }

    public void save(Order order) {
        orders.add(order);
    }

    public List<Order> getAll() {
        return orders;
    }

    public Order findById(String orderId) {

        for (Order order : orders) {

            if (order.getOrderId().equals(orderId)) {
                return order;
            }
        }

        return null;
    }
}