import java.util.Scanner;

public class Reverse5Letters {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //user input
        System.out.print("Enter the 5 letters word: ");
        String word = input.nextLine();

        //user enter no more than 5 letter word
        if (word.length() == 5){
        //reverse letter using charAt() 
        String reverse = "" + word.charAt(4) + word.charAt(3) + word.charAt(2) +
        word.charAt(1) + word.charAt(0);
        
        //output
        System.out.println("The reverse of the word " + word + " is "+ reverse );  
    }
     input.close();

    }
}