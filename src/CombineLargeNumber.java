import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CombineLargeNumber {
    public static String findLargestNumber(List<Integer> nums) {
        Collections.sort(nums, (a, b) -> (String.valueOf(b) + a).compareTo(String.valueOf(a) + b));
        return nums.stream().map(Object::toString).collect(Collectors.joining(""));
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter numbers to add in List (enter a non-integer to stop):");
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            numbers.add(number);
        }
        if (numbers.isEmpty()) {
            System.out.println("No valid numbers entered.");
            return;
        }
        System.out.println("Numbers entered: " + numbers);

        String largestNumber = findLargestNumber(numbers);
        System.out.println("The largest number is: " + largestNumber);
    }
}