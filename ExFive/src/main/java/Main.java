import service.MessageService;
import service.EmailService;
import service.SmsService;
import app.Notification;
public class Main {
    public static void main(String[] args) {
        
        // Tạo Notification
        Notification notification = new Notification();
        
        // Nội dung thông báo ví dụ
        String alert = "Hệ thống phát hiện hoạt động đáng ngờ. Vui lòng kiểm tra tài khoản!";
        
        System.out.println("=== DEMO EMAIL SERVICE ===");
        MessageService email = new EmailService();
        notification.setMessageService(email);
        notification.sendNotification(alert);
        
        System.out.println("\n=== DEMO SMS SERVICE ===");
        MessageService sms = new SmsService();
        notification.setMessageService(sms);
        notification.sendNotification(alert);
        
        System.out.println("\n=== THỬ TRƯỜNG HỢP CHƯA SET ===");
        Notification noService = new Notification();
        try {
            noService.sendNotification("Test");
        } catch (IllegalStateException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}