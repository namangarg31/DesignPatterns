package impl;
/**
 * CPU time and memory is also wasted in creation of instance if it is not required.
 * **/
public class EagerInitialization {
    private static final EagerInitialization eagerInitialization = new EagerInitialization();
    private EagerInitialization() {}

    @Override
    public String toString() {
        return "EagerInitialization";
    }
    public static EagerInitialization getInstance() {
        return eagerInitialization;
    }
}
