package Day3.Tasks;

public class BankAccountMain {

    public static void main(String[] args) {

        BankAccount account1 =
                new BankAccount(123456789L,
                        "Amit Kumar",
                        25000);

        BankAccount account2 =
                new BankAccount(987654321L,
                        "Rahul Sharma",
                        30000);

        BankAccount account3 =
                new BankAccount(456789123L,
                        "Priya Verma",
                        45000);

        account1.displayAccountInfo();
        System.out.println();

        account2.displayAccountInfo();
        System.out.println();

        account3.displayAccountInfo();
    }
}
