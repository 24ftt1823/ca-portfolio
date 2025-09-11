import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SimpleLoginValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String correctUser = "Ahmad Ali";
        String correctPass = "12345";

        // User login
        System.out.println("Please enter your username:");
        String userName = input.nextLine();
        System.out.println("Please enter the password:");
        String userPass = input.nextLine();

        // Nested if-else validation
        if (userName.equalsIgnoreCase(correctUser)) {
            if (userPass.equals(correctPass)) {
                //week5_1 - DateTime coding
                LocalDateTime ldt = LocalDateTime.now();
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                String currentTime = ldt.format(dtf);

                System.out.println("Welcome " + correctUser + ". The time now is " + currentTime);
            } else {
                System.out.println("Error: Password does not match.");
            }
        } else {
            System.out.println("Error: Invalid Username.");
        }

        input.close();
    }
}