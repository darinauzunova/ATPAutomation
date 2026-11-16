package Block7.ex1;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Ivan", 25);
        Person person2 = new Person("Spaska", 30);
        Child child1 = new Child("Sasho", 15);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(child1);

        System.out.println("Same ID: " +
                (person1.compareTo(person2) == 0));
    }
}
