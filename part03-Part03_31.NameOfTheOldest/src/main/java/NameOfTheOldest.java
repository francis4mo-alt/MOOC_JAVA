
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int old = 0;
        String name = "";

        while (true) {
            String string = scanner.nextLine();

            if (string.equals("")) {
                break;
            }

            String [] pieces = string.split(",");

            int actual = Integer.valueOf(pieces[1]);
            String actualname = pieces[0];

            if (actual > old) {
                old = actual;
                name = actualname;
            }
        }
        System.out.println("Name of the oldest : " + name);
    }
}
