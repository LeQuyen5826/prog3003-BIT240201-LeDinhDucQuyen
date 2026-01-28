package creator;

import notification.Notification;
import notification.EmailNotification;

public class EmailCreator extends NotificationCreator {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}