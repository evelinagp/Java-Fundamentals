package Arrays3.Ex;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElementsEx072 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(element -> Integer.parseInt(element)).toArray();

        int counter = 1;
        int maxCount = 0;
        int digit = 0;

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] == numbers[i - 1]) {
                counter++;

                if (counter > maxCount) {
                    maxCount = counter;
                    digit = numbers[i];
                }
            } else {
                counter = 1;
            }
        }
        for (int i = 0; i < maxCount; i++) {

            System.out.print(digit + " ");
        }
    }
}
