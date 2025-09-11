import java.util.Scanner;

public class AddFourNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Generate four random numbers between 0 to 99.
        int no1 = (int)(Math.random() * 100);
        int no2 = (int)(Math.random() * 100);
        int no3 = (int)(Math.random() * 100);
        int no4 = (int)(Math.random() * 100);

        int sum = no1 + no2 + no3 + no4;

        System.out.println("What is " + no1 + " + " + no2 + " + " + no3 + " + " + no4);
        int answer = input.nextInt();

        if (answer == sum){
            System.out.println("Well done, you are correct!");
        } 
        else {
            System.out.println("Nice try, the sum should be " + sum);
        }
        
        input.close();
        
    }

    
}
