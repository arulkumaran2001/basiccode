package patters;

public class Pattern17 {
    public static void main(String[] args) {
        int n = 4;

        for (int j = 1; j <= n; j++) {
            char s = 'A';

            // Print leading spaces
            for (int k = n; k > j; k--) {
                System.out.print(" ");
            }

            // Increasing part
            for (int i = 1; i <= j; i++) {
                System.out.print(s);
                s++;
            }

            // Adjust s back (it went 1 step ahead)
            s -= 2;

            // Decreasing part
            for (int i = 1; i < j; i++) {
                System.out.print(s);
                s--;
            }

            // New line
            System.out.println();
        }
    }
}

