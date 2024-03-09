package AdderSubtractor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String [] args) throws Exception {

        ExecutorService es = Executors.newFixedThreadPool(10);
        Value v = new Value();

        Lock lock = new ReentrantLock();
        // We have to provide the same lock to Adder and Subtractor as only 1 key should be able to
        // open the lock.
        Adder adder = new Adder(v, lock);
        Future<Void> f1 = es.submit(adder);
        System.out.println("After Adding: " + v.i);

        Subtractor sub = new Subtractor(v, lock);
        Future<Void> f2 = es.submit(sub);
        System.out.println("After Subtracting: " + v.i);

        f1.get();
        f2.get();
        System.out.println("Final Value: " + v.i);

    }
}
