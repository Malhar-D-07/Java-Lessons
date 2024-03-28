package InnerClasses;

public class Main {
    public static void main(String[] args) {
        // Inner classes are used for code Encapsulation and Code Organization.
        // Also used for Callbacks in event-driven programming
        NestedOuterClass.NestedInnerClass inner = new NestedOuterClass(2, "Malhar").new NestedInnerClass("Deshpande");
        inner.display();
        inner.displayValues();
        inner.innerDisplaySum(10, 20);

        // Creating Inner class object from outer class
        NestedOuterClass outer = new NestedOuterClass();
        outer.createInnerClass();

        System.out.println("-------------");
        // Method Local Inner class
        MethodLocalOuterClass m = new MethodLocalOuterClass();
        m.innerClassMethod();

        System.out.println("-------------");
        // Static inner class
        StaticNestedClass.Inner.display();
    }
}
