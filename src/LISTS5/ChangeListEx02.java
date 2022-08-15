package LISTS5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeListEx02 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] command = input.split("\\s+");

            if (command[0].equals("Delete")) {
                int element = Integer.parseInt(command[1]);

                int counter = 0;
                for (int i = 0; i < list.size(); i++) {
                    if (list.contains(element)) {
                        if (list.get(i) == element) {
                            counter++;
                            for (int j = 0; j < counter; j++) {
                                list.remove(Integer.valueOf(element));
                            }
                        }
                    }
                }
            } else if (command[0].equals("Insert")) {
                int element = Integer.parseInt(command[1]);
                int position = Integer.parseInt(command[2]);
                if (position >= 0 && position < list.size()) {
                    list.add(position, element);
                }
            }
            input = scanner.nextLine();
        }
        for (Integer number : list) {
            System.out.print(number + " ");
        }
    }
}
