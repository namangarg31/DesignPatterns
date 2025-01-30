package withDP.service;

import withDP.strategy.NotificationStrategy;

public class NotificationService {

    private NotificationStrategy notificationStrategy;
    public NotificationService(NotificationStrategy notificationStrategy) {
        this.notificationStrategy = notificationStrategy;
    }
    public void setNotificationStrategy(NotificationStrategy notificationStrategy) {
        this.notificationStrategy = notificationStrategy;
    }
    public void sendNotification() {
        notificationStrategy.sendNotification();
    }

}
