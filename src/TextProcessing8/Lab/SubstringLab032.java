package TextProcessing8.Lab;

import java.util.Scanner;

public class SubstringLab032 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wordToRemove = scanner.nextLine();
        String input = scanner.nextLine();

        while (input.contains(wordToRemove)) {
            input = input.replace(wordToRemove, "");
        }
        System.out.println(input);
    }
}
