package patters;

public class Pattern4 {
    public static void main(String[] args) {
        // Print a welcome message
        System.out.println("Hello, World!");

        // Outer loop for rows
        for (int i = 1; i <= 5; i++) {
            // Inner loop for columns
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println(); // Move to the next line
        }
    }
}

