package AssociativeArrays7.Ex;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class CountCharsInAStringEx01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Map<Character, Integer> lettersCounts = new LinkedHashMap<>();
        for (int i = 0; i <= text.length() - 1; i++) {
            char currentSymbol = text.charAt(i);
            if (currentSymbol == ' ') {
                continue;
            }
            if (!lettersCounts.containsKey(currentSymbol)) {
                lettersCounts.put(currentSymbol, 1);
            } else {
                lettersCounts.put(currentSymbol, lettersCounts.get(currentSymbol) + 1);

            }
        }
        for (Map.Entry<Character, Integer> entry : lettersCounts.entrySet()) {

            System.out.printf("%s -> %d%n", (entry.getKey()), entry.getValue());
        }
    }
}


