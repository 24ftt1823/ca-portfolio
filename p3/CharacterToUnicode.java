import java.util.Scanner;

public class CharacterToUnicode {
    
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char character = input.next().charAt(0);

        int unicode = character;

        System.out.println("The Unicode for character " + character + " is " + unicode);
        
        input.close();//Close scanner
    }

    
}
