package PrototypeDesignPattern;

public class IntelligentStudent extends Student{

    int psp;

    IntelligentStudent(){}

    IntelligentStudent(IntelligentStudent is) {
        super(is);
        this.psp = is.psp;
    }

    // In Student class copy is returning Student, but in IntelligentStudent class the copy method
    // is returning IntelligentStudent. We can do this because of the generic return type of copy.
    // If not for Generics, we would have to return the Student in IntelligentStudent class's copy method.
    @Override
    public IntelligentStudent copy() {
        IntelligentStudent is = new IntelligentStudent(this);
        return is;
    }
}
