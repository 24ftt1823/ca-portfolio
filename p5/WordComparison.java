import java.util.Scanner;

public class WordComparison {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.print("Enter the first word: ");
        String word1 = input.nextLine();

        System.out.print("Enter the second word: ");
        String word2 = input.nextLine();

        //comparing two word using .equalsignorecase which ignore lower and uppercase.
        boolean compare = word1.equalsIgnoreCase(word2);
        
        //topic7_page22 //output
        System.out.print("Are both words the same? " + compare );

        input.close();
    }
}
