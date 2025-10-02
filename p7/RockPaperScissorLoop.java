import java.util.Scanner;

public class RockPaperScissorLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rounds = 0;            
        int userScore = 0;         
        int computerScore = 0;     
        int userChoice, computerChoice;
        String playAgain;         

        do {
            
            System.out.print("Enter rock (0), paper (1), scissor (2): ");
            userChoice = input.nextInt();

           
            int randomBig = (int)(Math.random() * 1000);
            computerChoice = randomBig % 3;

            // Convert user choice to text
            String userName = "";
            if (userChoice == 0) userName = "rock";
            if (userChoice == 1) userName = "paper";
            if (userChoice == 2) userName = "scissor";

            // Convert computer choice to text
            String computerName = "";
            if (computerChoice == 0) computerName = "rock";
            if (computerChoice == 1) computerName = "paper";
            if (computerChoice == 2) computerName = "scissor";

            // Decide result
            String result = "";
            if (computerChoice == userChoice) {
                result = "It is a draw.";
            } else if ((computerChoice == 0 && userChoice == 2) || 
                       (computerChoice == 1 && userChoice == 0) || 
                       (computerChoice == 2 && userChoice == 1)) {
                result = "You lose.";
                computerScore++;
            } else {
                result = "You win.";
                userScore++;
            }

            // Display result
            System.out.println("The computer is " + computerName + ". You are " + userName + ". " + result);
            System.out.println("\n");

            // Count round
            rounds++;

            // Ask if want to continue
            System.out.print("Enter y to play again: ");
            playAgain = input.next();

            System.out.println("\n");

        } while (playAgain.equalsIgnoreCase("y"));

        
        System.out.println("In the total of " + rounds + " round(s), You scored " + userScore + ", Computer scored " + computerScore);

        if (userScore > computerScore) {
            System.out.println("You won the game.");
        } else if (userScore < computerScore) {
            System.out.println("You lose the game.");
        } else {
            System.out.println("It is a draw game.");
        }

        input.close();
    }
}
