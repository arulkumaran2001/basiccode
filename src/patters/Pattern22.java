package patters;

public class Pattern22 {

    public static void main(String[] args) {

        int a = 4;
        int n = 2 * a - 1;

        for (int i = 1; i <= n; i++) {

            System.out.print(n + " "); // print first column

            for (int j = 2; j < n; j++) {

                if (i == 1 || i == n) {
                    System.out.print(n + " ");
                } else if (i == 2 || i == n - 1 || j == 2 || j == n - 1) {
                    System.out.print((n - 1) + " ");
                } else if (i == 3 || i == n - 2 || j == 3 || j == n - 2) {
                    System.out.print((n - 2) + " ");
                } else if (i == 4 || i == n - 3 || j == 4 || j == n - 3) {
                    System.out.print((n - 3) + " ");
                }

            }

            System.out.println(n); // print last column and move to next row
        }

    }

}

