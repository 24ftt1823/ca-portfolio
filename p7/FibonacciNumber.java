import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        System.out.print("Please enter the term: ");
        int term = input.nextInt();

        // First two terms
        int f0 = 0;
        int f1 = 1;
        int fn = 0;

        if (term == 0) {
            fn = f0;
        } else if (term == 1) {
            fn = f1;
        } else {
            //Loop to calculate Fibonacci
            for (int i = 2; i <= term; i++) {
                fn = f0 + f1;   // next term
                f0 = f1;        // shift left
                f1 = fn;  }      // update
           }
        
        // Display result
        System.out.println("At term " + term + " the number is " + fn);

        input.close();
    }
}
