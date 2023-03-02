package TextProcessing8.Ex;

import java.util.Scanner;

public class CharacterMultiplierEx02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        String[] names = scanner.nextLine().split("\\s+");

        String firstName = names[0];
        String secondName = names[1];
        if (firstName.length() == secondName.length()) {
            for (int i = 0; i < firstName.length(); i++) {
                sum += firstName.charAt(i) * secondName.charAt(i);
            }
        } else {
            if (firstName.length() > secondName.length()) {
                for (int i = 0; i < secondName.length(); i++) {
                    sum += firstName.charAt(i) * secondName.charAt(i);
                }
                int secondLength = secondName.length();
                String restSymbols = firstName.substring(secondLength);
                for (int i = 0; i < restSymbols.length(); i++) {
                    sum += restSymbols.charAt(i);
                }
            } else {
                for (int i = 0; i < firstName.length(); i++) {
                    sum += firstName.charAt(i) * secondName.charAt(i);
                }
                int firstLength = firstName.length();
                String restSymbols = secondName.substring(firstLength);
                for (int i = 0; i < restSymbols.length(); i++) {
                    sum += restSymbols.charAt(i);
                }
            }
        }
        System.out.println(sum);
    }
}


