package Methods4.Lab;

import java.util.Scanner;

public class OrdersLab05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        if (product.equals("coffee")) {
            coffee(quantity);
        } else if ((product.equals("water"))) {
            water(quantity);
        } else if (product.equals("coke")) {
            coke(quantity);
        } else if (product.equals("snacks")) {
            snacks(quantity);
        }
    }

    private static void snacks(double quantity) {
        double result = 2 * quantity;
        System.out.printf("%.2f", result);
    }

    private static void coke(double quantity) {
        double result = 1.4 * quantity;
        System.out.printf("%.2f", result);
    }

    private static void water(double quantity) {
        double result = 1 * quantity;
        System.out.printf("%.2f", result);
    }

    private static void coffee(double quantity) {
        double result = 1.5 * quantity;
        System.out.printf("%.2f", result);
    }
}

//•	coffee – 1.50
//•	water – 1.00
//•	coke – 1.40
//• snacks – 2.00

