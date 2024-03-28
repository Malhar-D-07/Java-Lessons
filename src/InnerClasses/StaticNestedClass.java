package InnerClasses;

//Static nested classes are not technically inner classes. They are like a static member of outer class.

public class StaticNestedClass {

    static class Inner {

        private static void outerMethod()
        {
            System.out.println("Inside outerMethod");
        }
        public static void display()
        {
            System.out.println("Inside display of Static inner class");
            outerMethod();
        }
    }
}
