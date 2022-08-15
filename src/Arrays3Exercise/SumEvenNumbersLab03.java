package Arrays3Exercise;

import java.util.Scanner;

public class SumEvenNumbersLab03 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] numbersAsStrings = line.split(" ");

        int[] numbers = new int[numbersAsStrings.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(numbersAsStrings[i]);
        }
        int evenSum = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenSum += number;
            }
        }
        System.out.println(evenSum );
    }
}

