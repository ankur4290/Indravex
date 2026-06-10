package notification;

public class SMSNotification extends Notification {

    public SMSNotification(String notificationId,
                           String recipient,
                           String message) {

        super(notificationId,
                recipient,
                message);
    }

    @Override
    public void send(String message) {

        System.out.println(
                "SMS -> "
                        + recipient
                        + " : "
                        + message);

        logNotification();
    }
}