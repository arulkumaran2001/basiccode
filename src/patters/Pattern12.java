package patters;

public class Pattern12 {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 1; i <= n; i++) {

            // Left side numbers (1 to i)
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Middle spaces
            for (int j = 2 * i - 2; j < 2 * n - 2; j++) {
                System.out.print(" ");
            }

            // Right side numbers (i down to 1)
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }

            // Move to next line
            System.out.println();
        }
    }
}

