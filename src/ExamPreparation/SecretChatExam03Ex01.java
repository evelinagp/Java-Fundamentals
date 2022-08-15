package ExamPreparation;

import java.util.Scanner;

public class SecretChatExam03Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder input = new StringBuilder(scanner.nextLine());


        String command = scanner.nextLine();
        while (!command.equals("Reveal")) {
            String[] tokens = command.split(":\\|:");

            String commandName = tokens[0];
            switch (commandName) {

                case "InsertSpace":
//•	InsertSpace:|:{index} - Inserts a single empty space at the given index. The given index will always be valid.
                    int index = Integer.parseInt(tokens[1]);
                    input = input.insert(index, " ");
                    System.out.println(input.toString());
                    break;
                case "Reverse":
// Reverse:|:{substring} - If the message contains the given substring, cut it out, reverse it and add it at the end of the message.
//o	If not, print "error".This operation should replace only the first occurrence of the given substring
// if there are more than one such occurrences.
                    String substring = tokens[1];
                    String string = input.toString();
                    if (string.contains(substring)) {
                        int indexSubstring = string.indexOf(substring);
                        input.delete(indexSubstring, indexSubstring + substring.length());
                        input.append(new StringBuilder(substring).reverse());
                        System.out.println(input.toString());
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
//	ChangeAll:|:{substring}:|:{replacement}-changes all occurrences of the given substring with the replacement text.
                    String substringToChange = tokens[1];
                    String replacement = tokens[2];
                    String inputStr = input.toString();
                    if (inputStr.contains(substringToChange)) {
                        inputStr = inputStr.replace(substringToChange, replacement);
                        input = new StringBuilder(inputStr);
                        System.out.println(inputStr);
                        break;
                    }
            }
            command = scanner.nextLine();
        }
        System.out.println("You have a new text message: " + input.toString());
    }
}
