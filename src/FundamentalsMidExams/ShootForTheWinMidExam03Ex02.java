package FundamentalsMidExams;

import java.util.Arrays;
import java.util.Scanner;

public class ShootForTheWinMidExam03Ex02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] targets = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(element -> Integer.parseInt(element)).toArray();

        int counter = 0;
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            int index = Integer.parseInt(input);
            if (index >= 0 && index < targets.length) {
                counter++;
                for (int i = 0; i < targets.length; i++) {
                    if (index != i && targets[i] != -1) {
                        if (targets[index] >= targets[i]) {
                            targets[i] += targets[index];
                        } else {
                            targets[i] -= targets[index];
                        }
                    }
                }
                targets[index] = -1;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Shot targets: %d -> ", counter);
        for (int target : targets) {
            System.out.print(target + " ");
        }
    }
}


