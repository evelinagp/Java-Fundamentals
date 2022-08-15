package FundamentalsMidExams;

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
            if (command.equals("Shoot")) {
                int power = Integer.parseInt(token[2]);
                int currentNumber = list.get(index);
                if (currentNumber - power > 0) {
                    currentNumber -= power;
                    list.set(index, currentNumber);
                } else {
                    list.remove(index);
                }
            } else if (command.equals("Add")) {
                int value = Integer.parseInt(token[2]);
                if (index >= 0 && index < list.size()) {
                    list.add(index, value);
                } else {
                    System.out.println("Invalid placement!");
                    input = scanner.nextLine();
                    continue;
                }
            } else if (command.equals("Strike")) {
                int radius = Integer.parseInt(token[2]);
                if (index - radius < 0 || index + radius >= list.size()) {
                    System.out.println("Strike missed!");
                    input = scanner.nextLine();
                    continue;
                } else {
                    for (int i = index; i < index + radius; i++) {
                        list.remove(index + 1);
                    }
                    for (int i = index; i >= index - radius; i--) {
                        list.remove(i);
                    }
                }
            }
            input = scanner.nextLine();
        }
        for (int i = 0; i < list.size() ; i++) {
            if (i != list.size() - 1) {
                System.out.print(list.get(i) + "|");
            } else {
                System.out.print(list.get(i));
            }
        }
    }
}


