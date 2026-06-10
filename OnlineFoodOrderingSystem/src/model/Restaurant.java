package model;

import repository.OrderArchive;

public class Restaurant {

    private String restaurantId;
    private String restaurantName;

    private Menu menu;
    private OrderArchive archive;

    public Restaurant(String restaurantId,
                      String restaurantName) {

        this.restaurantId = restaurantId;
        this.restaurantName = restaurantName;

        this.menu = new Menu();
        this.archive = OrderArchive.getInstance();

        System.out.println(
                "Restaurant '" +
                        restaurantName +
                        "' opened."
        );
    }

    public Menu getMenu() {
        return menu;
    }

    public void takeOrder(Order order) {

        archive.save(order);

        System.out.println(
                "Order " +
                        order.getOrderId() +
                        " taken and saved to archive."
        );
    }

    public void close() {

        menu = null;

        System.out.println(
                "Restaurant '" +
                        restaurantName +
                        "' closed. Menu destroyed."
        );
    }
}