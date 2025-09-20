package patters;

public class Pattern6 {
    public static void main(String[] args) {
        // Outer loop for rows
        for (int x = 5; x >= 1; x--) {
            // Inner loop for columns
            for (int i = 1; i <= x; i++) {
                System.out.print(i + " ");
            }
            // Move to next line after each row
            System.out.println();
        }
    }
}


