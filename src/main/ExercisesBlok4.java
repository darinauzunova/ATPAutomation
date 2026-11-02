package main;

public class ExercisesBlok4 {
    public static void main(String[] args) {
        //Swap two integers if the first is greater
        int a = 15;
        int b = 10;

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //Find the sign of the product of three numbers
        double aa = -5;
        double bb = 10;
        double cc = -3;

        if (aa == 0 || bb == 0 || cc == 0) {
            System.out.println("0");
        } else if (aa < 0 && bb < 0 && cc < 0) {
            System.out.println("Negative");
        } else if (aa < 0 && bb > 0 && cc > 0) {
            System.out.println("Negative");
        } else if (aa > 0 && bb < 0 && cc > 0) {
            System.out.println("Negative");
        } else if (aa > 0 && bb > 0 && cc < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Positive");
        }

        //Print day of the week using switch
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }

        //Find the largest of three integers using nested if
        int aaa = 15;
        int bbb = 30;
        int ccc = 20;

        int largest;

        if (aaa >= bbb) {
            if (aaa >= ccc) {
                largest = aaa;
            } else {
                largest = ccc;
            }
        } else {
            if (bbb >= ccc) {
                largest = bbb;
            } else {
                largest = ccc;
            }
        }

        System.out.println("\nLargest number: " + largest);

        //Convert score to grade
        int score = -3;

        if (score < 0 || score > 100) {
            System.out.println("\nInvalid score");
        } else if (score >= 90) {
            System.out.println("\nA");
        } else if (score >= 80) {
            System.out.println("\nB");
        } else if (score >= 70) {
            System.out.println("\nC");
        } else if (score >= 60) {
            System.out.println("\nD");
        } else {
            System.out.println("\nF");
        }

        //Even or odd using ternary operator
        int number = 66;

        String result = (number % 2 == 0) ? "\nEven" : "\nOdd";

        System.out.println(result);

        //Arrow switch — Weekend or Weekday
        int dayN = 6;

        switch (dayN) {
            case 1, 2, 3, 4, 5 -> System.out.println("\nWeekday");
            case 6, 7 -> System.out.println("\nWeekend");
            default -> System.out.println("\nInvalid day");
        }

        //Compare page title
        String expectedTitle = "Login Page";
        String actualTitle = "Home Page";

        if (expectedTitle.equals(actualTitle)) {
            System.out.println("\nPASS");
        } else {
            System.out.println("\nFAIL");
            System.out.println("Expected: " + expectedTitle);
            System.out.println("Actual: " + actualTitle);
        }
    }
}
