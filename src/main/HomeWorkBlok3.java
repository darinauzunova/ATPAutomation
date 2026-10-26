package main;

public class HomeWorkBlok3 {
    public static void main(String[] args) {

        //task 1: Celsius to Fahrenheit
        int celsius1 = 0;
        int celsius2 = 37;
        int celsius3 = 100;

        double fahrenheit1 = celsius1 * 9.0 / 5 + 32;
        double fahrenheit2 = celsius2 * 9.0 / 5 + 32;
        double fahrenheit3 = celsius3 * 9.0 / 5 + 32;

        System.out.println("Task 1:");
        System.out.println("0°C = " + fahrenheit1 + "°F");
        System.out.println("37°C = " + fahrenheit2 + "°F");
        System.out.println("100°C = " + fahrenheit3 + "°F");

        //task2: Sum of digits
        int number = 472;

        int firstDigit = number / 100;
        int secondDigit = (number / 10) % 10;
        int thirdDigit = number % 10;

        int sum = firstDigit + secondDigit + thirdDigit;

        System.out.println("\nTask 2:");
        System.out.println("Sum of digits: " + sum);

        //task3: check if number is even
        int checkNumber = 8;

        boolean isEven = checkNumber % 2 == 0;

        System.out.println("\nTask 3:");
        System.out.println("Is the number even? " + isEven);

        //тask4: Swap values without a third variable
        int a = 5;
        int b = 10;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("\nTask 4:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //task rectangle area
        double width = 5.5;
        double height = 10;

        double area = width * height;

        System.out.println("\nRectangle area: " + area);

        //task prime number
        int n = 37;

        boolean isPrime = (n == 2 || n == 3 || n == 5 || n == 7)
                || (n > 1
                && n % 2 != 0
                && n % 3 != 0
                && n % 5 != 0
                && n % 7 != 0);

        System.out.println("\nIs " + n + " prime? " + isPrime);

        //task Trapezoid Area
        double aa = 8;
        double bb = 12;
        double h = 5;

        double areaa = (aa + bb) * h / 2;

        System.out.println("\nTrapezoid area: " + areaa);
    }
}
