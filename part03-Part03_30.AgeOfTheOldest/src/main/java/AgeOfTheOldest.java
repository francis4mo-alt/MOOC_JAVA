
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int old = 0;

        while (true) {
            String string = scanner.nextLine();

            if (string.equals("")) {
                break;
            }

            String [] pieces = string.split(",");

            int actual = Integer.valueOf(pieces[1]);

            if (actual > old) {
                old = actual;
            }
        }
        System.out.println("Age of the oldest: " + old);
    }
}
