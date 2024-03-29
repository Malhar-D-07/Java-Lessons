package PrototypeDesignPattern;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Malhar";
        s1.batchName = "Morning LLD";
        s1.age = 26;
        s1.setHometown("Akola");

        Student s2 = s1.copy();
        Student s3 = s1.copy();
        Student s4 = s1.copy();
        Student s5 = s1.copy();

        IntelligentStudent i1 = new IntelligentStudent();
        i1.name = "Naruto";
        i1.batchName = "Leaf Hokages";
        i1.age = 25;
        i1.setHometown("Leaf Village");
        i1.psp = 90;

        IntelligentStudent i2 = i1.copy();
        IntelligentStudent i3 = i1.copy();
        IntelligentStudent i4 = i1.copy();
        IntelligentStudent i5 = i1.copy();

        System.out.println("Debug");

    }
}
