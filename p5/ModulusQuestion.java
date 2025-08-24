import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class ModulusQuestion {
    
    public static void main(String[] args) throws IOException{

        //generate random number
        Random rand = new Random();

        int num1 = rand.nextInt(100); 
        int num2 = rand.nextInt(100); 

        //create file 
        new File("C:\\Practical 5").mkdir();

        //create text file
        FileWriter writer = new FileWriter("C:\\Practical 5/Modulus Question.txt", true);

        //output in text file
        writer.write(num1 + " % " + num2 + " = ?" + "\r\n"); // new line
        writer.close();

        //output
        System.out.println("A new question added");


    }
    
}
