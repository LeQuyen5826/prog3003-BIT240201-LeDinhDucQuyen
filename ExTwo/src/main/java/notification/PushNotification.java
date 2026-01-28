package notification;

public class PushNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Gửi Push: Thông báo đã được đẩy đến thiết bị!");
    }
}