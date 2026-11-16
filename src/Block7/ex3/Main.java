package Block7.ex3;

public class Main {

    public static void main(String[] args) {

        Animal[] animals = {
                new Dog("Rex", 5, "Male"),
                new Frog("Froggy", 2, "Female"),
                new Cat("Luna", 3, "Female"),
                new Kitten("Mimi", 1),
                new Tomcat("Tom", 4)
        };

        for (Animal animal : animals) {
            System.out.println(animal);
            System.out.println();
        }
    }
}
