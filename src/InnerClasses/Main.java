package InnerClasses;

public class Main {
    public static void main(String[] args) {
        NestedOuterClass.NestedInnerClass inner = new NestedOuterClass(2, "Malhar").new NestedInnerClass("Deshpande");
        inner.display();
        inner.displayValues();
        inner.innerDisplaySum(10, 20);

        System.out.println("-------------");
        // Method Local Inner class
        MethodLocalOuterClass m = new MethodLocalOuterClass();
        m.innerClassMethod();

        System.out.println("-------------");
        // Static inner class
        StaticNestedClass.Inner.display();
    }
}
