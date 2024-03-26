package DesignPatterns;

public class Singleton {
    private static Singleton instance = null;
    private Singleton() {
    }

    // This code is not thread safe. Suppose 2 threads access if condition of getInstance method at same instance
    // then 2 instances will be created.

//    public static Singleton getInstance() {
//        if(instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }

    // One way to make it thread safe is to make it synchronised
    // Now, if this method would have 1000 lines, then making it synchronized would make the method slow
    public static synchronized Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
