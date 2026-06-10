package payment;

public abstract class Payment {

    protected String paymentId;
    protected double amount;
    protected String status;

    public Payment(String paymentId, double amount) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.status = "Pending";
    }

    public abstract void processPayment();

    public String getStatus() {
        return status;
    }
}