package Methods4;

import java.util.Scanner;

public class PasswordValidatorEx043 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        checkIfIsBetween(password);
        checkIfConsistsOnlyLettersAndDigits(password);
        checkIfHaveAtLeast2Digits(password);

        if (checkIfIsBetween(password) && checkIfConsistsOnlyLettersAndDigits(password) && checkIfHaveAtLeast2Digits(password)) {
            System.out.println("Password is valid");
        } else {
            if (!checkIfIsBetween(password)) {
                System.out.println("Password must be between 6 and 10 characters");
            }
            if (!checkIfConsistsOnlyLettersAndDigits(password)) {
                System.out.println("Password must consist only of letters and digits");
            }
            if (!checkIfHaveAtLeast2Digits(password)) {
                System.out.println("Password must have at least 2 digits");
            }
        }

    }

    private static boolean checkIfHaveAtLeast2Digits(String password) {
        int counter = 0;
        for (int i = 0; i < password.length(); i++) {
            int symbol = password.charAt(i);
            boolean isDigit = Character.isDigit(symbol);
            if (isDigit){
                counter++;
            }
        }
        if (counter >= 2) {
            return true;

        }
        return false;
    }


    private static boolean checkIfConsistsOnlyLettersAndDigits(String password) {

        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            boolean isLetter = Character.isLetter(symbol);
            boolean isDigit = Character.isDigit(symbol);
            if (!isLetter && !isDigit) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkIfIsBetween(String password) {

        return password.length() >= 6 && password.length() <= 10;

    }
}


