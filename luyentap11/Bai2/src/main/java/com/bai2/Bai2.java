
package com.bai2;

interface MessageService {
    void sendMessage(String message);
}

class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("[EMAIL] Gửi: " + message);
    }
}

class SMSService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("[SMS]   Gửi: " + message);
    }
}

class Notification {
    private MessageService messageService; // dependency

    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void send(String message) {
        if (messageService == null) {
            System.out.println("Chưa thiết lập dịch vụ gửi tin!");
            return;
        }
        messageService.sendMessage(message);
    }
}

public class Bai2 {
    public static void main(String[] args) {
        Notification notification = new Notification();

        notification.setMessageService(new EmailService());
        notification.send("Chào mừng bạn đến với hệ thống!");

        notification.setMessageService(new SMSService());
        notification.send("Mã OTP của bạn là: 123456");
    }
}

