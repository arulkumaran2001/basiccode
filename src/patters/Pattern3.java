package patters;

public class Pattern3 {
    public static void main(String[] args) {
        // Printing "Hello, World!"
        System.out.println("Hello, World!");

        // Printing the number pattern
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

