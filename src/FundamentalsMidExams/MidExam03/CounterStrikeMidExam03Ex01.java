package FundamentalsMidExams.MidExam03;

import java.util.Scanner;

public class CounterStrikeMidExam03Ex01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int initialEnergy = Integer.parseInt(scanner.nextLine());

        boolean energyIsFinished = false;

        int wonCounter = 0;
        String input = scanner.nextLine();
        while (!input.equals("End of battle")) {
            int distance = Integer.parseInt(input);
            if (initialEnergy < distance) {
                energyIsFinished = true;
                break;
            }
            initialEnergy -= distance;
            wonCounter++;
            if (wonCounter % 3 == 0) {
                initialEnergy += wonCounter;
            }
            input = scanner.nextLine();
        }
        if (energyIsFinished) {
            System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", wonCounter, initialEnergy);
        } else {
            System.out.printf("Won battles: %d. Energy left: %d", wonCounter, initialEnergy);
        }
    }
}


