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

    //NOTE: We can also create an inner class object from outer class
    public void createInnerClass() {
        NestedInnerClass inner = new NestedInnerClass("Deshpande");
        System.out.println(inner.getSurname());
    }
    class NestedInnerClass {
        private String surname;

        public String getSurname() {
            return surname;
        }
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
