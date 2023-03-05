package FundamentalsMidExams.MidExam03;

import java.util.Scanner;

public class CounterStrikeMidExam03Ex012 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int initialEnergy = Integer.parseInt(scanner.nextLine());

        int wonCounter = 0;
        String input = scanner.nextLine();
        while (!input.equals("End of battle")) {
            int distance = Integer.parseInt(input);
            if (initialEnergy < distance) {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", wonCounter, initialEnergy);
                return;
            }
            initialEnergy -= distance;
            wonCounter++;
            if (wonCounter % 3 == 0) {
                initialEnergy += wonCounter;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Won battles: %d. Energy left: %d", wonCounter, initialEnergy);
    }
}

