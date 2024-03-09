package AdderSubtractor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String [] args) throws Exception {


        ExecutorService es = Executors.newFixedThreadPool(10);
        Value v = new Value();

        Adder adder = new Adder(v);
        Future<Void> f1 = es.submit(adder);
        System.out.println("After Adding: " + v.i);

        Subtractor sub = new Subtractor(v);
        Future<Void> f2 = es.submit(sub);
        System.out.println("After Subtracting: " + v.i);

        f1.get();
        f2.get();

        // The expected value is 0, but because of large loop values, we get different values
        // This shows the problems in threads and the need for synchronization
        System.out.println("Final Value: " + v.i);

    }
}
