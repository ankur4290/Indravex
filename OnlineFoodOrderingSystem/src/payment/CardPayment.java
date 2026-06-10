package payment;

public class CardPayment extends Payment {

    private String last4Digits;

    public CardPayment(String paymentId,
                       double amount,
                       String last4Digits) {

        super(paymentId, amount);
        this.last4Digits = last4Digits;
    }

    @Override
    public void processPayment() {

        System.out.println("Processing Card Payment...");
        System.out.println(
                "Rs." + amount +
                        " charged to card ending " +
                        last4Digits);

        status = "Success";
    }
}