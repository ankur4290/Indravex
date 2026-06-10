package notification;

public class PushNotification extends Notification {

    public PushNotification(String notificationId,
                            String recipient,
                            String message) {

        super(notificationId,
                recipient,
                message);
    }

    @Override
    public void send(String message) {

        System.out.println(
                "Push -> "
                        + recipient
                        + " : "
                        + message);

        logNotification();
    }
}