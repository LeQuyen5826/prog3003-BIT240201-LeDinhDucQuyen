package app;

import service.MessageService;

public class Notification {
    
    private MessageService messageService;
    
    public Notification() {
    }
    
   
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }
    
    public void sendNotification(String message) {
        if (messageService == null) {
            throw new IllegalStateException("MessageService is not set");
        }
        messageService.sendMessage(message);
    }
}
