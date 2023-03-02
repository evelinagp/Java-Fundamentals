package RegularExpressions9.Ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigmaEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
//       Броят на тези символи SsTtAaRr
        List<String> attacked = new ArrayList<>();
        List<String> destroyed = new ArrayList<>();

//      Всяка една буква от съобщението - Броят на тези символи SsTtAaRr-3 => Декриптирано
        for (int i = 0; i < count; i++) {
            String encryptedMessage = scanner.nextLine();
            int countSpecialLetters = getSpecialLetters(encryptedMessage);
            String decryptedMessage = getDecryptedMessage(encryptedMessage, countSpecialLetters);


            String regex = "@(?<planetName>[a-zA-Z]+)[^@!:>-]*:(?<population>[0-9]+)[^@!:>-]*!(?<attack>[AD])![^@!:>-]*->(?<soldiersCount>[0-9]+)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(decryptedMessage);
            if (matcher.find()) {
                String planet = matcher.group("planetName");
                String typeOfAttack = matcher.group("attack");
                if (typeOfAttack.equals("A")) {
                    attacked.add(planet);
                } else if (typeOfAttack.equals("D")) {
                    destroyed.add(planet);
                }
            }
        }
        printOutput(attacked, destroyed);
    }

    private static void printOutput(List<String> attacked, List<String> destroyed) {
        Collections.sort(attacked);
        Collections.sort(destroyed);
        System.out.println("Attacked planets: " + attacked.size());
        if (!attacked.isEmpty()) {
            attacked.forEach(p -> System.out.println("-> " + p));
        }
        System.out.println("Destroyed planets: " + destroyed.size());
        if (!destroyed.isEmpty()) {
            destroyed.forEach(p -> System.out.println("-> " + p));
        }
    }

    private static String getDecryptedMessage(String encryptedMessage, int countSpecialLetters) {
        StringBuilder decryptedMessage = new StringBuilder();
        for (int i = 0; i < encryptedMessage.length(); i++) {
            char currentSymbol = encryptedMessage.charAt(i);
            decryptedMessage.append((char) (currentSymbol - countSpecialLetters));
        }
        return decryptedMessage.toString();
    }


    private static int getSpecialLetters(String encryptedMessage) {
        int count = 0;
        String regexSpecialLetter = "[SsTtAaRr]";
        Pattern pattern = Pattern.compile(regexSpecialLetter);
        Matcher matcher = pattern.matcher(encryptedMessage);
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}

