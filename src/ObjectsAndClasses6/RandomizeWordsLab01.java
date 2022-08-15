package ObjectsAndClasses6;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWordsLab01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split("\\s+");

        Random randomGenerator = new Random();
        for (int i = 0; i < words.length; i++) {

            int x = randomGenerator.nextInt(words.length);
            int y = randomGenerator.nextInt(words.length);
            String oldWordsX = words[x];
            words[x] = words[y];
            words[y] = oldWordsX;
        }
        for (String word : words) {
            System.out.println(word);
        }
    }
}
