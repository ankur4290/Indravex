package Day3.CaseStudy;

public class Product {

    private String productId;
    private String productName;
    private String category;
    private double price;
    private int stockQuantity;

    public Product(String productId, String productName,
                   String category, double price,
                   int stockQuantity) {

        this.productId = productId;
        this.productName = productName;
        this.category = category;

        if (price > 0) {
            this.price = price;
        } else {
            this.price = 0;
        }

        if (stockQuantity >= 0) {
            this.stockQuantity = stockQuantity;
        } else {
            this.stockQuantity = 0;
        }
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
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
        if (price > 0) {
            this.price = price;
        }
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        if (stockQuantity >= 0) {
            this.stockQuantity = stockQuantity;
        }
    }

    public void displayProductDetails() {

        System.out.println("Product Details");
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Category: " + category);
        System.out.println("Price: " + price);
        System.out.println("Stock Quantity: " + stockQuantity);
    }
}
