package AdderSubtractor;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {

    private Value v;

    Adder(Value value) {
        this.v = value;
    }
    @Override
    public Void call() throws Exception {
        for (int i = 0; i < 100; i++) {
            this.v.i += 1;
        }
        return null;
    }
}
