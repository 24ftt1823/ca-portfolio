import java.util.Scanner;

public class OccurrenceOfMaxNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         System.out.println("Enter numbers, the input ends with 0 entered: ");
        int num = input.nextInt();

        int largest = num;
        int count = 0;

        while (true) {
            num = input.nextInt();

            if (num == 0) {
                break; // stop
            }

            if (num == largest) {
                count++;
            } else if (num > largest) {
                largest = num;
                count = 1;
            }
        }
        System.out.println("The largest number is " + largest);
        System.out.println("The occurrence count of the largest number is " + count);

    input.close();
}

}