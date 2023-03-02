package RegularExpressions9.Lab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullNameLab01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String listOfNames = scanner.nextLine();

        String regex = "\\b[A-Z][a-z]+ [A-Z][a-z]+\\b";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(listOfNames);

        while (matcher.find()){
            System.out.print(matcher.group() +" ");
        }
    }
}
