package FundamentalsMidExams.MidExam03;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTargetMidExam03Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());


        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] token = input.split("\\s+");
            String command = token[0];
            int index = Integer.parseInt(token[1]);

            if ("Shoot".equals(command)) {
                int power = Integer.parseInt(token[2]);
                if (index >= 0 && index < list.size()) {
                    int currentNumber = list.get(index);
                    currentNumber -= power;
                    list.set(index, currentNumber);
                    if (currentNumber <= 0) {
                        list.remove(index);
                    }
                }
            } else if ("Add".equals(command)) {
                if (index >= 0 && index < list.size()) {
                    int value = Integer.parseInt(token[2]);
                    list.add(index, value);
                } else {
                    System.out.println("Invalid placement!");
                }
            } else if ("Strike".equals(command)) {
                int radius = Integer.parseInt(token[2]);
                if (index - radius < 0 || index + radius >= list.size()) {
                    System.out.println("Strike missed!");
                             } else {
                    for (int i = index; i < index + radius; i++) {
                        list.remove(index + 1);
                    }
                    for (int i = index; i >= index - radius; i--) {
                        list.remove(index - 1);
                    }
                }
            }
            input = scanner.nextLine();
        }

        String numberString = list.stream().map(String::valueOf)
                .collect(Collectors.joining("|"));
        System.out.println(numberString);

    }
}

