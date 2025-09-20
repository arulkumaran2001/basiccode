package patters;

public class Pattern16 {
    public static void main(String[] args) {
        char s = 'A';

        for (int j = 1; j <= 5; j++) {

            for (int k = 1; k <= j; k++) {
                System.out.print(s);
            }

            System.out.println();
            s++;
        }
    }
}

