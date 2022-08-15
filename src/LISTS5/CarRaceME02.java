package LISTS5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CarRaceME02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        double leftSum = 0;
        double rightSum = 0;

        if (list.size() % 2 != 0) {

            for (int i = 0; i < list.size() / 2; i++) {
                leftSum += list.get(i);
                if (list.get(i) == 0) {
                    leftSum *= 0.80;
                }
            }
            for (int j = list.size() - 1; j > list.size() / 2; j--) {
                rightSum += list.get(j);
                if (list.get(j) == 0) {
                    rightSum *= 0.80;
                }
            }
        }
        if (leftSum > rightSum) {
            System.out.printf("The winner is right with total time: %.1f", rightSum);
        } else {
            System.out.printf("The winner is left with total time: %.1f", leftSum);
        }
    }
}


