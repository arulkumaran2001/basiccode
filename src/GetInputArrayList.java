import java.util.ArrayList;
import java.util.Scanner;

class GetInputArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an ArrayList to store integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Prompt the user to enter numbers, and add them to the ArrayList
        System.out.print("Enter a series of numbers (enter a non-integer to stop): ");
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            numbers.add(number);

        }

        // Close the scanner
        scanner.close();

        // Print the ArrayList
        System.out.println("Numbers entered: " + numbers);
    }
}