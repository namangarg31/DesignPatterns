package observer;

import observable.StocksObservable;

public class EmailNotificationAlertObserverImpl implements NotificationAlertObserver{

    String email;
    StocksObservable stocksObservable;

    public EmailNotificationAlertObserverImpl(String email, StocksObservable stocksObservable) {
        this.email = email;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update() {
        sendMail(email);
    }

    private void sendMail(String email) {
        System.out.println("Sending mail to : " + email);
    }
}
