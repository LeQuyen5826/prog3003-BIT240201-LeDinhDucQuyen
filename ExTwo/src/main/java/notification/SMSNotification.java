package notification;

public class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Gửi SMS: Tin nhắn đã được gửi đến số điện thoại!");
    }
}