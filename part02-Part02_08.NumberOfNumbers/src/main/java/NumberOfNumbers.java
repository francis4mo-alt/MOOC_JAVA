
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;

        while (true) {
            System.out.println("Give a number: ");
            int num = Integer.valueOf(scanner.nextLine());
            if (num != 0) {
                number = number + 1;
            }
            if (num == 0) {
                break;
            }
        }
        System.out.println("Number of numbers: " + number);
    }
}
