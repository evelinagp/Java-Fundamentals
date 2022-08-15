package TextProcessing8;

import java.util.Scanner;

public class ExtractPersonInformationME012 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String string = scanner.nextLine();
            char firstSymbol = string.charAt(0);
            if (firstSymbol == '@') {
                String[] sentence = string.split("@");
                String secondElement = sentence[1];
                String[] tokens = secondElement.split("\\| ");
                String name = tokens[0];
                String sentenceWithTheAge = tokens[1];
                String[] diez = sentenceWithTheAge.split("#");
                String secondPart = diez[1];
                String age = "";
                for (int j = 0; j < secondPart.length(); j++) {
                    char currentSymbol = secondPart.charAt(j);
                    while (Character.isDigit(currentSymbol) && currentSymbol >= 0) {
                        age += currentSymbol;
                        break;
                    }
                }
                System.out.printf("%s is %s years old.%n", name, age);
            } else {
                String[] sentence = string.split(" @");
                String secondElement = sentence[1];
                String[] tokens = secondElement.split("\\| ");
                String name = tokens[0];
                String sentenceWithTheAge = tokens[1];
                String[] diez = sentenceWithTheAge.split("#");
                String secondPart = diez[1];
                String age = "";
                for (int j = 0; j < secondPart.length(); j++) {
                    char currentSymbol = secondPart.charAt(j);
                    while (Character.isDigit(currentSymbol) && currentSymbol >= 0) {
                        age += currentSymbol;
                        break;
                    }
                }
                System.out.printf("%s is %s years old.%n", name, age);
            }
        }
    }
}

