package payment;

public class CashOnDelivery extends Payment {

    public CashOnDelivery(String paymentId, double amount) {
        super(paymentId, amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Cash On Delivery Selected");
        status = "COD Confirmed";
    }
}