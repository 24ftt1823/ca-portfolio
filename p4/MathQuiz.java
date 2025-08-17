import java.util.Scanner;

public class MathQuiz {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Randomly generate TWO whole numbers between 0 to 100 
        //Lecture 6 slide 37
        int num1= (int)(Math.random() * 101);
        int num2= (int)(Math.random() * 101);

        //SUM
        System.out.println("what is " + num1 + " + " + num2);
        int userSum =  input.nextInt();
        int sum = num1+num2;

        //TERNARY OPERATOR WEEK5_2 & WEEK4_2
        System.out.println(num1 + " + " +  num2 + " = " + userSum + (sum == userSum? " is true "  :  "is false " ));

        //MODULUS
        System.out.println("what is " + num1 + " % " + num2);
        int userMOD =  input.nextInt();
        int modulus = num1%num2;

        //TERNARY OPERATOR WEEK5_2 & WEEK4_2
        System.out.println(num1 + " % " +  num2 + " = " + userMOD + ((modulus == userMOD)? " is true "  :  "is false " ));

        input.close();
    }
}

