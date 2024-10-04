import java.util.Scanner;

public class MinMaxCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers separated by spaces:");

        String input = scanner.nextLine();
        String[] numbers = input.split(" ");

        // Initialize min and max with first number
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

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

