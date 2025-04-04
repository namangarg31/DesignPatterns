package states.impl;

import inventory.Product;
import states.State;
import vendingMachine.VendingMachine;

public class CoinInsertedState implements State {
    VendingMachine vendingMachine;

    public CoinInsertedState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin(double amount) {
        vendingMachine.setAmount(amount + vendingMachine.getAmount());
    }

    @Override
    public void pressButton(int number) {
        Product product = vendingMachine.getInventory().getProduct(number);
        if(product.getPrice() > vendingMachine.getAmount()) {
            throw new IllegalStateException("Money inserted is less than price of the product");
        }
        vendingMachine.setVendingMachineCurrState(vendingMachine.getDispenseState());
    }

    @Override
    public void dispense(int number) {
        throw new IllegalStateException("Product not selected yet");
    }
}
