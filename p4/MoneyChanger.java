import java.util.Scanner;

public class MoneyChanger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input choice
        System.out.print("Enter 1 to convert bnd to rm and 2 vice versa: ");
        int choice = input.nextInt();

        // Input amount
        System.out.print("Enter the amount to be converted: ");
        double amount = input.nextDouble();

        // Conversion rate
        double rate = 3.0;

        // Use ternary operator
        double result = (choice == 1)? amount * rate : amount / rate;

        // Output formatted to 2 decimal places
        System.out.printf("The change is %.2f%n", result);

        input.close();
    }
}