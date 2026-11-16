package Block7.ex3;

public abstract class Animal implements SoundProducible {
    private String name;
    private int age;
    private String gender;

    public Animal(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "\n"
                + name + " " + age + " " + gender + "\n"
                + produceSound();
    }
}
