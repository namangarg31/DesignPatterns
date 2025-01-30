package impl;

public class LazyInitialization {
    private static LazyInitialization lazyInitialization;
    private LazyInitialization() {}

    @Override
    public String toString() {
        return "LazyInitialization";
    }
    public static LazyInitialization getInstance() {
        if(lazyInitialization == null) {
            lazyInitialization = new LazyInitialization();
        }
        return lazyInitialization;
    }
}
