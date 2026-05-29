
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int currentsizename = 0;
        String currentname = "";
        int sum = 0;
        int i = 0;

        while (true) {
            String string = scanner.nextLine();

            if (string.equals("")) {
                break;
            }

            String [] pieces = string.split(",");

            int newsizename = pieces[0].length();
            String newname = pieces[0];

            if (newsizename > currentsizename) {
                currentsizename = newsizename;
                currentname = newname;
            }
            sum = sum + Integer.valueOf(pieces[1]);
            i++;
        }
        if (i > 0) {
            System.out.println("Longest name: " + currentname);
            System.out.println("Average of the birth years: " + 1.0 * sum / i);
        }
    }
}
