package vendingMachine;

import inventory.Inventory;
import inventory.Product;
import states.impl.CoinInsertedState;
import states.impl.DispenseState;
import states.impl.NoCoinInsertedState;
import states.State;

public class VendingMachine {
    private CoinInsertedState coinInsertedState;
    private DispenseState dispenseState;
    private NoCoinInsertedState noCoinInsertedState;
    private State vendingMachineCurrState;
    private Inventory inventory;
    private double amount;
    private static final int ITEMS_COUNT = 5;
    public VendingMachine() {
        coinInsertedState = new CoinInsertedState(this);
        dispenseState = new DispenseState(this);
        noCoinInsertedState = new NoCoinInsertedState(this);
        vendingMachineCurrState = noCoinInsertedState;
        amount = 0;
        inventory = new Inventory(ITEMS_COUNT);
    }
    public CoinInsertedState getCoinInsertedState() {
        return coinInsertedState;
    }

    public void setCoinInsertedState(CoinInsertedState coinInsertedState) {
        this.coinInsertedState = coinInsertedState;
    }

    public DispenseState getDispenseState() {
        return dispenseState;
    }

    public void setDispenseState(DispenseState dispenseState) {
        this.dispenseState = dispenseState;
    }

    public NoCoinInsertedState getNoCoinInsertedState() {
        return noCoinInsertedState;
    }

    public void setNoCoinInsertedState(NoCoinInsertedState noCoinInsertedState) {
        this.noCoinInsertedState = noCoinInsertedState;
    }

    public State getVendingMachineCurrState() {
        return vendingMachineCurrState;
    }

    public void setVendingMachineCurrState(State vendingMachineCurrState) {
        this.vendingMachineCurrState = vendingMachineCurrState;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean hasSufficientAmount(double expectedAmount) {
        return expectedAmount <= this.amount;
    }

    public void insertCoin(double amount) {
        this.vendingMachineCurrState.insertCoin(amount);
        System.out.println(amount + " is inserted.....");
    }

    public void pressButton(int choice) {
        this.vendingMachineCurrState.pressButton(choice);
        this.vendingMachineCurrState.dispense(choice);
    }

    public void addProduct(Product product) {
        this.inventory.addProduct(product);
    }
}
