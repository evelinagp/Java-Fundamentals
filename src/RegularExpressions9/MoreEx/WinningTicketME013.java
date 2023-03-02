package RegularExpressions9.MoreEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WinningTicketME013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().replace(" ", "");
        String[] tickets = input.split(",");
        for (String ticket : tickets) {
            //            String regex = "w*(?<symbol1>[@|#|$|^]{6,10})\\w*(?<symbol2>[@|#|$|^]{6,10})\\w*";
            String regex = "\\w*(?<symbol1>[@#$^]{6,10})\\w*(?<symbol2>[@#$^]{6,10})\\w*";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(ticket);
            if (ticket.length() != 20) {
                System.out.println("invalid ticket");
            } else {
                if (matcher.find()) {
                    String symbol1 = matcher.group("symbol1");
                    String symbol2 = matcher.group("symbol2");
                    if (symbol1.equals(symbol2) && (symbol1.length() >= 6 && symbol1.length() <= 9)) {
                        System.out.println("ticket " + "\"" + ticket + "\"" + " - " + symbol1.length() + symbol1.charAt(0));
                    } else if (symbol1.equals(symbol2) && symbol1.length() == 10) {
                        System.out.println("ticket " + "\"" + ticket + "\"" + " - " + symbol1.length() + symbol1.charAt(0) + " Jackpot!");
                    } else {
//                    } else if (!symbol1.equals(symbol2) || (symbol1.length() >= 0 && symbol1.length() <= 5) && (symbol2.length() >= 0 && symbol2.length() <= 5)){
                        System.out.println("ticket " + "\"" + ticket + "\"" + " - no match");
                    }
                } else {
                    System.out.println("ticket " + "\"" + ticket + "\"" + " - no match");
                }
            }
        }
    }
}


