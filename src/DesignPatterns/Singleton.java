package DesignPatterns;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Singleton {
    private static Singleton instance = null;
    static Lock lock = new ReentrantLock();
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
//    public static synchronized Singleton getInstance() {
//        if(instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }

    // Another way is to find the CRITICAL SECTION and apply lock on it. Here the CRITICAL SECTION is the IF
    // condition block. This code will create lock for every time it is called. If we want to avoid this
    // we can use DOUBLE CHECK SOLUTION
//    public static Singleton getInstance() {
//        lock.lock();
//            if(instance == null) {
//                instance = new Singleton();
//            }
//        lock.unlock();
//        return instance;
//    }

    //  DOUBLE CHECK SOLUTION: This will acquire lock only if instance is null
    public static Singleton getInstance() {
        if(instance == null) {
            lock.lock();
            if(instance == null) {
                instance = new Singleton();
            }
            lock.unlock();
        }
        return instance;
    }
}
