package Day3.Tasks;

public class BankAccount {

    private long accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(long accountNumber,
                       String accountHolderName,
                       double balance) {

        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;

        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {

        if (balance >= 0) {
            this.balance = balance;
        }
    }

    public void displayAccountInfo() {

        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}
