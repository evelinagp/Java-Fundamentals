package TextProcessing8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TreasureFinderME032 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(element -> Integer.parseInt(element)).toArray();

        List<Integer> keyInSameLengthAsTreasureCode = new ArrayList<>();
        String command = scanner.nextLine();

        StringBuilder sb = new StringBuilder();

        int counter = 0;

        while (!command.equals("find")) {

            String treasureCode = command;

            if (numbers.length < treasureCode.length()) {
                for (int i = 0; i < numbers.length; i++) {
                    if (treasureCode.length() > keyInSameLengthAsTreasureCode.size()) {
                        keyInSameLengthAsTreasureCode.add(numbers[i]);
                        counter++;
                    } else if (treasureCode.length() == keyInSameLengthAsTreasureCode.size()) {
                        break;
                    }
                    if (counter == numbers.length) {
                        i = -1;
                        counter = 0;
                    }
                }

                for (int i = 0; i < treasureCode.length(); i++) {
                    int currentSymbol = treasureCode.charAt(i);

                    int currentKey = keyInSameLengthAsTreasureCode.get(i);
                    int newSymbol = currentSymbol - currentKey;
                    char symbolInChar = (char) (newSymbol);
                    sb.append(symbolInChar);
                }
            } else if (numbers.length == treasureCode.length()) {
                for (int i = 0; i < treasureCode.length(); i++) {
                    int currentSymbol = treasureCode.charAt(i);
                    int currentKey = numbers[i];
                    int newSymbol = currentSymbol - currentKey;
                    char symbolInChar = (char) (newSymbol);
                    sb.append(symbolInChar);
                }
            }

            String ouput = sb.toString();
            int indexBeforeTheTreasure = ouput.indexOf('&');
            int indexAfterOfTheTreasure = ouput.indexOf('&', ouput.indexOf('&') + 1);
            String nameTreasure = ouput.substring(indexBeforeTheTreasure + 1, indexAfterOfTheTreasure);
            int indexBeforeThePlace = ouput.indexOf('<');
            int indexAfterThePlace = ouput.indexOf('>');
            String place = ouput.substring(indexBeforeThePlace + 1, indexAfterThePlace);

            System.out.printf("Found %s at %s%n", nameTreasure, place);
            keyInSameLengthAsTreasureCode.removeAll(keyInSameLengthAsTreasureCode);
            sb.delete(0, sb.length());
            counter = 0;
            command = scanner.nextLine();
        }
    }
}
