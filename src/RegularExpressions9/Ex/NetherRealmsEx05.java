package RegularExpressions9.Ex;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class NetherRealmsEx05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regexLetters = "[a-zA-Z]*[^\\s\\d.+\\-*/]*";
        String regexDigits = "[\\-]*[0-9]+[.]*[0-9]*";
        String regexDemonName = "[^\\s]*";

        Pattern patternDemonName = Pattern.compile(regexDemonName);
        Pattern patternLetters = Pattern.compile(regexLetters);
        Pattern patternDigits = Pattern.compile(regexDigits);

        Map<String, double[]> demonsInfo = new TreeMap<>();

        double digits = 0;
        double damage = 0;
        int demonHealth = 0;

        String[] names = scanner.nextLine().split(",");
        for (int i = 0; i < names.length; i++) {
            String input = names[i].trim();

            Matcher matcherDemonName = patternDemonName.matcher(input);
            while (matcherDemonName.find()) {
                String name = matcherDemonName.group();
                demonsInfo.put(name, new double[]{demonHealth, damage});
            }

            Matcher matcherLetters = patternLetters.matcher(input);
            while (matcherLetters.find()) {
                String daemon = matcherLetters.group();
                for (int j = 0; j < daemon.length(); j++) {
                    int currentSymbol = daemon.charAt(j);
                    demonHealth += currentSymbol;
                }
            }
            Matcher matcherDigits = patternDigits.matcher(input);
            while (matcherDigits.find()) {
                double currentDigit = Double.parseDouble(matcherDigits.group());
                digits += currentDigit;
            }
            for (int k = 0; k < input.length(); k++) {
                int currentSymbol = input.charAt(k);
                if (currentSymbol == '*') {
                    damage += digits * 2;
                } else if (currentSymbol == '/') {
                    damage += digits / 2;
                }
            }
        }
        for (Map.Entry<String, double[]> entry : demonsInfo.entrySet()) {
            System.out.printf("%s - %d health, %.2f damage%n",
                    entry.getKey(), (int) entry.getValue()[0], entry.getValue()[1]);
        }
    }
}



