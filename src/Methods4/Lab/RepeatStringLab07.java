package Methods4.Lab;

import java.util.Scanner;

public class RepeatStringLab07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        int repetition = Integer.parseInt(scanner.nextLine());

        String result = repeatString (string, repetition);

        System.out.println(result);

    }

    private static String repeatString(String string, int repetition) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < repetition; i++) {
            result.append(string);
        }
            return result.toString();
    }
}
//The method should return a new string (the old one repeated n times)