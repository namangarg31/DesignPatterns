package withDP.strategy;

public class SMSNotificationStrategy implements NotificationStrategy {
    @Override
    public void sendNotification() {
        System.out.println("Sending notification through SMS");
    }
}
