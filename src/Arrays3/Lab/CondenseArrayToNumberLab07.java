package Arrays3.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumberLab07 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(element -> Integer.parseInt(element)).toArray();

        int initialLength = numbers.length;
        int finalResult = 0;
        while (initialLength > 1) {
            for (int i = 0; i < initialLength; i++) {
                int[] condensed = new int[initialLength - 1];
                for (int j = 0; j < condensed.length; j++) {
                    condensed[j] = numbers[j] + numbers[j + 1];
                }
                numbers = condensed;
                finalResult = condensed[0];
                initialLength--;
            }
        }
        if (numbers.length <= 1) {
            System.out.print(numbers[0]);
        } else {
            System.out.println(finalResult);
        }
    }
}



