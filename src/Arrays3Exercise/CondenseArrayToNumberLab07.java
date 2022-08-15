package Arrays3Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumberLab07 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(element -> Integer.parseInt(element)).toArray();

        int firstLength = numbers.length;
        int finalResult = 0;
        while (firstLength > 1) {
            for (int i = 0; i < numbers.length; i++) {
                int[] condensed = new int[numbers.length - 1];
                for (int j = 0; j < condensed.length; j++) {
                    condensed[j] = numbers[j] + numbers[j + 1];
                }
                numbers = condensed;
                finalResult = condensed[0];
                firstLength--;
            }
        }
        if (numbers.length <= 1) {
            System.out.print(numbers[0]);
        } else {
            System.out.println(finalResult);
        }
    }
}



