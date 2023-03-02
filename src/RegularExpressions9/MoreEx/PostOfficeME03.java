package RegularExpressions9.MoreEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PostOfficeME03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\|");
        String firstPart = input[0];
        String secondPart = input[1];
        String thirdPart = input[2];

        String firstPartRegex = "([#$%*&]{1})[A-Z]+\\1";
        String secondPartRegex = "([0-9]{2}):([0-9]{2})";
//        String thirdPartRegex = ".[^\\s]";

        Pattern firstPartPattern = Pattern.compile(firstPartRegex);
        Pattern secondPartPattern = Pattern.compile(secondPartRegex);
//        Pattern thirdPartPattern = Pattern.compile(thirdPartRegex);

        String firstPartLetters = "";
        List<Character> secondPartLetters = new ArrayList<>();
        List<Integer> thirdPartWordsLength = new ArrayList<>();

        Matcher firstPartMatcher = firstPartPattern.matcher(firstPart);
        while (firstPartMatcher.find()) {
            String wordSurroundedWithSymbols = firstPartMatcher.group();
            for (int i = 0; i < wordSurroundedWithSymbols.length(); i++) {
                char currentSymbol = wordSurroundedWithSymbols.charAt(i);
                if (currentSymbol >= 65 && currentSymbol <= 90) {
                    firstPartLetters += currentSymbol;
                }
            }
        }
        Matcher secondPartMatcher = secondPartPattern.matcher(secondPart);
        while (secondPartMatcher.find()) {
            for (int i = 0; i < firstPartLetters.length(); i++) {
                String[] asciiNumberLetterAndLength = secondPartMatcher.group().split(":");
                int asciiNumberLetter = Integer.parseInt(asciiNumberLetterAndLength[0]);
                int length = Integer.parseInt(asciiNumberLetterAndLength[1]);
                char currentSymbolSecondPart = firstPartLetters.charAt(i);
                if ((Character.isUpperCase(asciiNumberLetter)) && ((char) asciiNumberLetter == currentSymbolSecondPart)) {
                    if (!secondPartLetters.contains(currentSymbolSecondPart)) {
                        secondPartLetters.add(currentSymbolSecondPart);
                        thirdPartWordsLength.add(1 + length);
                    }
                }
            }
        }

        String[] thirdPartSplitted = thirdPart.split("\\s+");
        for (int i = 0; i < thirdPartSplitted.length; i++) {
            String currentWord = thirdPartSplitted[i];
            char currentSymbol = currentWord.charAt(0);
            for (int j = 0; j < secondPartLetters.size(); j++) {
                int currentWordLength = thirdPartWordsLength.get(j);
                if (secondPartLetters.get(j) == currentSymbol)
                    if (currentWordLength == currentWord.length()) {
                        System.out.println(currentWord);
                    }
            }
        }
    }
}

