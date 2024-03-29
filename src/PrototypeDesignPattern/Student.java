package PrototypeDesignPattern;

public class Student implements Prototype<Student> {
    int age;
    String batchName;
    String name;
    private String hometown;

    public String getHometown() {
        return this.hometown;
    }

    public void setHometown(String ht) {
        this.hometown = ht;
    }

    Student(){}

    // If We can have some private properties, still the new object will have that properties
    Student(Student s) {
        this.age = s.age;
        this.batchName = s.batchName;
        this.name = new StringBuilder(s.name).toString();
        this.hometown = new StringBuilder(s.getHometown()).toString();
    }
    @Override
    public Student copy() {
        Student s = new Student(this);
        return s;
    }
}
