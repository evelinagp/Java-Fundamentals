package EXAM;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            String message1 = tokens[1];
            if (command.equals("Chat")) {
                list.add(message1);
            } else if (command.equals("Delete")) {
                if (list.contains(message1)) {
                    list.remove(message1);
                }
            } else if (command.equals("Edit")) {
                String editedVersion = tokens[2];
                if (list.contains(message1)) {
                    list.set(list.indexOf(message1), editedVersion);
                }
            } else if (command.equals("Pin")) {
                list.remove(list.indexOf(message1));
                list.add(message1);
            } else if (command.equals("Spam")) {
                list.add(message1);
                for (int i = 2; i < tokens.length; i++) {
                    list.add(tokens[i]);
                }
            }
            input = scanner.nextLine();
        }
        for (String word : list) {
            System.out.println(word);
        }
    }
}
