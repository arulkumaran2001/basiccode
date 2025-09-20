package patters;

public class Pattern21 {

    public static void main(String[] args) {

        int n = 4;

        System.out.print("*"); // starting star
        System.out.println();

        for (int i = 1; i <= n; i++) {
            System.out.print("*"); // start of each row

            for (int j = 2; j < n; j++) {
                if (i == 1 || i == n) {
                    System.out.print("*"); // stars for first and last row
                } else {
                    System.out.print(" "); // spaces for middle rows
                }
            }

            System.out.println("*"); // end of row
        }

    }

}

