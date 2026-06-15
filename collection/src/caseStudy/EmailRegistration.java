import java.util.HashSet;

public class EmailRegistration {
    public static void main(String[] args) {
        HashSet<String> emails = new HashSet<>();

        emails.add("ankur@gmail.com");
        emails.add("rahul@gmail.com");
        emails.add("ankur@gmail.com");

        System.out.println(emails);
    }
}