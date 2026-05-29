
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String realname = scanner.nextLine();
        System.out.print("Enter password: ");
        String realpassword = scanner.nextLine();

        if (realname.equals("alex") && realpassword.equals("sunshine")) {
            System.out.println("Yuu have successfully loged in!");
        } else if (realname.equals("emma") && realpassword.equals("haskell")) {
            System.out.println("Yuu have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password");
        }

    }
}
