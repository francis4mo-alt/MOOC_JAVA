
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here

        System.out.println("Give the first number: ");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number: ");
        int second = Integer.valueOf(scanner.nextLine());

        int sum = first + second;
        int rest = first - second;
        int dot = first * second;
        double div = ((1.0)*first / second);

        System.out.println(first + " + " + second + " = " + sum);
        System.out.println(first + " - " + second + " = " + rest);
        System.out.println(first + " * " + second + " = " + dot);
        System.out.println(first + " / " + second + " = " + div);

    }
}
