import impl.EagerInitialization;
import impl.LazyInitialization;

public class Main {
    public static void main(String[] args) {

        EagerInitialization eagerInitialization = EagerInitialization.getInstance();
        System.out.println(eagerInitialization);
        LazyInitialization lazyInitialization = LazyInitialization.getInstance();
        System.out.println(lazyInitialization);
    }
}