package TextProcessing8;

import java.util.Scanner;

public class AsciiSumatorME02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);
        String string = scanner.nextLine();

        int sum = 0;
        for (int i = 0; i < string.length(); i++) {
            char currentSymbol = string.charAt(i);
            if (currentSymbol > first && currentSymbol < second) {
                sum += currentSymbol;
            }
        }
        System.out.println(sum);
    }
}
