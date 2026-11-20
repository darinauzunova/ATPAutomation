package block8.program;

import block8.enums.Browser;

public class Main {
    public static void main(String[] args) {
        for (Browser browser : Browser.values()) {
            System.out.println(browser);
        }

        for (Browser browser : Browser.values()) {
            System.out.println(getDriverName(browser));
        }

    }

    public static String getDriverName(Browser browser) {
        switch (browser) {
            case FIREFOX -> {
                return "geckodriver";
            }
            case CHROME -> {
                return "chromdriver";
            }
            case EDGE -> {
                return "msedgedriver";
            }
            default -> {
                throw new RuntimeException("Unknown browser name");
            }
        }
    }
}
