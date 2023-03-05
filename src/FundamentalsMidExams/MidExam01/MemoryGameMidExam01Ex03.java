package FundamentalsMidExams.MidExam01;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGameMidExam01Ex03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        int movesCounter = 0;

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] indexes = input.split("\\s+");
            movesCounter++;
            int index1 = Integer.parseInt(indexes[0]);
            int index2 = Integer.parseInt(indexes[1]);
            if (index1 == index2 || index1 < 0 || index2 < 0 || index1 >= list.size() || index2 >= list.size()) {
//                for (int i = 0; i < list.size() / 2; i++) {
                String additionalElement = "-" + movesCounter + "a";
                list.add(list.size() / 2, additionalElement);
                list.add(list.size() / 2, additionalElement);
                System.out.println("Invalid input! Adding additional elements to the board");
            } else {
                if (list.get(index1).equals(list.get(index2))) {
                    System.out.printf("Congrats! You have found matching elements - %s!%n", list.get(index1));
                    list.remove(index1);
                    if (index2 == 0) {
                        list.remove(index2);
                    } else {
                        list.remove(index2 - 1);
                    }
                } else {
                    System.out.println("Try again!");
                }
            }
            if (list.size() == 0) {
                System.out.printf("You have won in %d turns!%n", movesCounter);
                return;
            }
            input = scanner.nextLine();
        }
        System.out.println("Sorry you lose :(");
        for (String element : list) {
            System.out.print(element + " ");
        }
    }
}

