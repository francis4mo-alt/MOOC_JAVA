import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumPos = 0;
        int countPos = 0;

        while (true) {
            int num = Integer.valueOf(scanner.nextLine());

            if (num == 0) {
                break;
            } 
            
            if (num > 0) {
                sumPos = sumPos + num;
                countPos = countPos + 1;
            }
        }
        
        if (countPos == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(1.0 * sumPos / countPos);
        }
    }
}