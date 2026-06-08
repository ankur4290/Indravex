package Day3.CaseStudy;

public class ProductMain {

    public static void main(String[] args) {

        Product product1 = new Product(
                "P1001",
                "Wireless Mouse",
                "Electronics",
                899,
                50
        );

        Product product2 = new Product(
                "P1002",
                "Bluetooth Speaker",
                "Electronics",
                1499,
                30
        );

        Product product3 = new Product(
                "P1003",
                "Water Bottle",
                "Home",
                299,
                100
        );

        product1.displayProductDetails();
        System.out.println();

        product2.displayProductDetails();
        System.out.println();

        product3.displayProductDetails();
    }
}
