package TextProcessing8.MoreEx;

import java.util.Scanner;

public class MorseCodeTranslatorME04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] words = input.split("\\|");

        for (int i = 0; i < words.length; i++) {
            String currentElement = words[i];
            String[] letters = currentElement.split(" ");
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < letters.length; j++) {
                String currentLetter = letters[j];
                if (currentLetter.equals(".-")) {
                    sb.append("A");
                } else if (currentLetter.equals("-...")) {
                    sb.append("B");
                } else if (currentLetter.equals("-.-.")) {
                    sb.append("C");
                } else if (currentLetter.equals("-..")) {
                    sb.append("D");
                } else if (currentLetter.equals(".")) {
                    sb.append("E");
                } else if (currentLetter.equals("..-.")) {
                    sb.append("F");
                } else if (currentLetter.equals("--.")) {
                    sb.append("G");
                } else if (currentLetter.equals("....")) {
                    sb.append("H");
                } else if (currentLetter.equals("..")) {
                    sb.append("I");
                } else if (currentLetter.equals(".---")) {
                    sb.append("J");
                } else if (currentLetter.equals("-.-")) {
                    sb.append("K");
                } else if (currentLetter.equals(".-..")) {
                    sb.append("L");
                } else if (currentLetter.equals("--")) {
                    sb.append("M");
                } else if (currentLetter.equals("-.")) {
                    sb.append("N");
                } else if (currentLetter.equals("---")) {
                    sb.append("O");
                } else if (currentLetter.equals(".--.")) {
                    sb.append("P");
                } else if (currentLetter.equals("--.-")) {
                    sb.append("Q");
                } else if (currentLetter.equals(".-.")) {
                    sb.append("R");
                } else if (currentLetter.equals("...")) {
                    sb.append("S");
                } else if (currentLetter.equals("-")) {
                    sb.append("T");
                } else if (currentLetter.equals("..-")) {
                    sb.append("U");
                } else if (currentLetter.equals("...-")) {
                    sb.append("V");
                } else if (currentLetter.equals(".--")) {
                    sb.append("W");
                } else if (currentLetter.equals("-..-")) {
                    sb.append("X");
                } else if (currentLetter.equals("-.--")) {
                    sb.append("Y");
                } else if (currentLetter.equals("--..")) {
                    sb.append("Z");
                }
            }
            System.out.printf("%s ", sb);
        }
    }
}

