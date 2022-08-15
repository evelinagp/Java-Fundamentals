package FINALEXAM;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String regex = "^(\\$|%)(?<tag>[A-Z][a-z]{3,})\\1:\\s(\\[(?<number1>[0-9]+)]\\|\\[(?<number2>[0-9]+)]\\|\\[(?<number3>[0-9]+)]\\|){1,3}$";
        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            StringBuilder sb = new StringBuilder();
                if (matcher.find()){
                    String tag = matcher.group("tag");
                    char number1 = (char)Integer.parseInt(matcher.group("number1"));
                    char number2 = (char)Integer.parseInt(matcher.group("number2"));
                    char number3 = (char)Integer.parseInt(matcher.group("number3"));
                    sb.append(number1);
                    sb.append(number2);
                    sb.append(number3);
                    System.out.println(tag + ": "+ sb.toString());
                }else{
                    System.out.println("Valid message not found!");
                }

        }
    }
}
