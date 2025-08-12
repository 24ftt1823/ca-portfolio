import java.util.Scanner;

public class Saving {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your target amount? $");
        double targetAmount = input.nextDouble();

        System.out.print("How many month(s) to reach your goal? ");
        int months = input.nextInt(); //why int months are typically counted as whole units

        int days = months * 30;
        double dailySavings = targetAmount / days; 
        //daily savings might result in a fractional amount when dividing the target amount by days. 

        System.out.printf("The amount you need to save per day is $%.2f", dailySavings);
        
        input.close();//Close scanner
    }
    
}
