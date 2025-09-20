package patters;

public class Pattern19 {

    public static void main(String[] args) {

        int n = 5;

        // Top part
        for (int i = 1; i <= n; i++) {

            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }

            for (int j = 2 * i - 1; j > 1; j--) {
                System.out.print(" ");
            }

            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Bottom part
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (int j = 2 * i - 1; j < 9; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}

