import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine(), reversedString = "";

        //Input Checking
        if (inputString.length() >= 1 && inputString.length() <= 100 && inputString.matches("[a-z]+")) {
            // Reverse the string
            for (int i = inputString.length()-1; i>=0; i--){
                char ch= inputString.charAt(i);
                reversedString = reversedString +ch;
            }
            // Output
            System.out.print("Reversed String:\n" + reversedString);
        }
        else
            System.out.println("Input does not satisfy constraints.");
    }
}
