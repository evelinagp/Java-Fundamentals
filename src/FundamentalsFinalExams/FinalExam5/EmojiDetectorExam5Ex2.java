package FundamentalsFinalExams.FinalExam5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetectorExam5Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String numberRegex = "\\d";
        String emojiRegex = "(?<separator>[\\*:])\\1(?<emoji>[A-Z][a-z]{2,})\\1\\1";

        Pattern numberPattern = Pattern.compile(numberRegex);
        Matcher numberMatcher = numberPattern.matcher(input);

        List<Integer> numbersList = new ArrayList<>();
        while (numberMatcher.find()) {
            int number = Integer.parseInt(numberMatcher.group());
            numbersList.add(number);
        }
        long coolnes = numbersList.stream().reduce(1, (a, b) -> a * b);
        System.out.printf("Cool threshold: %d%n", coolnes);

        Pattern emojiPattern = Pattern.compile(emojiRegex);
        Matcher emojiMatcher = emojiPattern.matcher(input);

        List<String> coolEmojis = new ArrayList<>();
        int countOfEmojis = 0;
        while (emojiMatcher.find()) {
            countOfEmojis ++;
            String separator = emojiMatcher.group("separator");
            String emojiText = emojiMatcher.group("emoji");
            if (isEmojiCool(emojiText, coolnes)) {
                String fullEmoji = separator + separator + emojiText + separator + separator;
                coolEmojis.add(fullEmoji);

            }
        }
        System.out.printf("%d emojis found in the text. The cool ones are:%n", countOfEmojis);
        coolEmojis.stream().forEach(System.out::println);
    }

    public static boolean isEmojiCool(String emojiText, long coolnessThreshold) {
        long emojiCoolness = 0;
        for (int i = 0; i < emojiText.length(); i++) {
            int emojiCharacter = emojiText.charAt(i);
            emojiCoolness += emojiCharacter;
        }
        boolean isEmojiCool = emojiCoolness >= coolnessThreshold;
        return isEmojiCool;
    }
}
