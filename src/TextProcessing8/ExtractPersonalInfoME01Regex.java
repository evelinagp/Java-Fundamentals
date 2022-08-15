package TextProcessing8;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractPersonalInfoME01Regex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String regex = "@(?<name>[A-Z]?[a-z]+)\\|\\s([A-Za-z\\s]+)*#(?<age>\\d+)\\*";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String name = matcher.group("name");
                int age = Integer.parseInt(matcher.group("age"));
                System.out.printf("%s is %d years old.%n", name, age);
            }
        }
    }
}


