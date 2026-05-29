
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here

        int i = 0;

        while (i < array.length) {
            int stars = array[i];
            int count = 0;
            while (count < stars) {
                System.out.print("*");
                count++;
            }
            System.out.println("");
            i++;
        }
    }

}
