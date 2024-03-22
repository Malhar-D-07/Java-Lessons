package Demo;

public class Demo {
    public static void main(String[] args) {
        Animal a = new Dog();
        System.out.println(a.name());
        a.breathing();
//        a.bark();

        System.out.println("------");

        Dog b = new Dog();
        System.out.println(b.name());
        b.breathing();
        b.bark();
    }
}
