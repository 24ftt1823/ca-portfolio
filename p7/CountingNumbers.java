import java.util.Scanner;

public class CountingNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            
        int totalNum = 0;
        int number;
        int positiveNum = 0;
        int negativeNum = 0;
        int count = 0;
        double average;

        System.out.println("Enter an integer, the input end if it is 0");

        while (true) {

            
            number = input.nextInt();


            if (number == 0) {
                break;    
            }

            if (number > 0){
            positiveNum++;
            }
            else{
                negativeNum++;
            }
            totalNum+=number;
            count++;    
            
        }
        if (count == 0) {
            System.out.println("No number is entered except for 0 to end the program.");
        }
        else{
        System.out.println("The number of positive is " + positiveNum);
        System.out.println("The number of negative is " + negativeNum);  
        System.out.println("The total is " +  totalNum);
        average = (double)totalNum/count;
         System.out.printf("The average is %.2f\n", average);
        }
        input.close();
    }

    
}
