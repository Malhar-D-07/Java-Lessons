package AdderSubtractor;

public class Main {
    public static void main(String [] args) throws Exception {

        Value v = new Value();

        Adder adder = new Adder(v);
        adder.call();
        System.out.println("After Adding: " + v.i);

        Subtractor sub = new Subtractor(v);
        sub.call();
        System.out.println("After Subtracting: " + v.i);

    }
}
