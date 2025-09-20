package patters;

public class Pattern8 {
    public static void main(String[] args) {
        int row = 5;

        // Outer loop for rows
        for (int i = 0; i < row; i++) {

            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = i; k < 2 * row - 1 - i; k++) {
                System.out.print("*");
            }

            // Move to next line
            System.out.println();
        }
    }
}


