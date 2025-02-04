package observable;

import observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservableImpl implements StocksObservable{

    List<NotificationAlertObserver> observers = new ArrayList<>();
    int count = 0;
    @Override
    public void add(NotificationAlertObserver notificationAlertObserver) {
        observers.add(notificationAlertObserver);
    }

    @Override
    public void remove(NotificationAlertObserver notificationAlertObserver) {
        observers.remove(notificationAlertObserver);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver observer : observers) {
            observer.update();
        }
    }

    @Override
    public void set(int newStock) {
        if(count == 0) {
            notifySubscribers();
        }
        count += newStock;
    }

    @Override
    public int getStockCount() {
        return count;
    }
}
