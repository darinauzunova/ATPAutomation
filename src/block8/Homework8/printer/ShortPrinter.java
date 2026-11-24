package block8.Homework8.printer;

import block8.Homework8.model.TestCase;

public class ShortPrinter extends ResultPrinter {
    @Override
    public String format(TestCase testCase) {
        return "#" + testCase.getId() +
                " [" + testCase.getStatus() + "]";
    }
}
