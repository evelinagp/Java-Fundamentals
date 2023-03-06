package FundamentalsFinalExams.FinalExam3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWordsExam03Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "(?<symbols>[#?@?]{1})(?<words>[A-Za-z]{3,})\\1\\1(?<reversedWords>[A-Za-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        List<String> mirrorWords = new ArrayList<>();
        int pairsCounter = 0;
        int mirrorWordsCounter = 0;
        while (matcher.find()) {
            pairsCounter++;
            String words1 = matcher.group("words");
            StringBuilder reversedWords = new StringBuilder(matcher.group("reversedWords"));
            if (words1.equals(reversedWords.reverse().toString())) {
                mirrorWordsCounter++;
                mirrorWords.add(words1 + " <=> " + reversedWords.reverse().toString());
            }
        }
        if (pairsCounter > 0) {
            System.out.println(pairsCounter + " word pairs found!");
        } else {
            System.out.println("No word pairs found!");
        }
        if (mirrorWordsCounter > 0) {
            System.out.println("The mirror words are:");
            System.out.print(String.join(", ", mirrorWords));
//            for (int i = 0; i < mirrorWords.size(); i++) {
//                if (i % 2 == 0) {
//                    System.out.print(mirrorWords.get(i) + " <=> ");
//                } else {
//                    if (i != mirrorWords.size() - 1) {
//                        System.out.print(mirrorWords.get(i) + ", ");
//                    } else {
//                        System.out.print(mirrorWords.get(mirrorWords.size() - 1));
//                    }
//                }
//            }

        } else {
            System.out.println("No mirror words!");
        }
    }
}
