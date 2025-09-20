package patters;

public class Pattern14 {
    public static void main(String[] args) {
        for (int j = 1; j <= 5; j++) {
            char s = 'A';
            for (int k = 1; k <= j; k++) {
                System.out.print(s);
                s++;
            }
            System.out.println();
        }
    }
}

