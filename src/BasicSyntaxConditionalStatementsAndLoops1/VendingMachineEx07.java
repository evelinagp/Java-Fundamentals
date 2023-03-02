package BasicSyntaxConditionalStatementsAndLoops1;

import java.util.Scanner;

public class VendingMachineEx07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        double totalMoney = 0;
        while (!input.equals("Start")) {
            double currentCoins = Double.parseDouble(input);
            if (currentCoins == 0.1 || currentCoins == 0.2 || currentCoins == 0.5 || currentCoins == 1 || currentCoins == 2) {
                totalMoney += currentCoins;
            } else {
                System.out.printf("Cannot accept %.2f%n", currentCoins);
            }
            input = scanner.nextLine();
        }
        input = scanner.nextLine();
        while (!input.equals("End")) {
            if (input.equals("Nuts")) {
                if (totalMoney >= 2) {
                    totalMoney -= 2;
                    System.out.println("Purchased Nuts");
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (input.equals("Water")) {
                if (totalMoney >= 0.7) {
                    totalMoney -= 0.7;
                    System.out.println("Purchased Water");
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (input.equals("Crisps")) {
                if (totalMoney >= 1.5) {
                    totalMoney -= 1.5;
                    System.out.println("Purchased Crisps");
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (input.equals("Soda")) {
                if (totalMoney >= 0.8) {
                    totalMoney -= 0.8;
                    System.out.println("Purchased Soda");
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (input.equals("Coke")) {
                if (totalMoney >= 1.0) {
                    totalMoney -= 1.0;
                    System.out.println("Purchased Coke");
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else {
                System.out.println("Invalid product");
            }
            input = scanner.nextLine();
        }
        System.out.printf("Change: %.2f",totalMoney);
    }
}

