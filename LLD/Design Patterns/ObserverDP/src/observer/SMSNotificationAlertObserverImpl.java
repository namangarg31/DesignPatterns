package observer;

import observable.StocksObservable;

public class SMSNotificationAlertObserverImpl implements NotificationAlertObserver{

    String number;
    StocksObservable stocksObservable;

    public SMSNotificationAlertObserverImpl(String number, StocksObservable stocksObservable) {
        this.number = number;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update() {
        sendSMS();
    }

    private void sendSMS() {
        System.out.println("Sending sms to : " + number);
    }
}
