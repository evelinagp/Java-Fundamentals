package TextProcessing8.Lab;

import java.util.Scanner;

public class SubstringsLab03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String wordToRemove = scanner.nextLine();
        String input = scanner.nextLine();

        while (input.contains(wordToRemove)){
            input = removeOccurrence (input, wordToRemove);
        }
        System.out.println(input);
    }

    private static String removeOccurrence(String input, String wordToRemove) {
            int beginIndex = input.indexOf(wordToRemove);
            int endIndex = beginIndex + wordToRemove.length();

        return input.substring(0, beginIndex) + input.substring(endIndex);
    }
}
