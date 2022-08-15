package LISTS5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreatEx08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        String current = "";
        String input = scanner.nextLine();
        while (!input.equals("3:1")) {
            String[] command = input.split("\\s+");

            if (command[0].equals("merge")) {
                int startIndex = Integer.parseInt(command[1]);
                int endIndex = Integer.parseInt(command[2]);
                if (startIndex < 0) {
                    startIndex = 0;
                }
                if (endIndex > list.size() - 1) {
                    endIndex = list.size() - 1;
                }
                int counter = startIndex;

                for (int i = startIndex; i < endIndex; i++) {
                    String concat = list.get(counter) + list.get(counter + 1);
                    list.set(counter, concat);
                    list.remove(counter + 1);
                }
            } else if (command[0].equals("divide")) {
                int index = Integer.parseInt(command[1]);
                int partitions = Integer.parseInt(command[2]);
                if (index >= 0 && index < list.size() && partitions >= 0 && partitions <= 100) {
                    String element = list.get((index));
                    List<String> newList = new ArrayList<>();
                    if (element.length() % partitions == 0) {
                        int portionLength = element.length() / partitions;
                        int count = 0;
                        for (int i = 0; i < partitions; i++) {
                            String concat = "";
                            for (int j = 0; j < portionLength; j++) {
                                char symbol = element.charAt(count);
                                concat += symbol;
                                count++;
                            }
                            newList.add(concat);
                        }
                    } else {
                        int portionLength = element.length() / partitions;
                        int count = 0;
                        for (int i = 0; i < partitions; i++) {
                            String concat = "";
                            if (i == partitions - 1) {
                                for (int j = count; j < element.length(); j++) {
                                    char symbol = element.charAt(count);
                                    concat += symbol;
                                }
                            } else {
                                for (int j = 0; j < portionLength; j++) {
                                    char symbol = element.charAt(count);
                                    concat += symbol;
                                    count++;
                                }
                            }
                            newList.add(concat);
                        }
                    }
                    list.remove(index);
                    list.addAll(index, newList);
                }
            }
            input = scanner.nextLine();
        }
        System.out.print(String.join(" ", list));
    }
}




