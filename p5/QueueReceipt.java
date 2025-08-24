import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class QueueReceipt {
    
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        //user input
        System.out.print("Enter name: ");
        String name = input.nextLine();
        //receipt output
        System.out.println("Receipt generated. Thank you.");
        
        //creating file
        new File("C:\\Practical 5").mkdir();

        //date and time
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String dateTime = now.format(formatter);

        //creating random number
        Random rand = new Random();
        int queueNumber = rand.nextInt(100) + 1;

        //receipt text
        FileWriter writer = new FileWriter("C:\\Practical 5/QReceipt.txt", true);
        writer.write(dateTime + "\r\n");
        writer.write("Hi, " + name + "\r\n");
        writer.write("Your Queue No is: " + queueNumber + "\r\n");
        writer.close();
        
        input.close();
    }
}
