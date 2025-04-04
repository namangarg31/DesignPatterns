package inventory;

import java.util.HashMap;
import java.util.Map;

public class Inventory {

    private final Map<Integer, Product> numberToProduct;
    private final Map<Integer, Integer> numberToCount;
    int supportedChoices;
    int leftChoices;
    public Inventory(int numberOfChoices) {
        supportedChoices = numberOfChoices;
        leftChoices = numberOfChoices;
        numberToProduct = new HashMap<>();
        numberToCount = new HashMap<>();
    }
    public void addProduct(Product product) {
        if(numberToProduct.containsKey(product.getId())) {
            int presentFreq = numberToCount.get(product.getId());
            numberToCount.put(product.getId(), presentFreq + 1);
        }
        else {
            if(leftChoices == 0) {
                throw new IllegalStateException("You can't add more than the number of supported choices");
            }
            else {
                leftChoices--;
                numberToProduct.put(product.getId(), product);
                numberToCount.put(product.getId(), 1);
            }
        }
    }
    public void removeProduct(Product product) {
        int freq = numberToCount.get(product.getId());
        if(freq == 1) {
            leftChoices++;
            numberToProduct.remove(product.getId());
            numberToCount.remove(product.getId());
        }
        else numberToCount.put(product.getId(), freq - 1);
    }
    public Product getProduct(int number) {
        if(isAvailable(number)) return numberToProduct.get(number);
        else throw new IllegalStateException("No such product exist with entered id");
    }

    public boolean isAvailable(int number) {
        return numberToProduct.containsKey(number);
    }
}
