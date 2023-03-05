package FundamentalsMidExams.MidExam01;

import java.util.Scanner;

public class ComputerPartsMidExam01Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalPrice = 0;
        String input = scanner.nextLine();
        while (!(input.equals("special") || input.equals("regular"))) {
            double partsPrice = Double.parseDouble(input);
            if (partsPrice < 0) {
                System.out.println("Invalid price!");
                input = scanner.nextLine();
                continue;
            } else {
                totalPrice += partsPrice;
            }
            input = scanner.nextLine();
        }
        double taxes = totalPrice * 0.20;
        double priceWithTaxes = totalPrice + taxes;
        double specialPrice = priceWithTaxes * 0.90;
        if (totalPrice == 0) {
            System.out.println("Invalid order!");
        } else {
                System.out.println("Congratulations you've just bought a new computer!");
                System.out.printf("Price without taxes: %.2f$%n", totalPrice);
                System.out.printf("Taxes: %.2f$%n", taxes);
                System.out.println("-----------");
            if (input.equals("special")) {
                System.out.printf("Total price: %.2f$", specialPrice);
            } else {
                System.out.printf("Total price: %.2f$", priceWithTaxes);
            }
        }
    }
}
