package RegularExpressions9.MoreEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RageQuitME02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        String digitRegex = "[0-9]+";
        Pattern digitPattern = Pattern.compile(digitRegex);
        Matcher digitMatcher = digitPattern.matcher(input);

        int symbolsCounter = 0;
        String text = "";
        int numbersCounter = 0;
        for (int i = 0; i < input.length(); i++) {

            if ((!Character.isUpperCase(input.charAt(i)) && (!Character.isDigit(input.charAt(i))))) {
                symbolsCounter++;
            }
        }

        int previousIndex = 0;
        while (digitMatcher.find()) {
            String currentDigit = digitMatcher.group();
            numbersCounter++;
            int currentDigitIndex = input.indexOf(currentDigit);
            int currentNumber = Integer.parseInt(currentDigit);
            if (numbersCounter == 1) {
                String substring = input.substring(previousIndex, currentDigitIndex).toUpperCase();
                for (int j = 0; j < currentNumber; j++) {
                    text += substring;
                }
            } else {
                if (currentDigit.length() == 1) {
                    String substring = input.substring(previousIndex + 1, currentDigitIndex).toUpperCase();
                    for (int j = 0; j < currentNumber; j++) {
                        text += substring;
                    }
                }else if (currentDigit.length() == 2){
                    String substring = input.substring(previousIndex + 2, currentDigitIndex).toUpperCase();
                    for (int j = 0; j < currentNumber; j++) {
                        text += substring;
                    }
                }
            }
            previousIndex = currentDigitIndex;
        }

        System.out.println("Unique symbols used: " + symbolsCounter);
        System.out.println(text);
    }
}
