import java.util.Scanner;

public class ReverseOfInteger {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         // Input
        System.out.print("Enter an integer between 100 and 999: ");
        int number = input.nextInt();
        
        // Extract digits
        int hundreds = number / 100;         // first digit
        int tens = (number / 10) % 10;       // middle digit
        int ones = number % 10;              // last digit

        // Reverse number as string
        String reverse = "" + ones + tens + hundreds;

        
        System.out.println("The reverse of " + number + " is " + reverse);


        input.close();
    }
}
