package notification;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {

    private List<Notification> channels;

    public NotificationService() {
        channels = new ArrayList<>();
    }

    public void register(Notification notification) {
        channels.add(notification);
    }

    public void notifyAllChannels(String message) {

        for (Notification notification : channels) {
            notification.send(message);
        }
    }
}