import java.util.Scanner;

public class EliminateDuplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        int[] numbers = new int[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }

        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    numbers[j] = 0;
                }
            }
        }

      
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) { 
                System.out.print(numbers[i] + " ");
            }
        }

        input.close();
    }
}
