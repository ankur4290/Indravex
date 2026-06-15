package tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Product implements Comparable<Product> {
    private int productId;
    private String productName;
    private double productPrice;

    public Product(int productId, String productName, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    @Override
    public int compareTo(Product p) {
        return Integer.compare(this.productId, p.productId);
    }

    @Override
    public String toString() {
        return "Product ID: " + productId +
                ", Name: " + productName +
                ", Price: ₹" + productPrice;
    }
}

class ProductNameComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return p1.getProductName().compareToIgnoreCase(p2.getProductName());
    }
}

class ProductPriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return Double.compare(p1.getProductPrice(), p2.getProductPrice());
    }
}

public class ProductCatalogSorting {
    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product(105, "Laptop", 65000));
        products.add(new Product(101, "Mouse", 500));
        products.add(new Product(103, "Keyboard", 1500));
        products.add(new Product(104, "Monitor", 12000));
        products.add(new Product(102, "Headphones", 2500));

        System.out.println("=== Default Sorting By Product ID ===");
        Collections.sort(products);
        for (Product product : products) {
            System.out.println(product);
        }

        System.out.println("\n=== Sorting By Product Name ===");
        Collections.sort(products, new ProductNameComparator());
        for (Product product : products) {
            System.out.println(product);
        }

        System.out.println("\n=== Sorting By Product Price ===");
        Collections.sort(products, new ProductPriceComparator());
        for (Product product : products) {
            System.out.println(product);
        }
    }
}