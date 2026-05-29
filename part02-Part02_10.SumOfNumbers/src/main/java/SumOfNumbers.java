
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        while (true) {
            System.out.println("Give a number: ");
            int num1 = Integer.valueOf(scanner.nextLine());
            if (num1 == 0) {
                break;
            }
            num = num + num1;
        }
        System.out.println("Sum of the numbers: " + num);
    }
}
