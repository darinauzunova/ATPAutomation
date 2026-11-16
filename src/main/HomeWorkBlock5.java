package main;

import java.util.Arrays;

public class HomeWorkBlock5 {
    public static void main(String[] args) {

        int[] numbers = {4, 8, 15, 16, 23, 42};

        System.out.println("Sum: " + sum(numbers));
        System.out.println("Average: " + average(numbers));
        System.out.println("Max: " + findMax(numbers));
        System.out.println("Reversed: " + Arrays.toString(reverse(numbers)));

        System.out.println("level: " + isPalindrome("level"));
        System.out.println("test: " + isPalindrome("test"));
    }

    public static int sum(int[] numbers) {
        int total = 0;

        for (int number : numbers) {
            total += number;
        }

        return total;
    }

    public static double average(int[] numbers) {
        return (double) sum(numbers) / numbers.length;
    }

    public static int findMax(int[] numbers) {
        int max = numbers[0];

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        return max;
    }

    public static int[] reverse(int[] numbers) {
        int[] reversed = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            reversed[i] = numbers[numbers.length - 1 - i];
        }

        return reversed;
    }

    public static boolean isPalindrome(String text) {
        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
