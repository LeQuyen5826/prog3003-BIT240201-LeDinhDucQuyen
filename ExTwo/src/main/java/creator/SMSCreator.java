package creator;

import notification.Notification;
import notification.SMSNotification;

public class SMSCreator extends NotificationCreator {
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}