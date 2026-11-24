package block8.Homework8.printer;

import block8.Homework8.model.TestCase;

public class DetailedPrinter extends ResultPrinter {
    @Override
    public String format(TestCase testCase) {
        return "ID: " + testCase.getId() +
                ", Title: " + testCase.getTitle() +
                ", Status: " + testCase.getStatus();
    }
}
