package patters;

public class Pattern5 {
    public static void main(String[] args) {
        // Print a simple message
        System.out.println("h");

        // Outer loop for rows
        for (int x = 1; x <= 5; x++) {
            // Inner loop for columns
            for (int i = 5; i >= x; i--) {
                System.out.print("* ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}


