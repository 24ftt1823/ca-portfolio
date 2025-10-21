import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        // Create array 0-9
        Integer[] numbers = new Integer[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = i;
        }

        // Shuffle the array
        List<Integer> numberList = Arrays.asList(numbers);
        Collections.shuffle(numberList);
        numberList.toArray(numbers); // convert back to array if needed

        Scanner input = new Scanner(System.in);
        int chances = 10;
        boolean won = false;

        while (chances > 0 && !won) {
            System.out.println("Guess 4 numbers (no duplicates): ");
            int[] guess = new int[4];
            for (int i = 0; i < 4; i++) {
                guess[i] = input.nextInt();
            }

            // Count correct guesses in correct positions
            int score = 0;
            for (int i = 0; i < 4; i++) {
                if (guess[i] == numbers[i]) {
                    score++;
                }
            }

            // Check if won
            if (score == 4) {
                System.out.println("You Won! You got the actual number!");
                won = true;
            } else {
                chances--;
                if (chances == 0) {
                    System.out.print("The actual number is ");
                    for (int i = 0; i < 4; i++) {
                        System.out.print(numbers[i] + " ");
                    }
                    System.out.println(". You Lose.");
                } else {
                    System.out.println("You have score " + score + " out of the 4 numbers. You have " + chances + " chances left.");
                }
            }
        }
        input.close();
    }
}
