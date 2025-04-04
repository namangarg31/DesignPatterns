package states.impl;

import inventory.Product;
import states.State;
import vendingMachine.VendingMachine;

public class DispenseState implements State {

    VendingMachine vendingMachine;
    public DispenseState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }
    @Override
    public void insertCoin(double amount) {
        throw new IllegalStateException("Product is getting dispensed");
    }

    @Override
    public void pressButton(int number) {
        throw new IllegalStateException("Product is getting dispensed");
    }

    @Override
    public void dispense(int number) {
        Product product = vendingMachine.getInventory().getProduct(number);
        vendingMachine.getInventory().removeProduct(product);
        double change  = vendingMachine.getAmount() - product.getPrice();
        vendingMachine.setAmount(0);
        System.out.println("Dispensing "+product.getName()+".....");
        if(change > 0) {
            System.out.println("Giving back the change of : Rs." + change);
        }
        vendingMachine.setVendingMachineCurrState(vendingMachine.getNoCoinInsertedState());
    }
}
