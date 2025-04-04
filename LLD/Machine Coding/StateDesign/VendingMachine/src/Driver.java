import inventory.Product;
import vendingMachine.VendingMachine;

public class Driver {
    public static void main(String[] args) {
        try {
            VendingMachine vendingMachine = new VendingMachine();
            Product chips = new Product("Blue Lays", 1, 20);
            Product chocolate = new Product("Dairy Milk", 2, 10);
            Product biscuit = new Product("Hide and Seek", 3, 30);
            Product coldDrink = new Product("Coca-Cola", 4, 20);
            Product candy = new Product("Choco", 5, 5);
            Product puff = new Product("Egg Puff", 6, 10);
            vendingMachine.addProduct(chips);
            vendingMachine.addProduct(chocolate);
            vendingMachine.addProduct(biscuit);
            vendingMachine.addProduct(coldDrink);
            vendingMachine.addProduct(candy);
            vendingMachine.insertCoin(20);
            vendingMachine.pressButton(1);
            vendingMachine.addProduct(puff);
            vendingMachine.insertCoin(10);
            vendingMachine.pressButton(6);
        } catch (Exception e) {
            System.out.println("ERROR : " + e.getMessage());
        }
    }
}