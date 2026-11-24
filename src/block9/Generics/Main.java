package block9.Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Exercise 1
        Pair<String, Integer> test = new Pair<>("Login", 250);

        System.out.println("Test: " + test.getKey());
        System.out.println("Duration: " + test.getValue() + " ms");

        // Exercise 2
        List<String> names = Arrays.asList("Ivan", "Maria", "Alex");
        List<String> emptyList = new ArrayList<>();

        System.out.println(firstOrDefault(names, "Unknown"));
        System.out.println(firstOrDefault(emptyList, "Unknown"));

        // Exercise 3
        List<String> titles = Arrays.asList("Login", "Logout", "Search");
        List<Integer> numbers = Arrays.asList(10, 20, 30);

        printAll(titles);
        printAll(numbers);
    }

    public static <T> T firstOrDefault(List<T> list, T defaultValue) {
        if (list.isEmpty()) {
            return defaultValue;
        }

        return list.getFirst();
    }

    public static <T> void printAll(List<T> items) {
        for (T item : items) {
            System.out.println(item);
        }
    }
}
