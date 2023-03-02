package Lists5.Ex;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeListEx022 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] command = input.split("\\s+");

            int element = Integer.parseInt(command[1]);
            if (command[0].equals("Delete")) {
                while (list.contains(element)) {
                    list.remove(Integer.valueOf(element));
                }
            } else {
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