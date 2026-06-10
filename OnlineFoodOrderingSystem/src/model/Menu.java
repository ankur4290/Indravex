package model;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<MenuItem> items;

    public Menu() {
        items = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public void removeItem(String itemId) {
        items.removeIf(item -> item.getItemId().equals(itemId));
    }

    public void showAvailableItems() {
        for(MenuItem item : items) {
            if(item.isAvailable()) {
                item.displayItem();
                System.out.println();
            }
        }
    }

    public List<MenuItem> getItems() {
        return items;
    }
}