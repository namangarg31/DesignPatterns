package states.impl;

import states.State;
import vendingMachine.VendingMachine;

public class NoCoinInsertedState implements State {
    VendingMachine vendingMachine;
    public NoCoinInsertedState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin(double amount) {
        vendingMachine.setVendingMachineCurrState(vendingMachine.getCoinInsertedState());
        vendingMachine.setAmount(amount);
    }

    @Override
    public void pressButton(int number) {
        throw new IllegalStateException("No coin is inserted");
    }

    @Override
    public void dispense(int number) {
        throw new IllegalStateException("No coin is inserted");
    }
}
