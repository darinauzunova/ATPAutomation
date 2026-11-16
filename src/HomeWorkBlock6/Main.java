package HomeWorkBlock6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        TestCase test1 = new TestCase(1, "Login with valid user");
        TestCase test2 = new TestCase(2, "Login with invalid password");
        TestCase test3 = new TestCase(3, "Logout");

        test1.setStatus("PASSED");
        test2.setStatus("FAILED");
        test3.setStatus("SKIPPED");


        Random random = new Random();

        System.out.println(test1.describe() + " - " +
                (random.nextInt(401) + 100) + " ms");

        System.out.println(test2.describe() + " - " +
                (random.nextInt(401) + 100) + " ms");

        System.out.println(test3.describe() + " - " +
                (random.nextInt(401) + 100) + " ms");

        System.out.println("Total test cases: " + TestCase.getCount());
    }
}
