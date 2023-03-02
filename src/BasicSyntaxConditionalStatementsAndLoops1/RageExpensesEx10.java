package BasicSyntaxConditionalStatementsAndLoops1;

import java.util.Scanner;

public class RageExpensesEx10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        double headsetCount = 0.0;
//        double mouseCount = 0.0;
//        double keyboardCount = 0.0;
//        double displayCount = 0.0;
        double total = 0.0;

        double lostGames = Double.parseDouble(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        for (int i = 1; i <= lostGames; i++) {
            if (i % 2 == 0) {
                total += headsetPrice;
                // headsetCount++;
            }
            if (i % 3 == 0) {
                // mouseCount++;
                total += mousePrice;

            }
            if (i % 6 == 0) {
                total += keyboardPrice;
                //keyboardCount++;
            }
            if (i % 12 == 0) {
                total += displayPrice;
                // displayCount++;
            }
        }
        // double total = keyboardCount * keyboardPrice + mouseCount * mousePrice + displayCount * displayPrice + headsetCount * headsetPrice;
        System.out.printf("Rage expenses: %.2f lv.", total);
    }
}
