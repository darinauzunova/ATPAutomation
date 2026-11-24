package block8.Homework8.app;

import block8.Homework8.model.TestCase;
import block8.Homework8.model.TestStatus;
import block8.Homework8.printer.DetailedPrinter;
import block8.Homework8.printer.ResultPrinter;
import block8.Homework8.printer.ShortPrinter;

public class Main {
    public static void main(String[] args) {

        TestCase test1 = new TestCase(1, "Valid login");
        TestCase test2 = new TestCase(2, "Invalid password");
        TestCase test3 = new TestCase(3, "Logout");
        TestCase test4 = new TestCase(4, "Registration");
        TestCase test5 = new TestCase(5, "Reset password");

        test1.setStatus(TestStatus.PASSED);
        test2.setStatus(TestStatus.FAILED);
        test3.setStatus(TestStatus.SKIPPED);
        test4.setStatus(TestStatus.PASSED);
        test5.setStatus(TestStatus.FAILED);

        TestCase[] testCases = {
                test1, test2, test3, test4, test5
        };

        ResultPrinter[] printers = {
                new DetailedPrinter(),
                new ShortPrinter()
        };

        for (ResultPrinter printer : printers) {
            System.out.println(printer.getClass().getSimpleName());

            for (TestCase testCase : testCases) {
                System.out.println(printer.format(testCase));
            }

            System.out.println();
        }

        int passed = 0;
        int failed = 0;
        int skipped = 0;
        int notRun = 0;

        for (TestCase testCase : testCases) {
            switch (testCase.getStatus()) {
                case PASSED:
                    passed++;
                    break;
                case FAILED:
                    failed++;
                    break;
                case SKIPPED:
                    skipped++;
                    break;
                case NOT_RUN:
                    notRun++;
                    break;
            }
        }

        System.out.println("Passed: " + passed +
                ", Failed: " + failed +
                ", Skipped: " + skipped +
                ", Not run: " + notRun);
    }
}
