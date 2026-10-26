package main;

public class ExercisesBlok3 {
    public static void main(String[] args) {
        //Ex1
        int number1 = 51240;
        byte number2 = -113;
        int number3 = 4735941;
        byte number4 = 87;
        short number5 = -20000;

        //Ex2
        boolean isFemale = true;

        //Ex3
        String firstWord = "Hello";
        String secondWord = "World";

        Object combinedWords = firstWord + " " + secondWord;

        String result = (String) combinedWords;

        System.out.println("/Task3:");
        System.out.println(result);

        //Ex1 Employee imformation
        String firstName = "Ivan";
        String lastName = "Ivanov";
        byte age = 25;
        char gender = 'm';
        String idNumber = "1234567890";
        int employeeNumber = 38560001;

        //Ex2 Exchange numbers
        int firstNumber = 5;
        int secondNumber = 10;

        int temp = firstNumber;

        firstNumber = secondNumber;
        secondNumber = temp;

        System.out.println("\n/Task: Exchange numbers");
        System.out.println("First number: " + firstNumber);
        System.out.println("Second number: " + secondNumber);
    }
}
