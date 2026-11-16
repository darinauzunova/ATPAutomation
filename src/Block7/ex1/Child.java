package Block7.ex1;

public class Child extends Person {
    public Child(String name, int id) {
        super(name, id);
    }

    @Override
    public void setAge(int age) {
        if (age > 15) {
            throw new IllegalArgumentException("Child cannot be older than 15!");
        }
        super.setAge(age);
    }

    @Override
    public String toString() {
        return "Child - " + super.toString();
    }
}
