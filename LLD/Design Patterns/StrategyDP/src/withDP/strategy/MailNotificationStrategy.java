package withDP.strategy;

public class MailNotificationStrategy implements NotificationStrategy {
    @Override
    public void sendNotification() {
        System.out.println("Sending notification through mail");
    }
}
