package patters;

public class Pattern11 {
    public static void main(String[] args) {

        int t;

        for (int i = 1; i <= 5; i++) {
            // your logic: start value depends on row number
            t = i % 2;

            for (int j = 1; j <= i; j++) {
                System.out.print(t + " ");

                // toggle between 0 and 1
                if (t == 1) {
                    t = 0;
                } else {
                    t = 1;
                }
            }

            System.out.println();
        }
    }
}

