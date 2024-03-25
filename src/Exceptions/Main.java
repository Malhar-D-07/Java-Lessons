package Exceptions;

public class Main {
    public static void main(String[] args) throws Exception {
        Demo d = new Demo();
        d.doSomething(2,0);

        // No exception raised
        d.findByRollNo(0);

//        d.findByRollNo(-1);
//        Errors are not supposed to be catched. Please refer notion for more on this
    }
}
