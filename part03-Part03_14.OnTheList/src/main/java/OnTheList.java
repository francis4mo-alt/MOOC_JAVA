
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        System.out.println("Search for? ");
        String str = scanner.nextLine();

        boolean stri = list.contains(str);
        if (stri) {
            System.out.println(str + " was founded!");
        } else {
        System.out.println(str + " was not found!");
        }
    }
}
