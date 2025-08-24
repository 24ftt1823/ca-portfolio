import java.util.Scanner;

public class ReplaceSubString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //user message 
        System.out.println("Enter your message: ");
        String message = input.nextLine();

        //text to replace
        System.out.print("Enter the substring to replace: ");
        String toReplace = input.nextLine();

        //replacement
        System.out.print("Enter the replacement string: ");
        String replacement = input.nextLine();

        //updated message
        String updatedMessage = message.replace(toReplace, replacement);
        System.out.println("The update message is: ");
        System.out.println(updatedMessage);
        
        input.close();
    }
    
}
