import observable.IphoneStockObservableImpl;
import observable.StocksObservable;
import observer.EmailNotificationAlertObserverImpl;
import observer.NotificationAlertObserver;
import observer.SMSNotificationAlertObserverImpl;

public class Stock {
    public static void main(String[] args) {

        StocksObservable stocksObservable = new IphoneStockObservableImpl();
        NotificationAlertObserver ob1 = new SMSNotificationAlertObserverImpl("abc", stocksObservable);
        NotificationAlertObserver ob2 = new EmailNotificationAlertObserverImpl("xyz", stocksObservable);
        stocksObservable.add(ob1);
        stocksObservable.add(ob2);
        stocksObservable.set(10);

    }
}