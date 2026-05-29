import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift? ");
        int gift = Integer.valueOf(scan.nextLine());

        if (gift < 5000) {
            System.out.println("No tax!");
        } else if (gift >= 5000 && gift < 25000) {
            double tax1 = (gift - 5000) * (0.08) + 100;
            System.out.println("Tax: " + tax1);
        } else if (gift >= 25000 && gift < 55000) {
            double tax2 = (gift - 25000) * (0.1) + 1700;
            System.out.println("Tax: " + tax2);
        } else if (gift >= 55000 && gift < 200000) {
            double tax3 = (gift - 55000) * (0.12) + 4700;
            System.out.println("Tax: " + tax3);
        } else if (gift >= 200000 && gift < 1000000) {
            double tax4 = (gift - 200000) * (0.15) + 22100;
            System.out.println("Tax: " + tax4);
        } else {
            double tax5 = (gift - 1000000) * (0.17) + 142100;
            System.out.println("Tax: " + tax5);
        }

    }
}
