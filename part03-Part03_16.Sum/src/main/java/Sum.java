
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        // Try your method here

        ArrayList<Integer> num = new ArrayList<>();

        num.add(3);
        num.add(2);
        num.add(6);
        num.add(-1);
        System.out.println(sum(num));

        num.add(5);
        num.add(1);
        System.out.println(sum(num));
    }

    public static int sum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (Integer inte : numbers) {
            sum = sum + inte;
        }
        return sum;
    }

}
