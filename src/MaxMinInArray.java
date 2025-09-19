import java.util.ArrayList;
import java.util.Scanner;

public class MaxMinInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter a series of numbers (enter a non-integer to stop):");

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            numbers.add(number);
        }

        if (numbers.isEmpty()) {
            System.out.println("The ArrayList is empty.");
        }
        else {
            int max = numbers.get(0);
            int min = numbers.get(0);

            for (int num : numbers) {
                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
            }
            System.out.println("Numbers entered: " + numbers);
            System.out.println("Maximum element: " + max);
            System.out.println("Minimum element: " + min);
        }
    }
}