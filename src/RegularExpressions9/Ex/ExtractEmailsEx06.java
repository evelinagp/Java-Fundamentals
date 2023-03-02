package RegularExpressions9.Ex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmailsEx06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regexEmail = "((^| )([a-zA-Z0-9]+)([A-Za-z.\\-_0-9]*))([@]{1})([a-zA-Z]+.[a-zA-Z\\-_.]+[\\.\\-_]?([a-zA-Z0-9]+))";
        Pattern pattern = Pattern.compile(regexEmail);

        String input = scanner.nextLine();
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
