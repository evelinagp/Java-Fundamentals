package EXAM;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        int lostCounter = 0;
        int blacklistedCounter = 0;
        String input = scanner.nextLine();
        while (!input.equals("Report")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];

            if (command.equals("Blacklist")) {
                String name = tokens[1];
                if (list.contains(name)) {
                    System.out.printf("%s was blacklisted.%n", name);
                    list.set(list.indexOf(name), "Blacklisted");
                    blacklistedCounter++;
                } else {
                    System.out.printf("%s was not found.%n", name);
                }
            } else if (command.equals("Error")) {
                int index = Integer.parseInt(tokens[1]);
                if (!((list.get(index).equals("Blacklisted")) || (list.get(index).equals("Lost")))) {
                    System.out.printf("%s was lost due to an error.%n", list.get(index));
                    list.set(index, "Lost");
                    lostCounter++;
                }
            } else if (command.equals("Change")) {
                int index = Integer.parseInt(tokens[1]);
                String newName = tokens[2];
                if (index >= 0 && index < list.size()) {
                    System.out.printf("%s changed his username to %s.%n", list.get(index), newName);
                    list.set(index, newName);
                }
            }
            input = scanner.nextLine();
        }
        System.out.printf("Blacklisted names: %d%n", blacklistedCounter);
        System.out.printf("Lost names: %d%n", lostCounter);
        for (String name : list) {
            System.out.print(name + " ");
        }
    }
}
