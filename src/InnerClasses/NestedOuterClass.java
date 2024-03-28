package InnerClasses;

public class NestedOuterClass {
    private int id;
    private String name;

    NestedOuterClass() {}
    NestedOuterClass(int i, String n) {
        this.id = i;
        this.name = n;
    }

    private void displaySum(int a, int b) {
        int res = a + b;
        System.out.println("Sum = " + res);
    }

    class NestedInnerClass {
        private String surname;
        NestedInnerClass(String sName) {
            this.surname = sName;
        }

        void display() {
            System.out.println("Inside display of NestedInnerClass");
        }

        void displayValues() {
            System.out.println("Inside displayValues => " + "id: " + id + " name: " + name + " surname: " + surname);
        }

        void innerDisplaySum(int n1, int n2) {
            displaySum(n1, n2);
        }
    }
}
