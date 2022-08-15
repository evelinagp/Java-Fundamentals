package TextProcessing8;

import java.util.Scanner;

public class WinningTicketME06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().replace(" ", "");
        String[] tickets = input.split(",");

        for (int i = 0; i < tickets.length; i++) {
            String currentTicket = tickets[i];
            if (currentTicket.length() != 20) {
                System.out.println("invalid ticket");
            } else {
                if (currentTicket.contains("@") || currentTicket.contains("#") ||
                        currentTicket.contains("$") || currentTicket.contains("^")) {

                    int count = 0;
                    int count2 = 0;
                    String symbol = "";
                    String symbol2 = "";
                    for (int j = 0; j < currentTicket.length() / 2; j++) {
                        if (currentTicket.charAt(j) == '@') {
                            count++;
                            symbol += '@';
                        } else if (currentTicket.charAt(j) == '#') {
                            count++;
                            symbol += '#';
                        } else if (currentTicket.charAt(j) == '$') {
                            count++;
                            symbol += '$';
                        } else if (currentTicket.charAt(j) == '^') {
                            count++;
                            symbol += '^';
                        }
                    }
                    for (int j = currentTicket.length() / 2; j < currentTicket.length(); j++) {
                        if (currentTicket.charAt(j) == '@') {
                            count2++;
                            symbol2 += '@';
                        } else if (currentTicket.charAt(j) == '#') {
                            count2++;
                            symbol2 += '#';
                        } else if (currentTicket.charAt(j) == '$') {
                            count2++;
                            symbol2 += '$';
                        } else if (currentTicket.charAt(j) == '^') {
                            count2++;
                            symbol2 += '^';

                        }
                    }
                    if ((count2 >= 6 && count2 <= 9) && (count == count2) && (symbol.equals(symbol2))) {
                        System.out.println("ticket " + "\"" + currentTicket + "\"" + " - " + count + symbol.charAt(0));
                    } else if (count == 10 && count2 == 10 && symbol.equals(symbol2)) {
                        System.out.println("ticket " + "\"" + currentTicket + "\"" + " - " + count + symbol.charAt(0) + " Jackpot!");
                    }
                } else {
                    System.out.println("ticket " + "\"" + currentTicket + "\"" + " - no match");
                }
            }
        }
    }
}


