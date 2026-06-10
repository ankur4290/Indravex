package model;

public class MenuItem {
    private String itemId;
    private String itemName;
    private String category;
    private double price;
    private boolean available;

    public MenuItem(String itemId, String itemName, String category,
                    double price, boolean available) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.category = category;
        this.price = price;
        this.available = available;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price > 0)
            this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void displayItem() {
        System.out.println("----- Menu Item -----");
        System.out.println("Item ID   : " + itemId);
        System.out.println("Item Name : " + itemName);
        System.out.println("Category  : " + category);
        System.out.println("Price     : Rs." + price);
        System.out.println("Status    : " + (available ? "Available" : "Unavailable"));
    }
}