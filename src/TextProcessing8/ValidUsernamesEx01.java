package TextProcessing8;

import java.util.Scanner;

public class ValidUsernamesEx01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        String[] usernames = text.split(", ");

        for (String username : usernames) {
//            ако е валиден - печатаме го
            if (isValidUsername(username)) {
                System.out.println(username);

            }
        }
    }

    static boolean isValidUsername(String username) {

        if (username.length() < 3 || username.length() > 16) {
            return false;
        }
//        has length between 3 and 16 characters
        for (int index = 0; index <= username.length() - 1; index++) {
            char currentSymbol = username.charAt(index);
            if (!Character.isLetterOrDigit(currentSymbol) && currentSymbol != '-' && currentSymbol != '_') {
                return false;
            }
        }
        return true;
    }
}
