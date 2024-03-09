package AdderSubtractor;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {
    private Value v;
    Lock lock;
    Subtractor(Value value, Lock l) {
        this.v = value;
        this.lock = l;
    }
    @Override
    public Void call() throws Exception {
        for (int i = 0; i < 100000; i++) {
            // We lock only those resources which are critical
            lock.lock();
            this.v.i -= 1;
            lock.unlock();
        }
        return null;
    }
}
