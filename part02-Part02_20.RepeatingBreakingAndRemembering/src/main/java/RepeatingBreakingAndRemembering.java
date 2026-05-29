
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int numbers = 0;
        double avr = 0;
        int numpar = 0;
        int numimpar = 0;

        System.out.println("Give numbers:");

        while (true) {
            int num = Integer.valueOf(scanner.nextLine());

            if (num == -1) {
                break;
            }

            if (num % 2 == 0) {
                numpar = numpar + 1;
            }

            if (num % 2 == 1) {
                numimpar = numimpar + 1;
            }

            sum = sum + num;
            numbers = numbers + 1;
            avr = (1.0)*sum / numbers;


        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numbers);
        System.out.println("Average: " + avr);
        System.out.println("Even: " + numpar);
        System.out.println("Odd: " + numimpar);
    }
}
