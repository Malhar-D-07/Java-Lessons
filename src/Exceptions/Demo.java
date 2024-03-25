package Exceptions;

public class Demo {

    public int doSomething(int a, int b) throws NumberNotAllowedException {
        if(b == 0) {
            throw new NumberNotAllowedException();
        }
        return a/b;
    }

    public void findByRollNo(int rollNo) throws ClassCastException {
        if(rollNo < 0) {
            throw new ClassCastException();
        }
    }
}
