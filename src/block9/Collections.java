package block9;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    //ex1
    public static void exercise1() {
        List<String> testCases = new ArrayList<>();

        testCases.add("Login");
        testCases.add("Logout");
        testCases.add("Registration");
        testCases.add("Reset password");
        testCases.add("Search");

        testCases.add("Checkout");
        testCases.remove("Search");

        System.out.println(testCases);
        System.out.println("Size: " + testCases.size());
        System.out.println("Contains Logout: " + testCases.contains("Logout"));
        System.out.println();
    }

    //ex2
    public static void exercise2() {
        List<String> statuses = Arrays.asList(
                "PASSED", "FAILED", "PASSED", "SKIPPED", "PASSED"
        );

        Map<String, Integer> statusCount = new HashMap<>();

        for (String status : statuses) {
            if (statusCount.containsKey(status)) {
                statusCount.put(status, statusCount.get(status) + 1);
            } else {
                statusCount.put(status, 1);
            }
        }

        System.out.println(statusCount);
        System.out.println();

    }

    public static void exercise3() {
        Map<String, String> users = new TreeMap<>();

        users.put("Tester", "tester@test.com");
        users.put("Admin", "admin@test.com");
        users.put("Developer", "developer@test.com");
        users.put("Manager", "manager@test.com");
        users.put("Guest", "guest@test.com");

        for (String role : users.keySet()) {
            System.out.println(role + ": " + users.get(role));
        }

        System.out.println();
    }

    //ex4
    public static void exercise4() {
        List<Integer> requestIds = Arrays.asList(
                101, 101, 102, 101, 104, 102, 105
        );

        Set<Integer> uniqueIds = new HashSet<>(requestIds);

        int duplicates = requestIds.size() - uniqueIds.size();

        System.out.println("Unique IDs: " + uniqueIds);
        System.out.println("Duplicates: " + duplicates);
    }
}
