package notification;

public abstract class Notification {

    protected String notificationId;
    protected String recipient;
    protected String message;

    public Notification(String notificationId,
                        String recipient,
                        String message) {

        this.notificationId = notificationId;
        this.recipient = recipient;
        this.message = message;
    }

    public abstract void send(String message);

    public void logNotification() {
        System.out.println("Notification Logged : "
                + notificationId);
    }
}