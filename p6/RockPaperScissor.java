import java.util.Scanner;

public class RockPaperScissor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user input
        System.out.println("Enter rock (0), paper (1), scissor (2): ");
        int userChoice = input.nextInt();

        // Generate random computer choice
        //generate a big number then to convert into 0,1 or 2 using modulus
        int randomBig = (int)(Math.random() * 1000); // big number
        int computerChoice = randomBig % 3; // convert to 0,1,2

        // Convert choices to text
        String userName = "";
        if (userChoice == 0) userName = "rock";
        if (userChoice == 1) userName = "paper";
        if (userChoice == 2) userName = "scissor";
        
        String computerName = "";
        if (computerChoice == 0) computerName = "rock";
        if (computerChoice == 1) computerName = "paper";
        if (computerChoice == 2) computerName = "scissor";

        // multiple if statements
        // Result message
        String result = "";

        // Draws
        if (computerChoice == 0 && userChoice == 0) 
            result = "It is a draw.";
        if (computerChoice == 1 && userChoice == 1) 
            result = "It is a draw.";
        if (computerChoice == 2 && userChoice == 2) 
            result = "It is a draw.";

        // Computer wins
        if (computerChoice == 0 && userChoice == 2) // rock - scissor 
            result = "You Lose.";
        if (computerChoice == 1 && userChoice == 0) // paper - rock
            result = "You Lose.";
        if (computerChoice == 2 && userChoice == 1) // scissor - paper
            result = "You Lose.";

        // User wins
        if (computerChoice == 2 && userChoice == 0) // scissor - rock
            result = "You Win.";
        if (computerChoice == 0 && userChoice == 1) // rock - paper
            result = "You Win.";
        if (computerChoice == 1 && userChoice == 2) // paper - scissor
            result = "You Win.";

       
        // Display both choices and result
        System.out.println("The computer is " + computerName + ". You are " + userName+ ". " + result);
        
        input.close();
    }
    
}
