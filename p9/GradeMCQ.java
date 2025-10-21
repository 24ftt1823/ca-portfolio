import java.util.Scanner;

public class GradeMCQ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 2D array storing students' answers (4 students, 6 questions)
        char[][] studentAnswers = {
            {'A', 'B', 'C', 'D', 'A', 'B'}, // Student 0
            {'C', 'D', 'D', 'A', 'B', 'D'}, // Student 1
            {'D', 'D', 'A', 'B', 'B', 'A'}, // Student 2
            {'C', 'A', 'D', 'A', 'B', 'C'}  // Student 3
        };

        // 1D array for the MCQ key
        char[] key = new char[6];

        System.out.println("Enter the key to the MCQ:");

        // Capture the lecturer's key
        for (int i = 0; i < key.length; i++) {
            key[i] = input.next().charAt(0);
        }

        // Grade each student
        for (int i = 0; i < studentAnswers.length; i++) {
            int correctCount = 0;
            for (int j = 0; j < key.length; j++) {
                if (studentAnswers[i][j] == key[j]) {
                    correctCount++;
                }
            }
            String result = (correctCount >= 3) ? "passed" : "failed"; // Assuming 3 or more correct is passing
            System.out.println("Student " + i + "'s correct count is " + correctCount + ". Therefore, he/she " + result + " the test.");
        }

        input.close();
    }
}
