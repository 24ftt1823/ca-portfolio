import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter two integers
        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        // Compute the greatest common divisor
        int gcd = findGCD(num1, num2);

        // Display the result
        System.out.println("The greatest common divisor for " + num1 + " and " + num2 + " is " + gcd);
        
        input.close();
    }

    // Method to find GCD using Euclidean Algorithm
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}