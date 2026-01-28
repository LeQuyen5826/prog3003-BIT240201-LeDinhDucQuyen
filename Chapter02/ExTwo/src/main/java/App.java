import creator.NotificationCreator;
import creator.SMSCreator;
import creator.EmailCreator;
import creator.PushCreator;

public class App {
    public static void main(String[] args) {
        
        NotificationCreator smsCreator = new SMSCreator();
        smsCreator.sendNotification();
        
        NotificationCreator emailCreator = new EmailCreator();
        emailCreator.sendNotification();
        
        NotificationCreator pushCreator = new PushCreator();
        pushCreator.sendNotification();
        
    }
}