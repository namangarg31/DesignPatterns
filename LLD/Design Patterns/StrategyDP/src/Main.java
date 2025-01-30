import withDP.service.NotificationService;
import withDP.strategy.MailNotificationStrategy;
import withDP.strategy.SMSNotificationStrategy;

public class Main {
    public static void main(String[] args) {

        NotificationService app1NotificationService = new NotificationService(new MailNotificationStrategy());
        app1NotificationService.sendNotification();
        app1NotificationService.setNotificationStrategy(new SMSNotificationStrategy());
        app1NotificationService.sendNotification();

        NotificationService app2NotificationService = new NotificationService(new SMSNotificationStrategy());
        app2NotificationService.sendNotification();

    }
}