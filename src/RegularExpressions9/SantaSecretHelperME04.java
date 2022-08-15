package RegularExpressions9;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SantaSecretHelperME04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberToSubtract = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                char currentSymbol = (char) (input.charAt(i) - numberToSubtract);
                sb.append(currentSymbol);
            }
            input = sb.toString();
            String regex = "@(?<name>[A-Za-z]+)[^@\\-!:>]*!(?<behaviour>[G|N])!";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String name = matcher.group("name");
                String behaviour = matcher.group("behaviour");
                if (behaviour.equals("G")) {
                    System.out.println(name);
                }
            }
            input = scanner.nextLine();
        }
    }
}
