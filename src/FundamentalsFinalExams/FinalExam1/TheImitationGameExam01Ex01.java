package FundamentalsFinalExams.FinalExam1;

import java.util.Scanner;

public class TheImitationGameExam01Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        StringBuilder input = new StringBuilder(line);

        String command = scanner.nextLine();

        while (!command.equals("Decode")) {
            String[] tokens = command.split("\\|");

            String commandName = tokens[0];
            switch (commandName) {
                case "Move":
//•	Move {number of letters} -  Moves the first n letters to the back of the string.
                    int nLetters = Integer.parseInt(tokens[1]);
                    String stringToMove = input.substring(0, nLetters);
                    StringBuilder newString = input.insert(input.length(), stringToMove);
                    StringBuilder finalString = input.replace(0, nLetters, "");
                    input = finalString;
                    break;
                case "Insert":
//•	Insert {index} {value} - Inserts the given value before the given index in the string.
                    int index = Integer.parseInt(tokens[1]);
                    String value = tokens[2];
                    input.insert(index, value);
                    break;
                case "ChangeAll":
                    String substring = tokens[1];
                    String replacement = tokens[2];
                    String inputAsString = input.toString();
                    inputAsString = inputAsString.replace(substring, replacement);
                    input = new StringBuilder(inputAsString);
//•	ChangeAll {substring} {replacement} -Changes all occurrences of the given substring with the replacement text.
                    break;

            }
            command = scanner.nextLine();
        }
        System.out.println("The decrypted message is: " + input);
    }
}
