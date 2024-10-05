:import java.util.Scanner;
// Program to calculate Minimum and Maximum of a given set of numbers
public class MinMaxCalculation {
    public static void main(String[] args) {
        // Input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers separated by spaces:");
        
        // Read the input as string, assuming the user inputs the set of numbers with spaces inbetween the numbers as a string
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");

        // Initialize min and max with Integer Max and Integer Min
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Calculate the maximum and minimum value
        for (String number : numbers) {
            int num = Integer.parseInt(number);
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);

        scanner.close();
    }
}

