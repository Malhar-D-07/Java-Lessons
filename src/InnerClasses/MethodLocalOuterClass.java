package InnerClasses;

public class MethodLocalOuterClass {

    public void innerClassMethod() {
        String name = "Malhar";

        class MethodLocalInnerClass {
            void display() {
                System.out.println("Name from MethodLocalClass = "+ name);
            }
        }
        MethodLocalInnerClass inner = new MethodLocalInnerClass();
        inner.display();
    }
}
