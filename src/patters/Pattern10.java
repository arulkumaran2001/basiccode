package patters;

public class Pattern10 {
    public static void main(String[] args) {
        int n = 5;

        // Upper half
        for (int j = 1; j <= n; j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower half
        for (int j = n - 1; j >= 1; j--) {
            for (int i = 1; i <= j; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


