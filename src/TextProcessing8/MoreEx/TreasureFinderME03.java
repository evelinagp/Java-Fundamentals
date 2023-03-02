package TextProcessing8.MoreEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TreasureFinderME03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(element -> Integer.parseInt(element)).toArray();
        List<Integer> list = new ArrayList<>();


        String sentence = scanner.nextLine();
        StringBuilder decryptedSentence = new StringBuilder();
        while (!sentence.equals("find")) {
            Arrays.stream(numbers).forEach(e -> list.add(e));
            if (sentence.length() > numbers.length) {
                for (int i = 0; i < numbers.length; i++) {
                    if (sentence.length() > list.size()) {
                        list.add(numbers[i]);
                    } else if (sentence.length() == list.size()) {
                        break;
                    }
                    if (i == numbers.length - 1) {
                        i = -1;
                    }
                }
                for (int j = 0; j < sentence.length(); j++) {
                    char currentSymbol = sentence.charAt(j);
                    int currentNumber = list.get(j);

                    currentSymbol -= currentNumber;
                    decryptedSentence.append(currentSymbol);
                }
                String decryptedString = decryptedSentence.toString();
                String regex = "[A-Za-z]+&(?<type>[A-Za-z]+)&[A-Za-z]+<(?<coordinates>[0-9A-Za-z]+)>";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(decryptedString);
                if (matcher.find()) {
                    String type = matcher.group("type");
                    String coordinates = matcher.group("coordinates");
                    System.out.printf("Found %s at %s%n", type, coordinates);
                }
                decryptedSentence.delete(0, decryptedSentence.length());
                list.removeAll(list);
                sentence = scanner.nextLine();
            }
        }
    }
}


