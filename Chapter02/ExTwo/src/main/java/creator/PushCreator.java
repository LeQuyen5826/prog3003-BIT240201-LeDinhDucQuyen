package creator;

import notification.Notification;
import notification.PushNotification;

public class PushCreator extends NotificationCreator {
    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}