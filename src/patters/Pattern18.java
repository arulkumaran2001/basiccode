package patters;

public class Pattern18 {
    public static void main(String[] args) {
        char c = 'E';
        for (int i = 1; i <= 5; i++) {
             // reset c at the start of each row
            for (int j = 1; j <= i; j++, c++) {
                System.out.print(c + " ");

            }
            c=(char)(69-i);
            System.out.println(); // move to next line after inner loop
        }

    }
}

