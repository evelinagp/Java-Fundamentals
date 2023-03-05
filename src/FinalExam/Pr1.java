package FinalExam;

import java.util.Scanner;

public class Pr1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine().trim();
        String command = scanner.nextLine();

        while (!command.equals("Done")) {
            String[] tokens = command.split("\\s+");
//•	TakeOdd
//Substitute {substring} {substitute}
//•	Cut {index} {length}
            String commandName = tokens[0];
            switch (commandName) {
                case "Change":
                    String character = tokens[1];
                    String replacement = tokens[2];
                    if (input.contains(character)) {
                        input = input.replace(character, replacement);
                        System.out.println(input);
                    }
                    break;
                case "Includes":
                    String string = tokens[1];
                    if (input.contains(string)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "End":
                    String endString = tokens[1];

                    if (input.contains(endString)) {
                        int length = endString.length();
                        StringBuilder sbInput = new StringBuilder();
                        for (int i = input.length() - 1; i > input.length() - 1 - length; i--) {
                            sbInput.append(input.charAt(i));
                        }
                        String last = sbInput.reverse().toString();
                        if (last.equals(endString)) {
                            System.out.println("True");
                        } else {
                            System.out.println("False");
                        }
                    }
                    break;
                case "Uppercase":
                    input = input.toUpperCase();
                    System.out.println(input);
                    break;
                case "FindIndex":
                    String findIndex = tokens[1];
                    if (input.contains(findIndex)) {
                        int firstIndex = input.indexOf(findIndex);
                        System.out.println(firstIndex);
                    }
                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(tokens[1]);
                    int length = Integer.parseInt(tokens[2]);
                    StringBuilder cut = new StringBuilder(input);
                    cut.delete(0, startIndex);
                    cut.delete(length, cut.length());
                    input = cut.toString();
                    System.out.println(input);
                    break;

            }
            command = scanner.nextLine();
        }
    }
}
