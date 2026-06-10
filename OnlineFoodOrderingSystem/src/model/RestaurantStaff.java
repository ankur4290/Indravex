package model;

public class RestaurantStaff extends User {

    private String restaurantId;
    private String role;

    public RestaurantStaff(String userId,
                           String name,
                           String email,
                           String phone,
                           String restaurantId,
                           String role) {

        super(userId, name, email, phone);

        this.restaurantId = restaurantId;
        this.role = role;
    }

    public void updateMenuAvailability(
            MenuItem item,
            boolean status) {

        item.setAvailable(status);
    }

    @Override
    public void getInfo() {

        System.out.println("----- Restaurant Staff -----");
        super.getInfo();
        System.out.println("Restaurant : "
                + restaurantId);
        System.out.println("Role       : "
                + role);
    }
}