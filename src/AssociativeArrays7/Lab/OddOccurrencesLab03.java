package AssociativeArrays7.Lab;

import java.util.*;

public class OddOccurrencesLab03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        LinkedHashMap<String, Integer> counts = new LinkedHashMap<>();

        for (String word : words) {
            String wordInLowerCase = word.toLowerCase();
            if (counts.containsKey(wordInLowerCase)) {
                counts.put(wordInLowerCase, counts.get(wordInLowerCase) + 1);
            } else {
                counts.put(wordInLowerCase, 1);
            }
        }
        ArrayList<String> odds = new ArrayList<>();

        for (var entry : counts.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                odds.add(entry.getKey());
            }
        }
        System.out.println(String.join(", ", odds));
    }
}

