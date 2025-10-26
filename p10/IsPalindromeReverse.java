import java.util.Scanner;

public class IsPalindromeReverse {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Generate random 3-digit number
        int number = (int) (Math.random() * 900 + 100);

        System.out.print("Enter the reverse of " + number + ": ");
        int userNumber = input.nextInt();

        // Validate user input to make sure it is a 3-digit number
        while (userNumber < 100 || userNumber > 999) {
            System.out.print("Please enter a 3-digit reverse number of " + number + ": ");
            userNumber = input.nextInt();
        }

        // Call reverse() to get the correct reversed number
        int reversed = reverse(number);

        // Call isPalindrome() to compare user's input with the reversed number
        boolean result = isPalindrome(userNumber, reversed);

        System.out.println("The digit " + userNumber + " is palindrome of " + number + " is " + result + ".");
    }

    // Method to reverse a 3-digit number
    public static int reverse(int number) {
        int rev = 0;
        while (number != 0) {
            int digit = number % 10;
            rev = rev * 10 + digit;
            number /= 10;
        }
        return rev;
    }

    // Method to check if user's input matches the reversed number
    public static boolean isPalindrome(int userInput, int reversedNumber) {
        return userInput == reversedNumber;
    }
}
