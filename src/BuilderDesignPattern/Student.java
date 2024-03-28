package BuilderDesignPattern;

public class Student {
    int id;
    String name;
    double psp;
    int gradYear;

    private Student(StudentBuilder builder) {
        this.id = builder.getId();
        this.name = builder.getName();
        this.psp = builder.getPsp();
        this.gradYear = builder.getGradYear();
    }

    // NOTE: We are returning an instance of STATIC CLASS
    // You can create instances of nested classes (even static nested classes) as long as you have a reference to an outer class instance
    // or use a static method like getInstance() in this case
    public static StudentBuilder getInstance() {
        return new StudentBuilder();
    }


    // NOTE: StudentBuilder is made static
    static class StudentBuilder {
        int id;
        String name;
        double psp;
        int gradYear;

        public int getId() {
            return id;
        }

        public StudentBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public String getName() {
            return name;
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public StudentBuilder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public StudentBuilder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        // The build method returns the Student object
        public Student build() {
            if (this.psp > 100) {
                throw new RuntimeException();
            }
            return new Student(this);
        }
    }
}