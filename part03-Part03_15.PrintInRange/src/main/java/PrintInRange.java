
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here

        ArrayList<Integer> num = new ArrayList<>();
        num.add(3);
        num.add(2);
        num.add(6);
        num.add(-1);
        num.add(5);
        num.add(1);

        System.out.println("The numbers in the range [0, 5]");
        printNumbersInRange(num, 0, 5);

        System.out.println("The numbers in the range [3, 10]");
        printNumbersInRange(num, 3, 10);
    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int uperLimit){
        for (int i = 0; i < numbers.size(); i++) {
            int a = numbers.get(i);
            if (a >= lowerLimit && a <= uperLimit) {
                System.out.println(a);
            }
        }
    }
    
}
