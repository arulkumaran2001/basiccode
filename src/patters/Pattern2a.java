package patters;

public class Pattern2a {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int k = n - i; k > 0; k--) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }

            // Move to next line
            System.out.println();
        }
    }
}

