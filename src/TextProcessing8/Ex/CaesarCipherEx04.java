package TextProcessing8.Ex;

import java.util.Scanner;

public class CaesarCipherEx04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        StringBuilder encryptedSentence = new StringBuilder();

        for (int index = 0; index < sentence.length(); index++) {
            char currentSymbol = sentence.charAt(index);
            encryptedSentence.append((char)(currentSymbol +3));

        }
        System.out.println(encryptedSentence.toString());
    }
}
