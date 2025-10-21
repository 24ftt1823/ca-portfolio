import java.util.Scanner;

public class ShiftingElementByInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.println("How many numbers are there?");
        int n = input.nextInt();

        // 2) Create an array and capture the numbers
        int[] numbers = new int[n];
        System.out.println("Enter the " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }

       
        System.out.println("Enter number of left shift:");
        int shift = input.nextInt();

        
        for (int s = 0; s < shift; s++) {
            int first = numbers[0]; 
            for (int i = 0; i < n - 1; i++) {
                numbers[i] = numbers[i + 1];
            }
            numbers[n - 1] = first; 
        }

        
        System.out.println("The shifted arrangement is:");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }

        input.close();
    }
}
