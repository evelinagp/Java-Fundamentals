package Methods4;

import java.util.Scanner;

public class VowelsCountEx02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();

        printCountOfVowels(string);
    }

    private static void printCountOfVowels(String string) {

        int counter = 0;
        for (int i = 0; i < string.length(); i++) {
            char symbol = string.charAt(i);
            if (symbol == 'a' || symbol == 'o' || symbol == 'u' || symbol == 'e' || symbol == 'i') {
                counter++;
            }else if (symbol == 'A' || symbol == 'O' || symbol == 'U' || symbol == 'E' || symbol == 'I') {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
