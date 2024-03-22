package Demo;

public class Dog implements Animal{

    @Override
    public String name() {
        String name = "Animals name is Dog";
        return name;
    }


    @Override
    public void breathing() {
        System.out.println("Dog is breathing");
    }

    public void bark() {
        System.out.println("Dog is barking bhouu bhouu....");
    }
}
