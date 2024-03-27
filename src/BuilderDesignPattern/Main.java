package BuilderDesignPattern;

public class Main {
    public static void main(String[] args) {

        // Because of chaining we can use .setId().setPsp().....
        Student s = new StudentBuilder()
                .setId(10)
                .setPsp(10)
                .build();

        System.out.println(s);
    }
}
