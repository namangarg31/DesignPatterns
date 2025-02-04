package observable;

import observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public interface StocksObservable {
    void add(NotificationAlertObserver notificationAlertObserver);
    void remove(NotificationAlertObserver notificationAlertObserver);
    void notifySubscribers();
    void set(int newStock);
    int getStockCount();
}
