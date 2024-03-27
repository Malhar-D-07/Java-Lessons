package BuilderDesignPattern;

import Pair.Pair;

public class StudentBuilder {
    int id;
    String name;
    double psp;
    int gradYear;

    public int getId() {
        return id;
    }

    // We are returing StudentBuilder because we can do chaining like setId(1).setName("malhar")....
    // Just like we do it in lambdas.
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

    public Student build() {
        if(this.psp > 100) {
            throw new RuntimeException();
        }
        return new Student(this);
    }
}
