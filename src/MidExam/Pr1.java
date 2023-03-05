package MidExam;

import java.util.Scanner;

public class Pr1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amountBiscuitsPerDay = Integer.parseInt(scanner.nextLine());
        int countOfWorkers = Integer.parseInt(scanner.nextLine());
        int amountBiscuitsPerDayCompetitors = Integer.parseInt(scanner.nextLine());

        int totalAmount = 0;
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0) {
                totalAmount += Math.floor(1.0 * amountBiscuitsPerDay * countOfWorkers) * 0.75;
            } else {
                totalAmount += amountBiscuitsPerDay * countOfWorkers;
            }
        }
        System.out.printf("You have produced %d biscuits for the past month.%n", totalAmount);
        double percentage1 = (1.0 * totalAmount - amountBiscuitsPerDayCompetitors) / amountBiscuitsPerDayCompetitors * 100;
        double percentage2 = ( 1.0 * amountBiscuitsPerDayCompetitors - totalAmount) / amountBiscuitsPerDayCompetitors * 100;
        if (totalAmount > amountBiscuitsPerDayCompetitors) {
            System.out.printf("You produce %.2f percent more biscuits.", percentage1);
        } else {
            System.out.printf("You produce %.2f percent less biscuits.", percentage2);
        }
    }
}
