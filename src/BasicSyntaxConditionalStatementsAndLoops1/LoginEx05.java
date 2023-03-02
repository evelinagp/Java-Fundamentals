package BasicSyntaxConditionalStatementsAndLoops1;

import java.util.Scanner;

public class LoginEx05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();

        StringBuilder password = new StringBuilder();
        for (int i = username.length() - 1; i >= 0; i--) {
            char letter = username.charAt(i);
            password.append(letter);
        }
        int counter = 0;
        while (counter < 4) {
            String input = scanner.nextLine();
            if (input.equals(password.toString())) {
                System.out.printf("User %s logged in.", username);
                return;
            } else if (counter < 3) {
                System.out.println("Incorrect password. Try again.");
            }
            counter++;
        }
        if (counter == 4) {
            System.out.printf("User %s blocked!", username);
        }
    }
}
