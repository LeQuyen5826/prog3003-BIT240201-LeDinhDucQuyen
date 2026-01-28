package creator;

import notification.Notification;


public abstract class NotificationCreator {
    
    public abstract Notification createNotification();
    
    public void sendNotification() {
        Notification notification = createNotification();
        notification.notifyUser();
    }
}