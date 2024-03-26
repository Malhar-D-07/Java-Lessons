package DesignPatterns;

public class Singleton {
    private static Singleton instance = null;
    private Singleton() {
    }

    // This code is not thread safe. Suppose 2 threads access if condition of getInstance method at same instance
    // then 2 instances will be created.
    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
