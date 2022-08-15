package RegularExpressions9;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RageQuitME02OK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String strInput = sc.nextLine().toUpperCase();
        Pattern p = Pattern.compile("(\\D+\\d+)");

        String result = "";
        String unique = "";
        String letters = strInput.replaceAll("[\\d]", "");
        for (int i = 0; i < letters.length(); i++) {
            if (unique.indexOf(letters.charAt(i)) < 0) {
                unique = unique + letters.charAt(i);
            }
        }
        Matcher m = p.matcher(strInput);
        while (m.find()) {
            String token = m.group();
            int repeatCount = Integer.parseInt(token.replaceAll("\\D", ""));
            String lettersToken = token.replaceAll("\\d", "");
            for (int r = 0; r < repeatCount; r++) {
                result +=lettersToken;
            }
        }
        System.out.printf("Unique symbols used: %d%n", unique.length());
        System.out.println(result);
    }
}

