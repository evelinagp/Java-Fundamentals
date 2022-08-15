package RegularExpressions9;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmailsEx062OK {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regexEmail = "(^| )[A-Za-z0-9]+[A-Za-z.\\-_0-9]*@{1}[A-Za-z._-]+(\\.[a-z]+)+";
//   AnotherRegex = "(^|(?<=\s))(([a-zA-Z0-9]+)([\.\-_]?)([A-Za-z0-9]+)(@)([a-zA-Z]+([\.\-_][A-Za-z]+)+))(\b|(?=\s))";
        Pattern pattern = Pattern.compile(regexEmail);

        String input = scanner.nextLine();
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

