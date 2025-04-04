package states;

/* 3 Different states - CoinInsertedState -> DispenseState -> NoCoinInsertedState */
public interface State {
    void insertCoin(double amount);
    void pressButton(int number);
    void dispense(int number);
}
