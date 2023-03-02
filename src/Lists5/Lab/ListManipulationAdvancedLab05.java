package Lists5.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class ListManipulationAdvancedLab05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        int sumOdd = 0;
        int sumEven = 0;
        while (!input.equals("end")) {
            String[] command = input.split(" ");
            if (command[0].equals("Contains")) {
                int checkedNumber = Integer.parseInt(command[1]);
                if (list.contains(checkedNumber)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }
            } else if (command[0].equals("Print") && command[1].equals("even")) {
                List<Integer> newEvenList = new ArrayList<>();
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i) % 2 == 0) {
                        newEvenList.add(list.get(i));
                        sumEven += list.get(i);
                    }
                }
                for (Integer number : newEvenList) {
                    System.out.print(number + " ");
                }
            } else if (command[0].equals("Print") && command[1].equals("odd")) {
                System.out.println();
                List<Integer> newOddList = new ArrayList<>();
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i) % 2 != 0) {
                        newOddList.add(list.get(i));
                        sumOdd += list.get(i);
                    }
                }
                for (Integer number : newOddList) {
                    System.out.print(number + " ");
                }
            } else if (command[0].equals("Get") && command[1].equals("sum")) {
                int totalSum = sumEven + sumOdd;
                System.out.println();
                System.out.println(totalSum);
            } else if (command[0].equals("Filter") && command[1].equals(">=")) {
                int number = Integer.parseInt(command[2]);

                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i) >= number) {
                        System.out.print(list.get(i) + " ");
                    }
                }
            } else if (command[0].equals("Filter") && command[1].equals("<=")) {
                int number = Integer.parseInt(command[2]);

                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i) <= number) {
                        System.out.println();
                        System.out.print(list.get(i) + " ");
                    }
                }
            } else if (command[0].equals("Filter") && command[1].equals("<")) {
                int number = Integer.parseInt(command[2]);
                System.out.println();

                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i) < number) {
                        System.out.print(list.get(i) + " ");
                    }
                }
            } else if (command[0].equals("Filter") && command[1].equals(">")) {
                int number = Integer.parseInt(command[2]);

                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i) > number) {
                        System.out.println();
                        System.out.print(list.get(i) + " ");
                    }
                }
            }
            input = scanner.nextLine();
        }
    }
}


