package ExamPreparation;

import java.util.Scanner;

public class PasswordResetExam04Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Done")) {
            String[] tokens = command.split("\\s+");
//•	TakeOdd
//Substitute {substring} {substitute}
//•	Cut {index} {length}
            String commandName = tokens[0];
            switch (commandName) {
                case "TakeOdd":
                    password = takeOdd(password);
                    System.out.println(password);
                    break;
                case "Cut":
                    int index = Integer.parseInt(tokens[1]);
                    int length = Integer.parseInt(tokens[2]);
                    String substringToRemove = password.substring(index, index + length);
                    password = password.replaceFirst(substringToRemove, "");
                    System.out.println(password);
                    break;
                case "Substitute":
                    String substring = tokens[1];
                    String substitute = tokens[2];
                    if (password.contains(substring)) {
                        password = password.replace(substring, substitute);
                        System.out.println(password);
                    } else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Your password is: %s", password);
    }
    private static String takeOdd(String password) {
        StringBuilder newPassword = new StringBuilder();
        for (int i = 1; i < password.length(); i += 2) {
            newPassword.append(password.charAt(i));
        }
        return newPassword.toString();
    }
}
