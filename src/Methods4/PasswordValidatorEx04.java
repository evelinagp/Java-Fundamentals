package Methods4;

import java.util.Scanner;

public class PasswordValidatorEx04 {


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
//            if (symbol >= 48 && symbol <= 57) {
            if (Character.isDigit(symbol)){
                counter++;
            }
        }
        return counter >= 2;
    }


    private static boolean checkIfConsistsOnlyLettersAndDigits(String password) {

        for (int i = 0; i < password.length(); i++) {
            int symbol = password.charAt(i);
//            if (!((symbol >= 65 && symbol <= 90) || (symbol >= 97 && symbol <= 122) || (symbol >= 48 && symbol <= 57))) {
            if (!Character.isLetterOrDigit(symbol)){
                return false;
            }
        }
        return true;
    }

    private static boolean checkIfIsBetween(String password) {

        return password.length() >= 6 && password.length() <= 10;

    }
}

