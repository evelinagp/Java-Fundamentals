package TextProcessing8;

import java.util.Scanner;

public class ExtractPersonInformationME01 {
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

                for (int j = 0; j < sentenceWithTheAge.length(); j++) {
                    char currentSymbol = sentenceWithTheAge.charAt(j);
                    if (currentSymbol == 35) {
                        String age = "";
                        while (sentenceWithTheAge.charAt(j + 1) >= 48 && sentenceWithTheAge.charAt(j + 1) <= 57) {
                            age += sentenceWithTheAge.charAt(j + 1);
                            j++;
                        }
                        System.out.printf("%s is %s years old.%n", name, age);
                    }
                }
            } else {
                String[] sentence = string.split(" @");
                String secondElement = sentence[1];
                String[] tokens = secondElement.split("\\| ");
                String name = tokens[0];
                String sentenceWithTheAge = tokens[1];

                for (int j = 0; j < sentenceWithTheAge.length(); j++) {
                    char currentSymbol = sentenceWithTheAge.charAt(j);
                    if (currentSymbol == 35) {
                        String age = "";
                        while (sentenceWithTheAge.charAt(j + 1) >= 48 && sentenceWithTheAge.charAt(j + 1) <= 57) {
                            age += sentenceWithTheAge.charAt(j + 1);
                            j++;
                        }
                        System.out.printf("%s is %s years old.%n", name, age);
                    }
                }
            }
        }
    }
}

