package notification;

public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Gửi Email: Email thông báo đã được gửi!");
    }
}