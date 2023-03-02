package Lists5.Ex;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperationsEx04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("End")) {

            String[] command = input.split("\\s+");
            if (command[0].equals("Add")) {
                int number = Integer.parseInt(command[1]);
                list.add(number);
            } else if (command[0].equals("Insert")) {
                int number = Integer.parseInt(command[1]);
                int index = Integer.parseInt(command[2]);
                if (index > (list.size() - 1) || index < 0) {
                    System.out.println("Invalid index");
                } else {
                    list.add(index, number);
                }
            } else if (command[0].equals("Remove")) {
                int index = Integer.parseInt(command[1]);
                if (index > (list.size() - 1) || index < 0) {
                    System.out.println("Invalid index");
                } else {
                    list.remove(index);
                }
            } else if (command[0].equals("Shift") && command[1].equals("left")) {
                int count = Integer.parseInt(command[2]);
                while (count > 0) {
                    int last = list.get(0);
                    list.add(last);
                    list.remove(0);
                    count--;
                }
            } else if (command[0].equals("Shift") && command[1].equals("right")) {
                int count = Integer.parseInt(command[2]);
                while (count > 0) {
                    list.add(0, list.get(list.size() - 1));
                    list.remove(list.size() - 1);
                    count--;
                }
            }
            input = scanner.nextLine();
        }
        for (Integer number : list) {
            System.out.print(number + " ");
        }
    }
}
