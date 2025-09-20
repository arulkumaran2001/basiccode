package patters;

public class Pattern9 {
    public static void main(String[] args) {
        int n = 5;

        // Upper pyramid
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }

            // New line
            System.out.println();
        }

        // Lower inverted pyramid
        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = i; k < 2 * n - 1 - i; k++) {
                System.out.print("*");
            }

            // New line
            System.out.println();
        }
    }
}


