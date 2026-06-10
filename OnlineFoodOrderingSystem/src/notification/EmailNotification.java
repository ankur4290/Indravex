package notification;

public class EmailNotification extends Notification {

    public EmailNotification(String notificationId,
                             String recipient,
                             String message) {

        super(notificationId,
                recipient,
                message);
    }

    @Override
    public void send(String message) {

        System.out.println(
                "Email -> "
                        + recipient
                        + " : "
                        + message);

        logNotification();
    }
}