package Methods4;

import java.util.Scanner;

public class MiddleCharactersEx06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();

        printMiddleCharacters(string);

    }

    private static void printMiddleCharacters(String string) {
        int length = string.length();
        if (length % 2 == 0) {
            char symbol1 = string.charAt((length / 2) - 1);
            char symbol2 = string.charAt((length / 2));
            System.out.printf("%c%c", symbol1, symbol2);
        } else {
            char symbol = string.charAt((length / 2));
            System.out.println(symbol);
        }
    }
}

