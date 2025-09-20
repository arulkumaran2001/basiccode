package patters;

public class Pattern15 {
    public static void main(String[] args) {
        for (int j = 5; j >= 1; j--) {
            char s = 'A';
            for (int k = j; k >= 1; k--) {
                System.out.print(s);
                s++;
            }
            System.out.println();
        }
    }
}

