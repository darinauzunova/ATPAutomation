package Block7.ex1;

public class Person implements Comparable<Person> {

    private static int nextId = 1;

    private final int id;
    private String name;
    private int age;

    public Person(String name, int age) {
        this.id = nextId++;
        this.name = name;
        setAge(age);
    }

    void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative!");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Person ID: " + id +
                ", Name: " + name +
                ", Age: " + age;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.id, other.id);
    }
}
